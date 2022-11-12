package main;

import java.io.Serializable;
import java.time.LocalDate;

import excepciones.NegativoException;
import excepciones.StockNegativoException;

public class Pedido implements Serializable{
	private int cantidad;
	private LocalDate fecha = LocalDate.now();
	private Producto producto;
	
	
	/**
	 * Metodo constructor de la clase Pedido. <br>
	 * @param cantidad
	 * @param producto
	 * @throws StockNegativoException Se lanza si el stock ingresado es menor a 0.
	 * @throws NegativoException Se lanza si el dato de cantidad es negativo.
	 */
	public Pedido(int cantidad, Producto producto) throws StockNegativoException, NegativoException{
	
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
