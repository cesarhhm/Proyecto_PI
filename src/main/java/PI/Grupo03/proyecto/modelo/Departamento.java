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
	private int id_depa;
	private int nro_depa;
	private int hab_depa;
	private String con_depa;
	private int met_depa;
	private int por_depa;
	private int tel_depa;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_edi")
	private Edificio edificio;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date per_depa;
	
	private String edi_depa;
	
	public Departamento() {
		// TODO Auto-generated constructor stub
	}
	
	




	public Departamento(int id_depa, int nro_depa, int hab_depa, String con_depa, int met_depa, int por_depa,
			int tel_depa, Edificio edificio, Date per_depa, String edi_depa) {
		super();
		this.id_depa = id_depa;
		this.nro_depa = nro_depa;
		this.hab_depa = hab_depa;
		this.con_depa = con_depa;
		this.met_depa = met_depa;
		this.por_depa = por_depa;
		this.tel_depa = tel_depa;
		this.edificio = edificio;
		this.per_depa = per_depa;
		this.edi_depa = edi_depa;
	}






	public int getId_depa() {
		return id_depa;
	}






	public void setId_depa(int id_depa) {
		this.id_depa = id_depa;
	}






	public int getNro_depa() {
		return nro_depa;
	}






	public void setNro_depa(int nro_depa) {
		this.nro_depa = nro_depa;
	}






	public int getHab_depa() {
		return hab_depa;
	}






	public void setHab_depa(int hab_depa) {
		this.hab_depa = hab_depa;
	}






	public String getCon_depa() {
		return con_depa;
	}






	public void setCon_depa(String con_depa) {
		this.con_depa = con_depa;
	}






	public int getMet_depa() {
		return met_depa;
	}






	public void setMet_depa(int met_depa) {
		this.met_depa = met_depa;
	}






	public int getPor_depa() {
		return por_depa;
	}






	public void setPor_depa(int por_depa) {
		this.por_depa = por_depa;
	}






	public int getTel_depa() {
		return tel_depa;
	}






	public void setTel_depa(int tel_depa) {
		this.tel_depa = tel_depa;
	}






	public Edificio getEdificio() {
		return edificio;
	}






	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}






	public Date getPer_depa() {
		return per_depa;
	}






	public void setPer_depa(Date per_depa) {
		this.per_depa = per_depa;
	}






	public String getEdi_depa() {
		return edi_depa;
	}






	public void setEdi_depa(String edi_depa) {
		this.edi_depa = edi_depa;
	}






	
	
}
