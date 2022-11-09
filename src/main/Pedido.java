package main;

import java.io.Serializable;
import java.time.LocalDate;

import excepciones.StockNegativoException;

public class Pedido implements Serializable{
	private int cantidad;
	private LocalDate fecha = LocalDate.now();
	private Producto producto;
	
	
	public Pedido(int cantidad, Producto producto) throws StockNegativoException{
	
		if(producto.getStock() - cantidad < 0) {
			throw new StockNegativoException();
		}else {
			this.cantidad = cantidad;
			this.producto = producto;
			producto.setStock(producto.getStock() - cantidad);
		}

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
