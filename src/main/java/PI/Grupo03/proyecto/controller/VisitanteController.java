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

import PI.Grupo03.proyecto.interfaceService.IDepartamentoService;
import PI.Grupo03.proyecto.interfaceService.IVisitanteService;
import PI.Grupo03.proyecto.modelo.Departamento;
import PI.Grupo03.proyecto.modelo.Propietario;
import PI.Grupo03.proyecto.modelo.Visitante;

@Controller
@RequestMapping
public class VisitanteController {

	@Autowired
	private IVisitanteService Visitanteservice;
	
	@Autowired
	private IDepartamentoService Departamentoservice;
	
	@GetMapping("/listarVisitante")
	public String listar(Model model) {
		List<Visitante>visitantes=Visitanteservice.listar();
		model.addAttribute("visitantes", visitantes);
		return "visitante";
		
	}
	
	@GetMapping("/newVisitante")
	public String agregar(Model model) {
		List<Departamento> listar = Departamentoservice.listar();
		model.addAttribute("visitante", new Visitante());
		model.addAttribute("departamentos", listar);
		return "form_visitante";
	}
	
	@PostMapping("/saveVisitante")
	public String save(Visitante v, Model model) {
		Visitanteservice.save(v);
		return "redirect:/listarVisitante";
	}
	
	@GetMapping("/editarVisitante/{idVisitante}")	
	public String editar(@PathVariable int idVisitante ,Model model) {
		List<Departamento> listar = Departamentoservice.listar();
		Optional<Visitante>visitante=Visitanteservice.listarId(idVisitante);
		model.addAttribute("visitante", visitante);
		model.addAttribute("departamentos", listar);
		return "form_visitante";
	}
	
	@GetMapping("/eliminarVisitante/{idVisitante}")	
	public String delete(Model model, @PathVariable int idVisitante) {	
		Visitanteservice.delete(idVisitante);
		return "redirect:/listarVisitante";
	}

	
}
