package com.montessori.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="boleta")
public class Boleta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdBoleta;
	private double espanol;
	private double matematicas;
	private double historia;
	private int asistencia;
	private boolean conduca;
	private double calificacion;
	
	
	public Boleta() {
	}
	public Boleta(int idBoleta, double espanol, double matematicas, double historia, int asistencia, boolean conduca,
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
	public int getAsistencia() {
		return asistencia;
	}
	public void setAsistencia(int asistencia) {
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
