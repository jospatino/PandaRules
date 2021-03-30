package com.montessori.bean;

public class CuentaBean {
	
	private int idCuenta;
	private double deuda;
	private double promBeca;
	
	public CuentaBean() {
		super();
	}

	public CuentaBean(int idCuenta, double deuda, double promBeca) {
		super();
		this.idCuenta = idCuenta;
		this.deuda = deuda;
		this.promBeca = promBeca;
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
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
