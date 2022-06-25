package PI.Grupo03.proyecto.modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "incidentes")
public class Incidente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idIncidentes;
	private String comentario;
	private int estado;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCausaIncidente")
	private CausaIncidente causaincidente;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idDepartamento")
	private Departamento departamento;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEdificio")
	private Edificio edificio;

	public Incidente() {
		super();
	}

	public Incidente(int idIncidentes, String comentario, int estado, CausaIncidente causaincidente,
			Departamento departamento, Edificio edificio) {
		super();
		this.idIncidentes = idIncidentes;
		this.comentario = comentario;
		this.estado = estado;
		this.causaincidente = causaincidente;
		this.departamento = departamento;
		this.edificio = edificio;
	}

	public int getIdIncidentes() {
		return idIncidentes;
	}

	public void setIdIncidentes(int idIncidentes) {
		this.idIncidentes = idIncidentes;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public CausaIncidente getCausaIncidente() {
		return causaincidente;
	}

	public void setCausaIncidente(CausaIncidente causaincidente) {
		this.causaincidente = causaincidente;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Edificio getEdificio() {
		return edificio;
	}

	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}

	
}
