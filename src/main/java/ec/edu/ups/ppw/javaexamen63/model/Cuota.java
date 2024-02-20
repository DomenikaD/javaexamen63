package ec.edu.ups.ppw.javaexamen63.model;

import jakarta.persistence.Entity;

@Entity
public class Cuota {
	
	
	//~~~~~~~ATRIBUTOS~~~~~~~
	private int numeroCuota;
	private double cuotaCapital;
	private double cuotaInteres;
	private double cuotaTotal;
	
	
	//~~~~~~~GETTERS & SETTERS~~~~~~~
	public int getNumeroCuota() {
		return numeroCuota;
	}
	public void setNumeroCuota(int numeroCuota) {
		this.numeroCuota = numeroCuota;
	}
	public double getCuotaCapital() {
		return cuotaCapital;
	}
	public void setCuotaCapital(double cuotaCapital) {
		this.cuotaCapital = cuotaCapital;
	}
	public double getCuotaInteres() {
		return cuotaInteres;
	}
	public void setCuotaInteres(double cuotaInteres) {
		this.cuotaInteres = cuotaInteres;
	}
	public double getCuotaTotal() {
		return cuotaTotal;
	}
	public void setCuotaTota(double cuotaTotal) {
		this.cuotaTotal = cuotaTotal;
	}
	
	
	

}
