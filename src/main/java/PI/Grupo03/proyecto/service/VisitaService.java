package PI.Grupo03.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PI.Grupo03.proyecto.interfaceService.IVisitaService;
import PI.Grupo03.proyecto.interfaces.IVisita;
import PI.Grupo03.proyecto.modelo.Visita;


@Service
public class VisitaService implements IVisitaService{

	@Autowired
	private IVisita data;
	
	@Override
	public List<Visita> listar() {
		return (List<Visita>)data.findAll();
	}
	
	@Override
	public Optional<Visita> listarId(int idVisita) {
		return data.findById(idVisita);
	}
	
	@Override
	public int save(Visita v) {
		int res=0;
		Visita visita=data.save(v);
		if(!visita.equals(null)) {
			res=1;
		}
		return res;
	}
	
	@Override
	public void delete(int idVisita) {
		data.deleteById(idVisita);
		
	}

	//@Override
	//public List<Visita> listaPorNombreLike(String nombre) {
		// TODO Auto-generated method stub
		//return (List<Visita>)data.findByNombreLike(nombre);
	//}

	
}
