package PI.Grupo03.proyecto.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import PI.Grupo03.proyecto.modelo.Edificio;

@Repository
public interface IEdificio  extends CrudRepository <Edificio, Integer> {

}
