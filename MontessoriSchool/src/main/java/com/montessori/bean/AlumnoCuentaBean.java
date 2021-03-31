package com.montessori.bean;

public class AlumnoCuentaBean {
	
	private int idAlumno;
	private String nombreAl;
	private String appAl;
	private String apmAl;
	private int edadAl;
	private String sexoAl;
	private double deuda;
	private double promBeca;
	
	public AlumnoCuentaBean() {
		super();
	}

	public AlumnoCuentaBean(int idAlumno, String nombreAl, String appAl, String apmAl, int edadAl, String sexoAl,
			double deuda, double promBeca) {
		super();
		this.idAlumno = idAlumno;
		this.nombreAl = nombreAl;
		this.appAl = appAl;
		this.apmAl = apmAl;
		this.edadAl = edadAl;
		this.sexoAl = sexoAl;
		this.deuda = deuda;
		this.promBeca = promBeca;
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

	public double getDeuda() {
		return deuda;
	}

	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}

	public double getPromBeca() {
		return promBeca;
	}

	public void setPromBeca(double promBeca) {
		this.promBeca = promBeca;
	}
	
	

}
