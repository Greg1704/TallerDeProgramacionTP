package main;

import java.time.LocalDate;

public class Pedido {
	private int cantidad;
	private LocalDate fecha = LocalDate.now();
	private Producto producto;
	
	
	public Pedido(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public Producto getProducto() {
		return producto;
	}
	
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	
}
