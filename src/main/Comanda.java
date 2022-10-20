package main;

import java.time.LocalDate;
import java.util.ArrayList;

public class Comanda {
	private ArrayList<Pedido> pedidos = new ArrayList<>();
	private String estado;
	private LocalDate fecha= LocalDate.now();
	private Mesa mesa;
	
	
	
	
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
	
	
	
}
