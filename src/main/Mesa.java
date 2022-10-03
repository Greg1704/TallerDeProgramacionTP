package main;

public class Mesa {
	private Comanda comanda;
	private int comensales;
	private String estado;
	private int numero;
	
	
	public Mesa(Comanda comanda, int comensales, String estado, int numero) {
		super();
		this.comanda = comanda;
		this.comensales = comensales;
		this.estado = estado;
		this.numero = numero;
	}
	
	
	public Comanda getComanda() {
		return comanda;
	}
	public void setComanda(Comanda comanda) {
		this.comanda = comanda;
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
