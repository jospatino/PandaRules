package com.montessori.bean;

public class AlumnoSexBean {
	private String sexoAl;
	private int countAl;
	
	public AlumnoSexBean() {
		super();
	}

	public AlumnoSexBean(String sexoAl, int countAl) {
		super();
		this.sexoAl = sexoAl;
		this.countAl = countAl;
	}

	public String getSexoAl() {
		return sexoAl;
	}

	public void setSexoAl(String sexoAl) {
		this.sexoAl = sexoAl;
	}

	public int getCountAl() {
		return countAl;
	}

	public void setCountAl(int countAl) {
		this.countAl = countAl;
	}
	
}
