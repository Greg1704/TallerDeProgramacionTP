package main;

public class Producto {
	private int id;
	private String nombre;
	private double precio;
	private double precioDeVenta;
	private int stock;
	
	
	
	
	public Producto(int id, String nombre, double precio, double precioDeVenta, int stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.precioDeVenta = precioDeVenta;
		this.stock = stock;
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPrecioDeVenta() {
		return precioDeVenta;
	}
	public void setPrecioDeVenta(double precioDeVenta) {
		this.precioDeVenta = precioDeVenta;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}
