package main;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

import excepciones.HijosNegativosException;
import excepciones.MenorDeDieciochoException;

public class Mozo implements Serializable{
	private transient ArrayList<Mesa> mesas = new ArrayList<Mesa>();
	private transient String estado;
	private int hijos;
	private String NombreYApellido;
	private LocalDate fechaDeNacimiento;
	private double cantidadRecaudada;
	private int mesasAtendidas;
	private LocalDate today; 

	
	/**
	 * @param estado
	 * @param hijos
	 * @param nombreYApellido
	 * @param fechaDeNacimiento
	 * @throws HijosNegativosException
	 * @throws MenorDeDieciochoException
	 */
	public Mozo(String estado, int hijos, String nombreYApellido, LocalDate fechaDeNacimiento) throws HijosNegativosException,MenorDeDieciochoException{
		this.estado = estado;
		this.NombreYApellido = nombreYApellido;
		this.mesasAtendidas = 0;
		this.cantidadRecaudada = 0;
		
		if (hijos < 0) {
			throw new HijosNegativosException();
		}else
			this.hijos = hijos;
		
		this.today = LocalDate.now();
		
		if(today.isBefore(fechaDeNacimiento.plusYears(18))) {
			throw new MenorDeDieciochoException();
		}else
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
	
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}


	/**
	 * @return
	 */
	public String datosEmpleado() {
		return this.NombreYApellido + " recaudo $" + this.cantidadRecaudada + " y atendio " + this.mesasAtendidas + " mesas.";
	}


	public String toStringGeneral() {
		return "NombreYApellido: " + NombreYApellido +" Estado: " + estado;
	}
	
	public void inicializaArrayList() {
		this.mesas = new ArrayList<Mesa>();
	}
	
	@Override
	public String toString() {
		return "NombreYApellido: " + NombreYApellido +" Estado: " + estado + " Fecha de nacimiento: " + fechaDeNacimiento +" Cantidad de Hijos: " + hijos;
	}
	

}
