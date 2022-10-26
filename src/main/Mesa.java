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
	
	
	public void generaPromedio() {
		
		if(this.cantCompras != 0) {
			this.promedio = this.totalGanado / this.cantCompras;
		}else {
			this.promedio = 0;
		}
		//no se si deberia ir la inicializacion en 0 de nuevo
		
	}
	
	public void inicializaValores() {
		this.cantCompras = 0;
		this.totalGanado = 0;
	}
	
	public String muestraProm() {
		return "Mesa numero: " + this.numero + " tiene un promedio de $" + this.promedio;
	}
	
}
