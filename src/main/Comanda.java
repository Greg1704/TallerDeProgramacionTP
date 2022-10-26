package main;

import java.time.LocalDate;
import java.util.ArrayList;

import excepciones.MesaNoAsignadaException;

public class Comanda {
	private ArrayList<Pedido> pedidos = new ArrayList<>();
	private String estado;
	private LocalDate fecha= LocalDate.now();
	private Mesa mesa;
	private Mozo mozo;
	
	
	public Comanda(Mesa mesa) {
		super();
		this.estado = "Abierta";
		this.mesa = mesa;
	}
	
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void obtenerMozo() throws MesaNoAsignadaException{
		if (Sistema.getInstancia().buscaMozo(mesa) == null) 
			throw new MesaNoAsignadaException();
		else
			this.mozo = Sistema.getInstancia().buscaMozo(mesa);
	}
	
}
