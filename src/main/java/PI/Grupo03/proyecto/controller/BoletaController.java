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

import PI.Grupo03.proyecto.interfaceService.IBoletaService;
import PI.Grupo03.proyecto.interfaceService.ICausaIncidenteService;
import PI.Grupo03.proyecto.interfaceService.IDepartamentoService;
import PI.Grupo03.proyecto.interfaceService.IEdificioService;
import PI.Grupo03.proyecto.interfaceService.IIncidenteService;
import PI.Grupo03.proyecto.interfaceService.IPropietarioService;
import PI.Grupo03.proyecto.interfaceService.IServicioService;
import PI.Grupo03.proyecto.modelo.Boleta;
import PI.Grupo03.proyecto.modelo.CausaIncidente;
import PI.Grupo03.proyecto.modelo.Departamento;
import PI.Grupo03.proyecto.modelo.Edificio;
import PI.Grupo03.proyecto.modelo.Incidente;
import PI.Grupo03.proyecto.modelo.Propietario;
import PI.Grupo03.proyecto.modelo.Servicio;

@Controller
@RequestMapping
public class BoletaController {

	@Autowired
	private IBoletaService service;
	
	@Autowired
	private IServicioService Servicioservice;
	
	@Autowired
	private IEdificioService Edificioservice;
	
	@Autowired
	private IPropietarioService Propietarioservice;
	
	@GetMapping("/listarBoleta")
	public String listar(Model model) {
		List<Boleta>boletas=service.listar();
		model.addAttribute("boletas", boletas);
		return "boleta";
		
	}
	
	@GetMapping("/newBoleta")
	public String agregar(Model model) {
		List<Servicio> listarSer = Servicioservice.listar();
		List<Edificio> listarEdi = Edificioservice.listar();
		List<Propietario> listarPro = Propietarioservice.listar();
		model.addAttribute("boletas", new Boleta());
		model.addAttribute("servicios", listarSer);
		model.addAttribute("edificios", listarEdi);
		model.addAttribute("propietarios", listarPro);
		return "form_boleta";
	}
	
	@PostMapping("/saveBoleta")
	public String save(Boleta d, Model model) {
		service.save(d);
		return "redirect:/listarBoleta";
	}
	
	@GetMapping("/pagarBoleta/{idBoleta}")	
	public String editar(@PathVariable int idBoleta ,Model model) {
		List<Servicio> listarSer = Servicioservice.listar();
		List<Edificio> listarEdi = Edificioservice.listar();
		List<Propietario> listarPro = Propietarioservice.listar();
		Optional<Boleta> boleta = service.listarId(idBoleta);
		model.addAttribute("boletas", boleta);
		model.addAttribute("servicios", listarSer);
		model.addAttribute("edificios", listarEdi);
		model.addAttribute("propietarios", listarPro);
		return "form_pagarboleta";
	}
	
}
