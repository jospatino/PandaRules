package com.montessori.bean;

import java.util.List;

public class ProfesorConAlumnoBean {
	private int idProf;
	private String nomProf;
	private String appProf;
	private String apmProf;
	private int edad;
	private String sexoProf;
	private String rfc;
	private int sueldoProf;
	private List<AlumnoBean> alumnoBeanList;
	
	public ProfesorConAlumnoBean() {
	}

	public ProfesorConAlumnoBean(int idProf, String nomProf, String appProf, String apmProf, int edad, String sexoProf,
			String rfc, int sueldoProf, List<AlumnoBean> alumnoBeanList) {
		this.idProf = idProf;
		this.nomProf = nomProf;
		this.appProf = appProf;
		this.apmProf = apmProf;
		this.edad = edad;
		this.sexoProf = sexoProf;
		this.rfc = rfc;
		this.sueldoProf = sueldoProf;
		this.alumnoBeanList = alumnoBeanList;
	}

	public int getIdProf() {
		return idProf;
	}

	public void setIdProf(int idProf) {
		this.idProf = idProf;
	}

	public String getNomProf() {
		return nomProf;
	}

	public void setNomProf(String nomProf) {
		this.nomProf = nomProf;
	}

	public String getAppProf() {
		return appProf;
	}

	public void setAppProf(String appProf) {
		this.appProf = appProf;
	}

	public String getApmProf() {
		return apmProf;
	}

	public void setApmProf(String apmProf) {
		this.apmProf = apmProf;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexoProf() {
		return sexoProf;
	}

	public void setSexoProf(String sexoProf) {
		this.sexoProf = sexoProf;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public int getSueldoProf() {
		return sueldoProf;
	}

	public void setSueldoProf(int sueldoProf) {
		this.sueldoProf = sueldoProf;
	}

	public List<AlumnoBean> getAlumnoBeanList() {
		return alumnoBeanList;
	}

	public void setAlumnoBeanList(List<AlumnoBean> alumnoBeanList) {
		this.alumnoBeanList = alumnoBeanList;
	}

	
	

}
