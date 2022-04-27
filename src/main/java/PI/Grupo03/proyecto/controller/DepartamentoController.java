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

import PI.Grupo03.proyecto.interfaceService.IDepartamentoService;
import PI.Grupo03.proyecto.interfaceService.IEdificioService;
import PI.Grupo03.proyecto.modelo.Departamento;
import PI.Grupo03.proyecto.modelo.Edificio;

@Controller
@RequestMapping
public class DepartamentoController {
	
	@Autowired
	private IDepartamentoService service;
	
	@Autowired
	private IEdificioService Edificioservice;
	
	@ResponseBody
	@GetMapping("/listarEdificio")
		public List<Edificio> listar() {
			return Edificioservice.listar();
		
	}
	
	@GetMapping("/listarDepartamento")
	public String listar(Model model) {
		List<Departamento>departamentos=service.listar();
		model.addAttribute("departamentos", departamentos);
		return "departamento";
		
	}
	

	@GetMapping("/newDepartamento")
	public String agregar(Model model) {
		List<Edificio> listar = Edificioservice.listar();
		model.addAttribute("departamento", new Departamento());
		model.addAttribute("edificios", listar);
		return "form_departamento";
	}
	
	@PostMapping("/saveDepartamento")
	public String save(Departamento d, Model model) {
		service.save(d);
		return "redirect:/listarDepartamento";
	}
	
	@GetMapping("/editar/{idDepartamento}")	
	public String editar(@PathVariable int idDepartamento ,Model model) {
		Optional<Departamento>departamento=service.listarId(idDepartamento);
		List<Edificio> listar = Edificioservice.listar();
		model.addAttribute("departamento", departamento);
		model.addAttribute("edificios", listar);
		return "form_departamento";
	}
	
	@GetMapping("/eliminar/{idDepartamento}")	
	public String delete(Model model, @PathVariable int idDepartamento) {
		service.delete(idDepartamento);
		return "redirect:/listarDepartamento";
	}

}
