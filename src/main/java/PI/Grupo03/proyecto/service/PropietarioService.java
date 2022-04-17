package PI.Grupo03.proyecto.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PI.Grupo03.proyecto.interfaceService.IPropietarioService;
import PI.Grupo03.proyecto.modelo.Propietario;
import PI.Grupo03.proyecto.interfaces.IPropietario;

@Service
public class PropietarioService implements IPropietarioService {
	@Autowired
	private IPropietario data;
	
	
	@Override
	public List<Propietario> listaPropietario() {
		return (List<Propietario>)data.findAll();
	}


	@Override
	public Propietario insertaActualizaPropietario(Propietario obj) {
		// TODO Auto-generated method stub
		return null;
	}
}
