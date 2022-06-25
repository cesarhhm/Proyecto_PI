package PI.Grupo03.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PI.Grupo03.proyecto.interfaceService.IIncidenteService;
import PI.Grupo03.proyecto.interfaces.IIncidente;
import PI.Grupo03.proyecto.modelo.Incidente;

@Service
public class IncidenteService implements IIncidenteService{

	@Autowired
	private IIncidente data;
	
	
	@Override
	public List<Incidente> listar() {
		return (List<Incidente>)data.findAll();
	}

	@Override
	public Optional<Incidente> listarId(int idIncidentes) {
		return data.findById(idIncidentes);
	}

	@Override
	public int save(Incidente d) {
		int res=0;
		Incidente incidente=data.save(d);
		if(!incidente.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int idIncidentes) {
		data.deleteById(idIncidentes);
		
	}
	
}
