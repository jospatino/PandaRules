package com.montessori.bean;

public class ProfesorBean {
	private int idProf;
	private String nom_prof;
	private String app_prof;
	private String apm_prof;
	private int edad;
	private String sexo_prof;
	private String rfc;
	private int sueldo_prof;
	
	
	/*Contructores_Getters&Setters*/
	
	public ProfesorBean() {
	}


	public ProfesorBean(int idProf, String nom_prof, String app_prof, String apm_prof, int edad, String sexo_prof,
			String rfc, int sueldo_prof) {
		this.idProf = idProf;
		this.nom_prof = nom_prof;
		this.app_prof = app_prof;
		this.apm_prof = apm_prof;
		this.edad = edad;
		this.sexo_prof = sexo_prof;
		this.rfc = rfc;
		this.sueldo_prof = sueldo_prof;
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
