package main;

import java.io.Serializable;

public class Mesa implements Serializable{
	private int comensales;
	private transient String estado; //libre u ocupada
	private int numero;
	private int cantCompras;
	private double totalGanado;
	
	
	public Mesa(int comensales, String estado, int numero){
		this.comensales = comensales;
		this.estado = estado;
		this.numero = numero;
		this.cantCompras = 0;
		this.totalGanado = 0;
	}
	
	
	public int getCantCompras() {
		return cantCompras;
	}
	public void setCantCompras(int cantCompras) {
		this.cantCompras = cantCompras;
	}
	public double getTotalGanado() {
		return totalGanado;
	}
	public void setTotalGanado(double totalGanado) {
		this.totalGanado = totalGanado;
	}

	public int getComensales() {
		return comensales;
	}
	public void setComensales(int comensales) {
		this.comensales = comensales;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public double generaPromedio() {
		
		if(this.cantCompras != 0) {
			return this.totalGanado / this.cantCompras;
		}else {
			return 0;
		}
		
	}
	
	public void inicializaValores() {
		this.cantCompras = 0;
		this.totalGanado = 0;
	}
	
	public String muestraProm() {
		return "Mesa numero: " + this.numero + " tiene un promedio de $" + generaPromedio();
	}


	public String toStringGeneral() {
		return "Mesa numero: " + numero + " Estado: " + estado + " Comensales: " + comensales ;
	}
	
	public String toStringMesas() {
		return "Mesa numero: " + numero + " Comensales: " + comensales ;
	}
	
	
}
