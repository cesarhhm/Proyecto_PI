package PI.Grupo03.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PI.Grupo03.proyecto.interfaceService.ICausaIncidenteService;
import PI.Grupo03.proyecto.interfaces.ICausaIncidente;
import PI.Grupo03.proyecto.modelo.CausaIncidente;

@Service
public class CausaIncidenteService implements ICausaIncidenteService{

	@Autowired
	private ICausaIncidente data;
	
	@Override
	public List<CausaIncidente> listar() {
		return (List<CausaIncidente>)data.findAll();
	}
	
}
