package PI.Grupo03.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PI.Grupo03.proyecto.interfaceService.IVisitanteService;
import PI.Grupo03.proyecto.modelo.Visitante;
import PI.Grupo03.proyecto.interfaces.IVisitante;

@Service
public class VisitanteService implements IVisitanteService {

	@Autowired
	private IVisitante data;
	
	@Override
	public List<Visitante> listar() {
		return (List<Visitante>)data.findAll();
	}
	
	@Override
	public Optional<Visitante> listarId(int idVisitante) {
		return data.findById(idVisitante);
	}
	
	@Override
	public int save(Visitante d) {
		int res=0;
		Visitante visitante=data.save(d);
		if(!visitante.equals(null)) {
			res=1;
		}
		return res;
	}
	
	@Override
	public void delete(int idVisitante) {
		data.deleteById(idVisitante);
		
	}
	
}
