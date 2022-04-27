package PI.Grupo03.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PI.Grupo03.proyecto.interfaceService.IEdificioService;
import PI.Grupo03.proyecto.interfaces.IEdificio;
import PI.Grupo03.proyecto.modelo.Edificio;

@Service
public class EdificioService implements IEdificioService {
	
	@Autowired
	private IEdificio data;
	
	@Override
	public List<Edificio> listar() {
		return (List<Edificio>)data.findAll();
	}

}
