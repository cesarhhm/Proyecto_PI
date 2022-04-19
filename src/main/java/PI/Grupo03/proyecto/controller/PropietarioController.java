package PI.Grupo03.proyecto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import PI.Grupo03.proyecto.interfaceService.IPropietarioService;
import PI.Grupo03.proyecto.modelo.Propietario;

@Controller
@RequestMapping
public class PropietarioController {
	
	@Autowired
	private IPropietarioService service;
	
	@GetMapping("/listarPropietario")
	public String listar(Model model) {
		List<Propietario>propietarios=service.listar();
		model.addAttribute("propietarios", propietarios);
		return "propietario";
		
	}
	
	@GetMapping("/newPropietario")
	public String agregar(Model model) {
		model.addAttribute("propietario", new Propietario());
		return "form_propietario";
	}
	
	@PostMapping("/savePropietario")
	public String save(Propietario d, Model model) {
		service.save(d);
		return "redirect:/listarPropietario";
	}
	
	@GetMapping("/editarPropietario/{idPropietario}")	
	public String editar(@PathVariable int idPropietario ,Model model) {
		Optional<Propietario>propietario=service.listarId(idPropietario);
		model.addAttribute("propietario", propietario);
		return "form_propietario";
	}
	
	@GetMapping("/eliminarPropietario/{idPropietario}")	
	public String delete(Model model, @PathVariable int idPropietario) {
		service.delete(idPropietario);
		return "redirect:/listarPropietario";
	}


}
