package com.montessori.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

	@Column(name = "rfc_profesor", nullable = false, length = 10)
	private String rfc;
	
	@Column(name = "sueldo_prof", nullable = false)
	private int sueldoProf;
	
	@OneToMany(mappedBy = "profesor")
	private List<Alumno> alumno;
	
	/*Contructores_Getters&Setters*/
	
	
	public Profesor() {
	}

	public Profesor(int idProf) {
		this.idProf = idProf;
	}

	public int getIdProf() {
		return idProf;
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

	public void setIdProf(int idProf) {
		this.idProf = idProf;
	}

	public List<Alumno> getAlumno() {
		return alumno;
	}

	public void setAlumno(List<Alumno> alumno) {
		this.alumno = alumno;
	}

	
	

}
