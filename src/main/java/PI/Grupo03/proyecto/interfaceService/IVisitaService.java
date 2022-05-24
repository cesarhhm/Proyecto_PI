package PI.Grupo03.proyecto.interfaceService;

import java.util.List;
import java.util.Optional;

import PI.Grupo03.proyecto.modelo.Visita;

public interface IVisitaService {
	
	public List<Visita> listar(); 
	public Optional<Visita>listarId(int idVisita);
	public int save(Visita v);
	public void delete(int idVisita);
	//public List<Visita> listaPorNombreLike(String nombre);

}
