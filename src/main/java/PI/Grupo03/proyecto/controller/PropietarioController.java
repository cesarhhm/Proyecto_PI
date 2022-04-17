package PI.Grupo03.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import PI.Grupo03.proyecto.interfaceService.IPropietarioService;
import PI.Grupo03.proyecto.modelo.Propietario;

public class PropietarioController {
	@Autowired
	private IPropietarioService service;
	
	@GetMapping("/listarpro")
	public String listaPropietario(Model model) {
		List<Propietario>propietarios=service.listaPropietario();
		model.addAttribute("propietarios", propietarios);
		return "propietarios";
	}
}
