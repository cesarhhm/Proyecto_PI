package PI.Grupo03.proyecto.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PI.Grupo03.proyecto.interfaceService.IDepartamentoService;
import PI.Grupo03.proyecto.interfaces.IDepartamento;
import PI.Grupo03.proyecto.modelo.Departamento;

@Service
public class DepartamentoService implements IDepartamentoService{

	
	@Autowired
	private IDepartamento data;
	
	@Override
	public List<Departamento> listar() {
		return (List<Departamento>)data.findAll();
	}
	
	@Override
	public Optional<Departamento> listarId(int idDepartamento) {
		return data.findById(idDepartamento);
	}
	
	@Override
	public int save(Departamento d) {
		int res=0;
		Departamento departamento=data.save(d);
		if(!departamento.equals(null)) {
			res=1;
		}
		return res;
	}
	
	@Override
	public void delete(int idDepartamento) {
		data.deleteById(idDepartamento);
		
	}

}
