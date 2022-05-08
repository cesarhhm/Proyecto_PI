package PI.Grupo03.proyecto.interfaceService;

import java.util.List;
import java.util.Optional;

import PI.Grupo03.proyecto.modelo.Visitante;

public interface IVisitanteService {
	
	public List<Visitante> listar(); 
	public Optional<Visitante>listarId(int idVisitante);
	public int save(Visitante v);
	public void delete(int idVisitante);


}
