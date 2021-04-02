package com.montessori.bean;

public class AlumnoSexBean {
	private int idAlumno;
	private String sexoAl;
	
	public AlumnoSexBean() {
	}

	public AlumnoSexBean(int idAlumno, String sexoAl) {
		this.idAlumno = idAlumno;
		this.sexoAl = sexoAl;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getSexoAl() {
		return sexoAl;
	}

	public void setSexoAl(String sexoAl) {
		this.sexoAl = sexoAl;
	}
	
	

}
