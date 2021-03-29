package com.montessori.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_alumno")
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAlumno")
	private int idAlumno;
	
	@Column(name = "nombre_alumno", length = 30, nullable = false)
	private String nombreAl;
	
	@Column(name = "app_alumno", length = 30, nullable = false)
	private String appAl;
	
	@Column(name = "apm_alumno", length = 30, nullable = false)
	private String apmAl;
	
	@Column(name = "edad_alumno",  nullable = false)
	private int edadAl;
	
	@Column(name = "sexo_alumno", length = 5, nullable = false)
	private String sexoAl;

	public Alumno() {
		super();
	}

	public Alumno(int idAlumno, String nombreAl, String appAl, String apmAl, int edadAl, String sexoAl) {
		super();
		this.idAlumno = idAlumno;
		this.nombreAl = nombreAl;
		this.appAl = appAl;
		this.apmAl = apmAl;
		this.edadAl = edadAl;
		this.sexoAl = sexoAl;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombreAl() {
		return nombreAl;
	}

	public void setNombreAl(String nombreAl) {
		this.nombreAl = nombreAl;
	}

	public String getAppAl() {
		return appAl;
	}

	public void setAppAl(String appAl) {
		this.appAl = appAl;
	}

	public String getApmAl() {
		return apmAl;
	}

	public void setApmAl(String apmAl) {
		this.apmAl = apmAl;
	}

	public int getEdadAl() {
		return edadAl;
	}

	public void setEdadAl(int edadAl) {
		this.edadAl = edadAl;
	}

	public String getSexoAl() {
		return sexoAl;
	}

	public void setSexoAl(String sexoAl) {
		this.sexoAl = sexoAl;
	}
	
	
}
