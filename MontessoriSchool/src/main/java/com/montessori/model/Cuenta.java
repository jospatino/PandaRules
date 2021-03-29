package com.montessori.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta")
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Cuenta")
	private int IdCuenta;
	
	@Column(name = "deuda")
	private int deuda;
	
	@Column(name = "deuda")
	private double promBeca;

	public Cuenta() {
		super();
	}

	public Cuenta(int idCuenta) {
		super();
		IdCuenta = idCuenta;
	}

	public int getIdCuenta() {
		return IdCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		IdCuenta = idCuenta;
	}

	public int getDeuda() {
		return deuda;
	}

	public void setDeuda(int deuda) {
		this.deuda = deuda;
	}

	public double getPromBeca() {
		return promBeca;
	}

	public void setPromBeca(double promBeca) {
		this.promBeca = promBeca;
	}

}
