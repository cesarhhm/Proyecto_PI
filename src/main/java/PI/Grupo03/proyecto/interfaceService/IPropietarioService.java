package PI.Grupo03.proyecto.interfaceService;

import java.util.List;
import PI.Grupo03.proyecto.modelo.Propietario;

public interface IPropietarioService {
	
	public List<Propietario> listaPropietario();
	public abstract Propietario insertaActualizaPropietario(Propietario obj);
}
