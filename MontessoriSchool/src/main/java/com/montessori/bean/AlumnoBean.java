package com.montessori.bean;

import com.montessori.model.Boleta;
import com.montessori.model.Cuenta;
import com.montessori.model.Profesor;

public class AlumnoBean {

	private int idAlumno;
	private String nombreAl;
	private String appAl;
	private String apmAl;
	private int edadAl;
	private String sexoAl;
	private Boleta idBoleta; 
	private Profesor idProf;
	private Cuenta idCuenta;
	
	public AlumnoBean() {
		super();
	}

	public AlumnoBean(int idAlumno, String nombreAl, String appAl, String apmAl, int edadAl, String sexoAl,
			Boleta idBoleta, Profesor idProf, Cuenta idCuenta) {
		super();
		this.idAlumno = idAlumno;
		this.nombreAl = nombreAl;
		this.appAl = appAl;
		this.apmAl = apmAl;
		this.edadAl = edadAl;
		this.sexoAl = sexoAl;
		this.idBoleta = idBoleta;
		this.idProf = idProf;
		this.idCuenta = idCuenta;
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

	public Boleta getIdBoleta() {
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
	}
	
	
	
}
