package PI.Grupo03.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PI.Grupo03.proyecto.interfaceService.IServicioService;
import PI.Grupo03.proyecto.interfaces.IServicio;
import PI.Grupo03.proyecto.modelo.Servicio;

@Service
public class ServicioService implements IServicioService{

	@Autowired
	private IServicio data;
	
	@Override
	public List<Servicio> listar() {
		return (List<Servicio>)data.findAll();
	}
	
}
