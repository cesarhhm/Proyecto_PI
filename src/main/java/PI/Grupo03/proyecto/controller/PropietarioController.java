package PI.Grupo03.proyecto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import PI.Grupo03.proyecto.interfaceService.IPropietarioService;
import PI.Grupo03.proyecto.modelo.Propietario;

public class PropietarioController {
	@Autowired
	private IPropietarioService service;
	
	@GetMapping("/listarpro")
	public String listaPropietario(Model model) {
		List<Propietario>propietarios=service.listaPropietario();
		model.addAttribute("propietarios", propietarios);
		return "propietario";
	}
	
	@GetMapping("/nuevopro")
	public String agregar(Model model) {
		model.addAttribute("propietario", new Propietario());
		return "form_propietario";
	}
	
	@PostMapping("/grabarpro")
	public String save(Propietario d, Model model) {
		service.save(d);
		return "redirect:/listarpro";
	}
	
	@GetMapping("/editar/{idPropietario}")	
	public String editar(@PathVariable int idPropietario ,Model model) {
		Optional<Propietario>propietario=service.listarId(idPropietario);
		model.addAttribute("propietario", propietario);
		return "form_propietario";
	}
	
	@GetMapping("/eliminar/{idPropietario}")	
	public String delete(Model model, @PathVariable int idPropietario) {
		service.delete(idPropietario);
		return "redirect:/listar";
	}
	
	
}
