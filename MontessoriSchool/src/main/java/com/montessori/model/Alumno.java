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

}
