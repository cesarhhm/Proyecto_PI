package PI.Grupo03.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import PI.Grupo03.proyecto.interfaceService.IDepartamentoService;
import PI.Grupo03.proyecto.modelo.Departamento;

@Controller
@RequestMapping
public class DepartamentoController {
	
	@Autowired
	private IDepartamentoService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Departamento>departamentos=service.listar();
		model.addAttribute("departamentos", departamentos);
		return "departamento";
		
	}

}
