package main;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mozo {
	private ArrayList<Mesa> mesas = new ArrayList<Mesa>();
	private int estado;
	private int hijos;
	private String NombreYApellido;
	private LocalDate fechaDeNacimiento;
	
	
	
	public Mozo(ArrayList<Mesa> mesas, int estado, int hijos, String nombreYApellido, LocalDate fechaDeNacimiento) {
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
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
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
	
	
}
