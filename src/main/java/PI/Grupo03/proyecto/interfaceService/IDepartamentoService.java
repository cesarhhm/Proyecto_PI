package PI.Grupo03.proyecto.interfaceService;
import java.util.List;
import java.util.Optional;
import PI.Grupo03.proyecto.modelo.Departamento;

public interface IDepartamentoService {
	
	public List<Departamento> listar(); 
	public Optional<Departamento>listarId(int idDepartamento);
	public int save(Departamento d);
	public void delete(int idDepartamento);

}
