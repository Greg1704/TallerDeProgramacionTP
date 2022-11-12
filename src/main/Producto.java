package main;

import java.io.Serializable;

import excepciones.NegativoException;
import excepciones.PrecioVentaMenorCostoException;

public class Producto implements Serializable{
	private int id = 0;
	private String nombre;
	private double precioDeCosto;
	private double precioDeVenta;
	private int stock;
	
	
	public Producto(String nombre, double precioDeCosto, double precioDeVenta, int stock) throws NegativoException, PrecioVentaMenorCostoException{
		super();
		this.nombre = nombre;
		
		if(Sistema.getInstancia().getProducto().isEmpty()) {
			this.id = 1;
		}else {
			this.id = Sistema.getInstancia().getProducto().get(Sistema.getInstancia().getProducto().size() - 1).id + 1 ;
		}
		
		if(stock < 1)
			throw new NegativoException("Stock menor a por lo menos 1 producto.");
		else
			this.stock = stock;
		
		
		if(precioDeCosto < 0)
			throw new NegativoException("Precio de costo negativo.");
		else if (precioDeVenta < 0)
			throw new NegativoException("Precio de venta negativo.");
		else if (precioDeCosto > precioDeVenta)
			throw new PrecioVentaMenorCostoException("Precio de costo mayor que precio de venta.");
		else {
			this.precioDeCosto = precioDeCosto;
			this.precioDeVenta = precioDeVenta;
		}
			
	}
		
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecioDeCosto() {
		return precioDeCosto;
	}
	
	public void setPrecioDeCosto(double precioDeCosto) throws NegativoException, PrecioVentaMenorCostoException {
		if(precioDeCosto < 0)
			throw new NegativoException("Precio de costo negativo.");
		else if (precioDeCosto > this.precioDeVenta)
			throw new PrecioVentaMenorCostoException("Precio de costo mayor que precio de venta.");
		else
			this.precioDeCosto = precioDeCosto;
	}
	
	public double getPrecioDeVenta() {
		return precioDeVenta;
	}
	
	public void setPrecioDeVenta(double precioDeVenta) throws NegativoException, PrecioVentaMenorCostoException {
		if (precioDeVenta < 0)
			throw new NegativoException("Precio de venta negativo.");
		else if (this.precioDeCosto > precioDeVenta)
			throw new PrecioVentaMenorCostoException("Precio de costo mayor que precio de venta.");
		else
			this.precioDeVenta = precioDeVenta;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) throws NegativoException {
		
		if(stock < 1)
			throw new NegativoException("Stock menor a por lo menos 1 producto.");
		else
			this.stock = stock;
	}

	@Override
	public String toString() {
		return "Nombre del producto: " + nombre + " ID del producto: " + getId() +  " Precio de costo: " + precioDeCosto + " Precio de venta: " + precioDeVenta+ " Stock: " + stock;
	}
	
}
