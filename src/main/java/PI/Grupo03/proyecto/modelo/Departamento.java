package PI.Grupo03.proyecto.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "departamento")

public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDepartamento;
	
	private int numero;
	private int habitado;
	private String condiciones;
	private int area;
	private int porcentajeIndiviso;
	private int telefono;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEdificio")
	private Edificio edificio;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date periodoContrato;
	
	private String tipoDepartamento;
	
	public Departamento() {
		// TODO Auto-generated constructor stub
	}

	public Departamento(int idDepartamento, int numero, int habitado, String condiciones, int area,
			int porcentajeIndiviso, int telefono, Edificio edificio, Date periodoContrato, String tipoDepartamento) {
		super();
		this.idDepartamento = idDepartamento;
 		this.numero = numero;
		this.habitado = habitado;
		this.condiciones = condiciones;
		this.area = area;
		this.porcentajeIndiviso = porcentajeIndiviso;
		this.telefono = telefono;
		this.edificio = edificio;
		this.periodoContrato = periodoContrato;
		this.tipoDepartamento = tipoDepartamento;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getHabitado() {
		return habitado;
	}

	public void setHabitado(int habitado) {
		this.habitado = habitado;
	}

	public String getCondiciones() {
		return condiciones;
	}

	public void setCondiciones(String condiciones) {
		this.condiciones = condiciones;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPorcentajeIndiviso() {
		return porcentajeIndiviso;
	}

	public void setPorcentajeIndiviso(int porcentajeIndiviso) {
		this.porcentajeIndiviso = porcentajeIndiviso;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Edificio getEdificio() {
		return edificio;
	}

	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}

	public Date getPeriodoContrato() {
		return periodoContrato;
	}

	public void setPeriodoContrato(Date periodoContrato) {
		this.periodoContrato = periodoContrato;
	}

	public String getTipoDepartamento() {
		return tipoDepartamento;
	}

	public void setTipoDepartamento(String tipoDepartamento) {
		this.tipoDepartamento = tipoDepartamento;
	}
	
	








	
	
}
