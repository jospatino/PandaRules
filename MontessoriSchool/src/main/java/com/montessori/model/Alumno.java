package com.montessori.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_alumno")
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alumno")
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

	@ManyToOne 
	@JoinColumn(name = "idProf")
	private Profesor profesor;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idCuenta")
	private Cuenta cuenta;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idBoleta")
	private Boleta boleta;
	

	public Alumno() {
		super();
	}

	public Alumno(int idAlumno) {
		super();
		this.idAlumno = idAlumno;
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

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Boleta getBoleta() {
		return boleta;
	}

	public void setBoleta(Boleta boleta) {
		this.boleta = boleta;
	}

	
	
}
