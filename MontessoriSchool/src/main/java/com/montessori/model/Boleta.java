package com.montessori.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_boleta")
public class Boleta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_boleta")
	private int idBoleta;
	
	@Column(name = "espanol")
	private double espanol;
	
	@Column(name = "matematicas")
	private double matematicas;
	
	@Column(name = "historia")
	private double historia;
	
	@Column(name = "asistencia")
	private boolean asistencia;
	
	@Column(name = "conducta")
	private boolean conduca;
	
	@Column(name = "calificacion")
	private double calificacion;
	
	@OneToOne(mappedBy = "boleta")
	private Alumno alumno;
	
	public Boleta() {
	}
	public Boleta(int idBoleta, double espanol, double matematicas, double historia, boolean asistencia, boolean conduca,
			double calificacion) {
		super();
		idBoleta = idBoleta;
		this.espanol = espanol;
		this.matematicas = matematicas;
		this.historia = historia;
		this.asistencia = asistencia;
		this.conduca = conduca;
		this.calificacion = calificacion;
	}
	public int getIdBoleta() {
		return idBoleta;
	}
	public void setIdBoleta(int idBoleta) {
		idBoleta = idBoleta;
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
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	
	
}
