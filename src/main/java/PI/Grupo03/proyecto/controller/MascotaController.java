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
import org.springframework.web.bind.annotation.ResponseBody;

import PI.Grupo03.proyecto.interfaceService.IMascotaService;
import PI.Grupo03.proyecto.interfaceService.IPropietarioService;
import PI.Grupo03.proyecto.modelo.Edificio;
import PI.Grupo03.proyecto.modelo.Mascota;
import PI.Grupo03.proyecto.modelo.Propietario;

@Controller
@RequestMapping
public class MascotaController {

	@Autowired
	private IMascotaService Mascotaservice;
	
	@Autowired
	private IPropietarioService Propietarioservice;
	
	
	@GetMapping("/listarMascota")
	public String listar(Model model) {
		List<Mascota>mascotas=Mascotaservice.listar();
		model.addAttribute("mascotas", mascotas);
		return "mascota";
		
	}
	

	@GetMapping("/newMascota")
	public String agregar(Model model) {
		List<Propietario> listar = Propietarioservice.listar();
		model.addAttribute("mascota", new Mascota());
		model.addAttribute("propietarios", listar);
		return "form_mascota";
	}
	
	@PostMapping("/saveMascota")
	public String save(Mascota d, Model model) {
		Mascotaservice.save(d);
		return "redirect:/listarMascota";
	}
	
	@GetMapping("/editarMascota/{idMascota}")	
	public String editar(@PathVariable int idMascota ,Model model) {
		List<Propietario> listar = Propietarioservice.listar();
		Optional<Mascota>mascota=Mascotaservice.listarId(idMascota);
		model.addAttribute("mascota", mascota);
		model.addAttribute("propietarios", listar);
		return "form_mascota";
	}
	
	@GetMapping("/eliminarMascota/{idMascota}")	
	public String delete(Model model, @PathVariable int idMascota) {
		Mascotaservice.delete(idMascota);
		return "redirect:/listarMascota";
	}

	
}
