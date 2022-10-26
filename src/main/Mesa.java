package main;

public class Mesa {
	private int comensales;
	private String estado; //libre u ocupada
	private int numero;
	private int cantCompras;
	private double totalGanado;
	private double promedio;
	
	
	public Mesa(int comensales, String estado, int numero) {
		super();
		this.comensales = comensales;
		this.estado = estado;
		this.numero = numero;
		this.cantCompras = 0;
		this.totalGanado = 0;
		this.promedio = 0;
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
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
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
	
	
}
