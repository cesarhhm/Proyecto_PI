package PI.Grupo03.proyecto.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import PI.Grupo03.proyecto.modelo.Visita;

@Repository
public interface IVisita extends CrudRepository <Visita, Integer>{
	
	//@Query("select v.idVisita, vi.nroDocumento, vi.nombre, p.nroDocumento, p.nombre, v.fechaEntrada, v.fechaSalida, v.estado"
		//	+ "from visita as v"
			//+ "inner join visitante as vi on v.idVisitante=vi.idVisitante"
			//+ "inner join	propietario as p on v.idPropietario=p.idPropietario where vi.nombre like :fil ORDER BY idVisita asc")
	//public List<Visita> listaProductoPorNombreLike(@Param("fil") String filtro);
	//public List<Visita> findByNombreLike(String nombre);

}
