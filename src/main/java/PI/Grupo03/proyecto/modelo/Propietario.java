package PI.Grupo03.proyecto.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "propietario")
public class Propietario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPropietario;
	private String nombre;
	private String ape_paterno;
	private String ape_materno;
	private int tipo_doc;
	private int nro_doc;
	private String email;
	private String celular;
	private String mascota1;
	private String mascota2;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date fecha_nac;
	public int getIdPropietario() {
		return idPropietario;
	}
	
	
	
	public void setIdPropietario(int idPropietario) {
		this.idPropietario = idPropietario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApe_paterno() {
		return ape_paterno;
	}
	public void setApe_paterno(String ape_paterno) {
		this.ape_paterno = ape_paterno;
	}
	public String getApe_materno() {
		return ape_materno;
	}
	public void setApe_materno(String ape_materno) {
		this.ape_materno = ape_materno;
	}
	public int getTipo_doc() {
		return tipo_doc;
	}
	public void setTipo_doc(int tipo_doc) {
		this.tipo_doc = tipo_doc;
	}
	public int getNro_doc() {
		return nro_doc;
	}
	public void setNro_doc(int nro_doc) {
		this.nro_doc = nro_doc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getMascota1() {
		return mascota1;
	}
	public void setMascota1(String mascota1) {
		this.mascota1 = mascota1;
	}
	public String getMascota2() {
		return mascota2;
	}
	public void setMascota2(String mascota2) {
		this.mascota2 = mascota2;
	}
	public Date getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	
	
}
