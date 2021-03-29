package com.montessori.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_profesor")
public class Profesor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prof")
	private int idProf;
	
	@Column(name = "nom_prof", nullable = false, length = 20)
	private String nomProf;
	
	@Column(name = "app_prof", nullable = false, length = 15)
	private String appProf;
	
	@Column(name = "apm_prof", nullable = false, length = 15)
	private String apmProf;
	
	@Column(name = "edad_prof", nullable = false)
	private int edad;
	
	@Column(name = "sexo_prof", nullable = false, length = 1)
	private String sexoProf;
	
	@Column(name = "rfc_prof", nullable = false, length = 10)
	private String rfc;
	
	@Column(name = "sueldo_prof", nullable = false)
	private int sueldoProf;
	
	
	/*Contructores_Getters&Setters*/
	
	
	public Profesor() {
	}

	public Profesor(int idProf) {
		this.idProf = idProf;
	}

	public int getIdProf() {
		return idProf;
	}

	public void setIdProf(int idProf) {
		this.idProf = idProf;
	}

	public String getNom_prof() {
		return nom_prof;
	}

	public void setNom_prof(String nom_prof) {
		this.nom_prof = nom_prof;
	}

	public String getApp_prof() {
		return app_prof;
	}

	public void setApp_prof(String app_prof) {
		this.app_prof = app_prof;
	}

	public String getApm_prof() {
		return apm_prof;
	}

	public void setApm_prof(String apm_prof) {
		this.apm_prof = apm_prof;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo_prof() {
		return sexo_prof;
	}

	public void setSexo_prof(String sexo_prof) {
		this.sexo_prof = sexo_prof;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public int getSueldo_prof() {
		return sueldo_prof;
	}

	public void setSueldo_prof(int sueldo_prof) {
		this.sueldo_prof = sueldo_prof;
	}
	
	
	

}
