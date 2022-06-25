package PI.Grupo03.proyecto.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "causaincidente")
public class CausaIncidente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCausaIncidente;
	private String nombre;
	
	public int getIdCausaIncidente() {
		return idCausaIncidente;
	}
	public void setIdCausaIncidente(int idCausaIncidente) {
		this.idCausaIncidente = idCausaIncidente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
