package main;

import java.time.LocalDate;
import java.util.ArrayList;

import excepciones.MesaNoAsignadaException;

public class Comanda {
	private ArrayList<Pedido> pedidos = new ArrayList<>();
	private String estado;
	private LocalDate fecha = LocalDate.now();
	private Mesa mesa;
	private Mozo mozo;
	
	
	public Comanda(Mesa mesa) throws MesaNoAsignadaException {
		super();
		this.estado = "Abierta";
		this.mesa = mesa;
		this.mozo = obtenerMozo();
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
	public Mozo getMozo() {
		return mozo;
	}
	public void setMozo(Mozo mozo) {
		this.mozo = mozo;
	}

	public Mozo obtenerMozo() throws MesaNoAsignadaException{
		if (Sistema.getInstancia().buscaMozo(mesa) == null) 
			throw new MesaNoAsignadaException();
		else
			return Sistema.getInstancia().buscaMozo(mesa);
	}
	
}
