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
	
	/*@Column(name = "id_boleta", nullable = false)
	private Boleta idBoleta; 
	
	@Column(name = "id_profesor", nullable = false)
	private Profesor idProf;
	
	@Column(name = "id_cuenta", nullable = false)
	private Cuenta idCuenta;*/

	public Alumno() {
		super();
	}

	public Alumno(int idAlumno, String nombreAl, String appAl, String apmAl, int edadAl, String sexoAl, Boleta idBoleta,
			Profesor idProf, Cuenta idCuenta) {
		super();
		this.idAlumno = idAlumno;
		this.nombreAl = nombreAl;
		this.appAl = appAl;
		this.apmAl = apmAl;
		this.edadAl = edadAl;
		this.sexoAl = sexoAl;
		//this.idBoleta = idBoleta;
		//this.idProf = idProf;
		//this.idCuenta = idCuenta;
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

	/*public Boleta getIdBoleta() {
		return idBoleta;
	}

	public void setIdBoleta(Boleta idBoleta) {
		this.idBoleta = idBoleta;
	}

	public Profesor getIdProf() {
		return idProf;
	}

	public void setIdProf(Profesor idProf) {
		this.idProf = idProf;
	}

	public Cuenta getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Cuenta idCuenta) {
		this.idCuenta = idCuenta;
	}*/

	
	
	
}
