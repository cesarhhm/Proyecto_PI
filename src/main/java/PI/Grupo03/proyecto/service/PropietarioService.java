package PI.Grupo03.proyecto.service;

import java.util.List;
import java.util.Optional;

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
	public Optional<Propietario> listarId(int idPropietario) {
		return data.findById(idPropietario);
	}
	
	@Override
	public int save(Propietario obj) {
		int res=0;
		Propietario propietario=data.save(obj);
		if(!propietario.equals(null)) {
			res=1;
		}
		return res;
	}
	
	@Override
	public void delete(int idPropietario) {
		data.deleteById(idPropietario);
		
	}
	

}
