package PI.Grupo03.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PI.Grupo03.proyecto.interfaceService.IBoletaService;
import PI.Grupo03.proyecto.interfaces.IBoleta;
import PI.Grupo03.proyecto.modelo.Boleta;

@Service
public class BoletaService implements IBoletaService{

	@Autowired
	private IBoleta data;
	
	
	@Override
	public List<Boleta> listar() {
		return (List<Boleta>)data.findAll();
	}

	@Override
	public Optional<Boleta> listarId(int idBoleta) {
		return data.findById(idBoleta);
	}

	@Override
	public int save(Boleta d) {
		int res=0;
		Boleta boleta=data.save(d);
		if(!boleta.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int idBoleta) {
		data.deleteById(idBoleta);
		
	}
	
}
