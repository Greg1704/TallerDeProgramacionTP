package persistencia;

import java.io.Serializable;
import java.util.ArrayList;

import main.Comanda;
import main.Factura;
import main.Mesa;
import main.Mozo;
import main.Operario;
import main.Producto;
import main.PromocionPermanente;
import main.PromocionTemporal;
import main.Sueldo;

public class SistemaDTO implements Serializable{
	private String nombre;
	private ArrayList<PromocionPermanente> promosFijas = new ArrayList<PromocionPermanente>();
	private ArrayList<PromocionTemporal> promosTemporales = new ArrayList<PromocionTemporal>();
	private ArrayList<Operario> operarios = new ArrayList<Operario>();
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private ArrayList<Mozo> mozos = new ArrayList<Mozo>();
	private ArrayList<Mesa> mesas = new ArrayList<Mesa>();
	private ArrayList<Factura> facturas = new ArrayList<Factura>();
	private Sueldo sueldo;
	private Operario admin;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<PromocionPermanente> getPromosFijas() {
		return promosFijas;
	}
	public void setPromosFijas(ArrayList<PromocionPermanente> promosFijas) {
		this.promosFijas = promosFijas;
	}
	public ArrayList<PromocionTemporal> getPromosTemporales() {
		return promosTemporales;
	}
	public void setPromosTemporales(ArrayList<PromocionTemporal> promosTemporales) {
		this.promosTemporales = promosTemporales;
	}
	public ArrayList<Operario> getOperarios() {
		return operarios;
	}
	public void setOperarios(ArrayList<Operario> operarios) {
		this.operarios = operarios;
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
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
	public ArrayList<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}
	public Sueldo getSueldo() {
		return sueldo;
	}
	public void setSueldo(Sueldo sueldo) {
		this.sueldo = sueldo;
	}
	public Operario getAdmin() {
		return admin;
	}
	public void setAdmin(Operario admin) {
		this.admin = admin;
	}

}
