package main;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mozo {
	private ArrayList<Mesa> mesas = new ArrayList<Mesa>();
	private String estado;
	private int hijos;
	private String NombreYApellido;
	private LocalDate fechaDeNacimiento;
	private double cantidadRecaudada;
	
	
	public Mozo(ArrayList<Mesa> mesas, String estado, int hijos, String nombreYApellido, LocalDate fechaDeNacimiento) {
		super();
		this.mesas = mesas;
		this.estado = estado;
		this.hijos = hijos;
		NombreYApellido = nombreYApellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
	public ArrayList<Mesa> getMesas() {
		return mesas;
	}
	public void setMesas(ArrayList<Mesa> mesas) {
		this.mesas = mesas;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getHijos() {
		return hijos;
	}
	public void setHijos(int hijos) {
		this.hijos = hijos;
	}
	public String getNombreYApellido() {
		return NombreYApellido;
	}
	public void setNombreYApellido(String nombreYApellido) {
		NombreYApellido = nombreYApellido;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public void agregarMesa(Mesa mesa) {
		mesas.add(mesa);
	}
	
}
