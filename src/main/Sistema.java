package main;

import java.util.ArrayList;

public class Sistema {
	private ArrayList<Promocion> promosFijas = new ArrayList<Promocion>();
	private ArrayList<PromocionTemporal> promosTemporales = new ArrayList<PromocionTemporal>();
	//ArrayList promocion temporal
	private ArrayList<Comanda> comandas = new ArrayList<Comanda>();
	private ArrayList<Operario> operarios = new ArrayList<Operario>();
	private ArrayList<Producto> producto = new ArrayList<Producto>();
	private ArrayList<Mozo> mozos = new ArrayList<Mozo>();
	private ArrayList<Mesa> mesas = new ArrayList<Mesa>();
	private String nombre;
	private Sueldo sueldo;
	
	
	public Sistema(String nombre, Sueldo sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	
	public ArrayList<Promocion> getPromosFijas() {
		return promosFijas;
	}
	public void setPromosFijas(ArrayList<Promocion> promosFijas) {
		this.promosFijas = promosFijas;
	}
	public ArrayList<PromocionTemporal> getPromosTemporales() {
		return promosTemporales;
	}
	public void setPromosTemporales(ArrayList<PromocionTemporal> promosTemporales) {
		this.promosTemporales = promosTemporales;
	}
	public ArrayList<Comanda> getComandas() {
		return comandas;
	}
	public void setComandas(ArrayList<Comanda> comandas) {
		this.comandas = comandas;
	}
	public ArrayList<Operario> getOperarios() {
		return operarios;
	}
	public void setOperarios(ArrayList<Operario> operarios) {
		this.operarios = operarios;
	}
	public ArrayList<Producto> getProducto() {
		return producto;
	}
	public void setProducto(ArrayList<Producto> producto) {
		this.producto = producto;
	}
	public ArrayList<Mozo> getMozos() {
		return mozos;
	}
	public void setMozos(ArrayList<Mozo> mozos) {
		this.mozos = mozos;
	}
	public ArrayList<Mesa> getMesas() {
		return mesas;
	}
	public void setMesas(ArrayList<Mesa> mesas) {
		this.mesas = mesas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Sueldo getSueldo() {
		return sueldo;
	}
	public void setSueldo(Sueldo sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
}
