package main;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {
	//ArrayList de promociones
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private LocalDate fecha= LocalDate.now();
	private String formaDePago;
	private Mesa mesa;
	private double total;
	
	
	
	public Factura(ArrayList<Pedido> pedidos, String formaDePago, Mesa mesa, double total) {
		super();
		this.pedidos = pedidos;
		this.formaDePago = formaDePago;
		this.mesa = mesa;
		this.total = total;
	}
	
	
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public String getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	
	
}
