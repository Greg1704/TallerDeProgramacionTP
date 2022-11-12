package main;

import java.time.LocalDate;
import java.util.ArrayList;

import excepciones.MesaNoAsignadaException;
import excepciones.StockNegativoException;

public class Comanda {
	private ArrayList<Pedido> pedidos = new ArrayList<>();
	private String estado;
	private LocalDate fecha = LocalDate.now();
	private Mesa mesa;
	private Mozo mozo;
	
	
	public Comanda(Mesa mesa) throws MesaNoAsignadaException {
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

	/**
	 * Metodo que invoca al metodo "buscaMozo" del sistema. <br>
	 * @return Objeto de tipo Mesa.
	 * @throws MesaNoAsignadaException Se lanza cuando una mesa no fue asignada a ningun mozo.
	 */
	public Mozo obtenerMozo() throws MesaNoAsignadaException{
		if (Sistema.getInstancia().buscaMozo(mesa) == null) 
			throw new MesaNoAsignadaException();
		else
			return Sistema.getInstancia().buscaMozo(mesa);
	}
	
	/**
	 * Metodo utilizado para agregar un pedido a una comanda.<br>
	 * <b> Pre: </b> pedido debe ser distinto de null. <br>
	 * <b> Post: </b> Se agrega un producto al arreglo de Pedidos. <br>
	 * @param pedido
	 */
	public void agregarPedido(Pedido pedido){
		int i;	
		boolean cumple = false;
		
		if(pedidos.isEmpty()) {
			pedidos.add(pedido);
		}else {
			i = 0;		
			while(i < pedidos.size() && !cumple) {			
				if(this.pedidos.get(i).getProducto().getNombre().equalsIgnoreCase(pedido.getProducto().getNombre())) { //si entra significa que producto ya se pidio
					this.pedidos.get(i).setCantidad(this.pedidos.get(i).getCantidad() + pedido.getCantidad());
					cumple = true;
				}else {
					i++;
				}
			}
			
			if (!cumple) { //significa que no existia el producto no se habia pedido
				pedidos.add(pedido);
			}		
		}	
	}

	@Override
	public String toString() {
		return  "Mesa: " + mesa.getNumero() + " Estado: " + estado + " Fecha: " + fecha;
	}

	
}
