package PI.Grupo03.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PI.Grupo03.proyecto.interfaceService.IMascotaService;
import PI.Grupo03.proyecto.interfaces.IMascota;
import PI.Grupo03.proyecto.modelo.Departamento;
import PI.Grupo03.proyecto.modelo.Mascota;

@Service
public class MascotaService implements IMascotaService {

	@Autowired
	private IMascota data;
	
	
	@Override
	public List<Mascota> listar() {
		return (List<Mascota>)data.findAll();
	}

	@Override
	public Optional<Mascota> listarId(int idMascota) {
		return data.findById(idMascota);
	}

	@Override
	public int save(Mascota d) {
		int res=0;
		Mascota mascota=data.save(d);
		if(!mascota.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int idMascota) {
		data.deleteById(idMascota);
		
	}


	
}
