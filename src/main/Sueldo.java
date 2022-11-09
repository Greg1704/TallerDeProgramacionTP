package main;

import java.io.Serializable;

public class Sueldo implements Serializable{
	private double basico;
	private double porcentaje;
	
	
	public Sueldo(double basico, double porcentaje) {
		super();
		this.basico = basico;
		this.porcentaje = porcentaje;
	}
	
	
	public double getBasico() {
		return basico;
	}
	public void setBasico(double basico) {
		this.basico = basico;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	
}
