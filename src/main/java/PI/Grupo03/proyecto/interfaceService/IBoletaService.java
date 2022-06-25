package PI.Grupo03.proyecto.interfaceService;

import java.util.List;
import java.util.Optional;

import PI.Grupo03.proyecto.modelo.Boleta;

public interface IBoletaService {

	public List<Boleta> listar(); 
	public Optional<Boleta>listarId(int idBoleta);
	public int save(Boleta d);
	public void delete(int idBoleta);
	
}
