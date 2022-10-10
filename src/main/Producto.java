package main;

import excepciones.PrecioNegativoException;
import excepciones.PrecioVentaMenorCostoException;

public class Producto {
	private int id;
	private String nombre;
	private double precioDeCosto;
	private double precioDeVenta;
	private int stock;
	
	
	
	
	public Producto(int id, String nombre, double precioDeCosto, double precioDeVenta, int stock) throws PrecioNegativoException, PrecioVentaMenorCostoException{
		super();
		this.id = id;
		this.nombre = nombre;
		this.precioDeVenta = precioDeVenta;
		this.stock = stock;
		
		if(precioDeCosto < 0)
			throw new PrecioNegativoException("Precio de costo negativo.");
		else if (precioDeVenta < 0)
			throw new PrecioNegativoException("Precio de venta negativo.");
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
	
	public void setId(int id) {
		this.id = id;
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
	
	public void setPrecioDeCosto(double precioDeCosto) throws PrecioNegativoException, PrecioVentaMenorCostoException {
		if(precioDeCosto < 0)
			throw new PrecioNegativoException("Precio de costo negativo.");
		else if (precioDeCosto > this.precioDeVenta)
			throw new PrecioVentaMenorCostoException("Precio de costo mayor que precio de venta.");
		else
			this.precioDeCosto = precioDeCosto;
	}
	
	public double getPrecioDeVenta() {
		return precioDeVenta;
	}
	
	public void setPrecioDeVenta(double precioDeVenta) throws PrecioNegativoException, PrecioVentaMenorCostoException {
		if (precioDeVenta < 0)
			throw new PrecioNegativoException("Precio de venta negativo.");
		else if (this.precioDeCosto > precioDeVenta)
			throw new PrecioVentaMenorCostoException("Precio de costo mayor que precio de venta.");
		else
			this.precioDeVenta = precioDeVenta;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
