package PI.Grupo03.proyecto.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edificio")
public class Edificio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_edi;
	private String nombre;
	
	public int getId_edi() {
		return id_edi;
	}
	public void setId_edi(int id_edi) {
		this.id_edi = id_edi;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
