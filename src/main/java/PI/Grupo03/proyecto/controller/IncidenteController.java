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
import PI.Grupo03.proyecto.interfaceService.IIncidenteService;
import PI.Grupo03.proyecto.modelo.CausaIncidente;
import PI.Grupo03.proyecto.modelo.Departamento;
import PI.Grupo03.proyecto.modelo.Edificio;
import PI.Grupo03.proyecto.modelo.Incidente;
import PI.Grupo03.proyecto.modelo.Propietario;
import PI.Grupo03.proyecto.modelo.Visita;
import PI.Grupo03.proyecto.modelo.Visitante;
import PI.Grupo03.proyecto.interfaceService.IEdificioService;
import PI.Grupo03.proyecto.interfaceService.ICausaIncidenteService;

@Controller
@RequestMapping
public class IncidenteController {

	@Autowired
	private IIncidenteService service;
	
	@Autowired
	private IDepartamentoService Departamentoservice;
	
	@Autowired
	private IEdificioService Edificioservice;
	
	@Autowired
	private ICausaIncidenteService CausaIncidenteservice;
	
	@GetMapping("/listarIncidente")
	public String listar(Model model) {
		List<Incidente>incidentes=service.listar();
		model.addAttribute("incidentes", incidentes);
		return "incidente";
		
	}
	
	@GetMapping("/newIncidente")
	public String agregar(Model model) {
		List<Departamento> listarDep = Departamentoservice.listar();
		List<Edificio> listarEdi = Edificioservice.listar();
		List<CausaIncidente> listarCau = CausaIncidenteservice.listar();
		model.addAttribute("incidentes", new Incidente());
		model.addAttribute("departamentos", listarDep);
		model.addAttribute("edificios", listarEdi);
		model.addAttribute("causaincidentes", listarCau);
		return "form_incidente";
	}
	
	@PostMapping("/saveIncidente")
	public String save(Incidente d, Model model) {
		service.save(d);
		return "redirect:/listarIncidente";
	}
	
	@GetMapping("/estadoIncidente/{idIncidentes}")	
	public String editar(@PathVariable int idIncidentes ,Model model) {
		List<Departamento> listarDep = Departamentoservice.listar();
		List<Edificio> listarEdi = Edificioservice.listar();
		List<CausaIncidente> listarCau = CausaIncidenteservice.listar();
		Optional<Incidente>incidente=service.listarId(idIncidentes);
		model.addAttribute("incidentes", incidente);
		model.addAttribute("departamentos", listarDep);
		model.addAttribute("edificios", listarEdi);
		model.addAttribute("causaincidentes", listarCau);
		return "form_incidenteestado";
	}
}
