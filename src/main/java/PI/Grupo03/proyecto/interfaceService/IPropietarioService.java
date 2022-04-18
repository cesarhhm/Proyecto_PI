package PI.Grupo03.proyecto.interfaceService;

import java.util.List;
import java.util.Optional;

import PI.Grupo03.proyecto.modelo.Propietario;

public interface IPropietarioService {
	
	public List<Propietario> listaPropietario();
	public Optional<Propietario>listarId(int idPropietario);
	public int save(Propietario obj);
	public void delete(int idPropietario);
}
