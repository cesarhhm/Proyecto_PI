package PI.Grupo03.proyecto.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import PI.Grupo03.proyecto.modelo.Mascota;

@Repository
public interface IMascota extends CrudRepository <Mascota, Integer>{

}
