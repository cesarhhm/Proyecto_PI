package PI.Grupo03.proyecto.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PI.Grupo03.proyecto.interfaceService.IDepartamentoService;
import PI.Grupo03.proyecto.interfaces.IDepartamento;
import PI.Grupo03.proyecto.modelo.Departamento;

@Service
public class DepartamentoService implements IDepartamentoService{

	
	@Autowired
	private IDepartamento data;
	@Override
	public List<Departamento> listar() {
		return (List<Departamento>)data.findAll();
	}

}
