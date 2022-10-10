package main;

import java.util.ArrayList;

import Excepciones.MozoDuplicadoException;
import Excepciones.OperarioDuplicadoException;

public class Sistema {
	private ArrayList<PromocionPermanente> promosFijas = new ArrayList<PromocionPermanente>();
	private ArrayList<PromocionTemporal> promosTemporales = new ArrayList<PromocionTemporal>();
	private ArrayList<Comanda> comandas = new ArrayList<Comanda>();
	private ArrayList<Operario> operarios = new ArrayList<Operario>();
	private ArrayList<Producto> producto = new ArrayList<Producto>();
	private ArrayList<Mozo> mozos = new ArrayList<Mozo>();
	private ArrayList<Mesa> mesas = new ArrayList<Mesa>();
	private String nombre;
	private Sueldo sueldo;
	private static Sistema instancia = null;
	
	/*
	public Sistema(String nombre, Sueldo sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	*/
	
	private Sistema() {
		
	}
	
	
	public static Sistema getInstancia() {
		if(instancia == null)
			instancia = new Sistema();
		return instancia;
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
	
	
	
	public void agregaOperario(Operario o) throws OperarioDuplicadoException{
		int j,i=0;
		
		j = this.operarios.size() ;
		
		while(i < j && !(this.operarios.get(i).getNombreDeUsuario().equalsIgnoreCase(o.getNombreDeUsuario()))) {
			i++;
		}
		
		if (i < j) {
			throw new OperarioDuplicadoException("Error: el operario ya existe en el sistema");
		}else {
			this.operarios.add(o) ;
		}
		
	}
	
	public void sacaOperario(Operario o){
		this.operarios.remove(o);
	}
	
	public void agregaMozo(Mozo m) throws MozoDuplicadoException{
		int j,i=0;
		
		j = this.mozos.size() ;
		
		while(i < j && !(this.mozos.get(i).getNombreYApellido().equalsIgnoreCase(m.getNombreYApellido()))) {
			i++;
		}
		
		if (i < j) {
			throw new MozoDuplicadoException("Error: el mozo ya existe en el sistema");
		}else {
			this.mozos.add(m) ;
		}
		
	}
	
	public void sacaMozo(Mozo m){
		this.mozos.remove(m);
	}
	
	
}
