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
import PI.Grupo03.proyecto.interfaceService.IVisitaService;
import PI.Grupo03.proyecto.interfaceService.IVisitanteService;
import PI.Grupo03.proyecto.modelo.Propietario;
import PI.Grupo03.proyecto.modelo.Visita;
import PI.Grupo03.proyecto.modelo.Visitante;

@Controller
@RequestMapping
public class VisitaController {

	@Autowired
	private IVisitaService service;
	
	@Autowired
	private IPropietarioService Propietarioservice;
	
	@Autowired
	private IVisitanteService Visitanteservice;
	
	@GetMapping("/listarVisita")
	public String listar(Model model) {
		List<Visita>visitas=service.listar();
		model.addAttribute("visitas", visitas);
		return "visita";
		
	}
	
	@GetMapping("/newVisita")
	public String agregar(Model model) {
		List<Propietario> listarPropietario = Propietarioservice.listar();
		List<Visitante> listarVisitante = Visitanteservice.listar();
		model.addAttribute("visita", new Visita());
		model.addAttribute("propietarios", listarPropietario);
		model.addAttribute("visitantes", listarVisitante);
		return "form_visita";
	}
	
	@PostMapping("/saveVisita")
	public String save(Visita v, Model model) {
		service.save(v);
		return "redirect:/listarVisita";
	}
	
	@GetMapping("/salidaVisita/{idVisita}")	
	public String editar(@PathVariable int idVisita ,Model model) {
		List<Propietario> listarPropietario = Propietarioservice.listar();
		List<Visitante> listarVisitante = Visitanteservice.listar();
		Optional<Visita>visita=service.listarId(idVisita);
		model.addAttribute("visita", visita);
		model.addAttribute("propietarios", listarPropietario);
		model.addAttribute("visitantes", listarVisitante);
		return "form_visitasalida";
	}
	
	@GetMapping("/eliminarVisita/{idVisita}")	
	public String delete(Model model, @PathVariable int idVisita) {	
		service.delete(idVisita);
		return "redirect:/listarVisita";
	}
	
	
}
