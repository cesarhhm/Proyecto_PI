package PI.Grupo03.proyecto.interfaceService;

import java.util.List;
import java.util.Optional;

import PI.Grupo03.proyecto.modelo.Mascota;

public interface IMascotaService {

	public List<Mascota> listar(); 
	public Optional<Mascota>listarId(int idMascota);
	public int save(Mascota d);
	public void delete(int idMascota);
	
}
