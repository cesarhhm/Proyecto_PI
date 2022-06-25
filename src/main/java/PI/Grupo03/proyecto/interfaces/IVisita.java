package PI.Grupo03.proyecto.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import PI.Grupo03.proyecto.modelo.Visita;

@Repository
public interface IVisita extends CrudRepository <Visita, Integer>{
	
	//List<Visita> findByDNI(int idVisitante);
	//public List<Visita> findByNombreLike(String nombre);

}
