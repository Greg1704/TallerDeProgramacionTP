package main;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Factura implements Serializable{
	//ArrayList de promociones
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private ArrayList<Promocion> promocionesAplicadas = new ArrayList<Promocion>();
	private LocalDate fecha= LocalDate.now();
	private String formaDePago;
	private Mesa mesa;
	private double total;
	private Mozo mozo;
	
	
	public Factura(ArrayList<Pedido> pedidos,ArrayList<Promocion> promocionesAplicadas,String formaDePago, Mesa mesa, double total,Mozo mozo) {
		this.pedidos = pedidos;
		this.promocionesAplicadas = promocionesAplicadas;
		this.formaDePago = formaDePago;
		this.mesa = mesa;
		this.total = total;
		this.mozo = mozo;
	}
	
	
	public Mozo getMozo() {
		return mozo;
	}
	public void setMozo(Mozo mozo) {
		this.mozo = mozo;
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
	public ArrayList<Promocion> getPromocionesAplicadas() {
		return promocionesAplicadas;
	}
	public void setPromocionesAplicadas(ArrayList<Promocion> promocionesAplicadas) {
		this.promocionesAplicadas = promocionesAplicadas;
	}
	
	
}
