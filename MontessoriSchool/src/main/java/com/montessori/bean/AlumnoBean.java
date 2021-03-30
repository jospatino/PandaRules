package com.montessori.bean;

public class AlumnoBean {

	private int idAlumno;
	private String nombreAl;
	private String appAl;
	private String apmAl;
	private int edadAl;
	private String sexoAl;
	private BoletaBean idBoleta; 
	private ProfesorBean idProf;
	private CuentaBean idCuenta;
	
	public AlumnoBean() {
		super();
	}

	public AlumnoBean(int idAlumno, String nombreAl, String appAl, String apmAl, int edadAl, String sexoAl,
			BoletaBean idBoleta, ProfesorBean idProf, CuentaBean idCuenta) {
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

	public BoletaBean getIdBoleta() {
		return idBoleta;
	}

	public void setIdBoleta(BoletaBean idBoleta) {
		this.idBoleta = idBoleta;
	}

	public ProfesorBean getIdProf() {
		return idProf;
	}

	public void setIdProf(ProfesorBean idProf) {
		this.idProf = idProf;
	}

	public CuentaBean getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(CuentaBean idCuenta) {
		this.idCuenta = idCuenta;
	}
	
	
	
	
	
	
}
