package com.montessori.bean;

public class BoletaBean {

	private int IdBoleta;
	private double espanol;
	private double matematicas;
	private double historia;
	private boolean asistencia;
	private boolean conduca;
	private double calificacion;
	
	
	public BoletaBean() {
	}
	public BoletaBean(int idBoleta, double espanol, double matematicas, double historia, boolean asistencia, boolean conduca,
			double calificacion) {
		super();
		IdBoleta = idBoleta;
		this.espanol = espanol;
		this.matematicas = matematicas;
		this.historia = historia;
		this.asistencia = asistencia;
		this.conduca = conduca;
		this.calificacion = calificacion;
	}
	public int getIdBoleta() {
		return IdBoleta;
	}
	public void setIdBoleta(int idBoleta) {
		IdBoleta = idBoleta;
	}
	public double getEspanol() {
		return espanol;
	}
	public void setEspanol(double espanol) {
		this.espanol = espanol;
	}
	public double getMatematicas() {
		return matematicas;
	}
	public void setMatematicas(double matematicas) {
		this.matematicas = matematicas;
	}
	public double getHistoria() {
		return historia;
	}
	public void setHistoria(double historia) {
		this.historia = historia;
	}
	public boolean getAsistencia() {
		return asistencia;
	}
	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}
	public boolean isConduca() {
		return conduca;
	}
	public void setConduca(boolean conduca) {
		this.conduca = conduca;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
}
