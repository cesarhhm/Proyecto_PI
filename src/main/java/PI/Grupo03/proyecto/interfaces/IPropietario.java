package PI.Grupo03.proyecto.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import PI.Grupo03.proyecto.modelo.Propietario;

@Repository
public interface IPropietario extends CrudRepository<Propietario,Integer>{

	//@Query ("SELECT p FROM propietario p WHERE p.nombre LIKE %?1%")
	//public List<Propietario> findAll(String palabraClave);

}
