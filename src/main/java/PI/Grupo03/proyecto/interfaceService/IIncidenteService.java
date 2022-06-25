package PI.Grupo03.proyecto.interfaceService;

import java.util.List;
import java.util.Optional;

import PI.Grupo03.proyecto.modelo.Incidente;

public interface IIncidenteService {

	public List<Incidente> listar(); 
	public Optional<Incidente>listarId(int idIncidentes);
	public int save(Incidente d);
	public void delete(int idIncidentes);
	
}
