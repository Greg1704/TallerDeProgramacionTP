package main;

import java.time.LocalDate;
import java.util.ArrayList;

import excepciones.HijosNegativosException;

public class Mozo {
	private ArrayList<Mesa> mesas = new ArrayList<Mesa>();
	private String estado;
	private int hijos;
	private String NombreYApellido;
	private LocalDate fechaDeNacimiento;
	private double cantidadRecaudada;
	private int mesasAtendidas;
	
	public Mozo(ArrayList<Mesa> mesas, String estado, int hijos, String nombreYApellido, LocalDate fechaDeNacimiento) throws HijosNegativosException{
		this.mesas = mesas;
		this.estado = estado;
		this.hijos = hijos;
		this.NombreYApellido = nombreYApellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.mesasAtendidas = 0;
		this.cantidadRecaudada = 0;
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
	public double getCantidadRecaudada() {
		return cantidadRecaudada;
	}
	public void setCantidadRecaudada(double cantidadRecaudada) {
		this.cantidadRecaudada = cantidadRecaudada;
	}
	public int getMesasAtendidas() {
		return mesasAtendidas;
	}
	public void setMesasAtendidas(int mesasAtendidas) {
		this.mesasAtendidas = mesasAtendidas;
	}
	
	public String datosEmpleado() {
		
		return this.NombreYApellido + " recaudo $" + this.cantidadRecaudada + " y atendio " + this.mesasAtendidas + " mesas.";
		
	}

}
