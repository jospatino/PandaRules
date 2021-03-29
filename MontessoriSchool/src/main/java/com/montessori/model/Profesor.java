package com.montessori.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tb_Profesor")
public class Profesor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PROF")
	private int idProf;
	
	@Column(name = "NOM_PROF")
	private String nom_prof;
	
	@Column(name = "APP_PROF")
	private String app_prof;
	
	@Column(name = "APM_PROF")
	private String apm_prof;
	
	@Column(name = "EDAD_PROF")
	private int edad;
	
	@Column(name = "SEX_PROF")
	private String sexo_prof;
	
	@Column(name = "RFC_PROF")
	private String rfc;
	
	@Column(name = "SUELDO_PROF")
	private int sueldo_prof;
	
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
