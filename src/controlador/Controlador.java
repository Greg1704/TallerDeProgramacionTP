package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ventana.IVista;
import Ventana.VentanaAdministrador;
import main.Sistema;

public class Controlador implements ActionListener {
	
	VentanaAdministrador v;
	private static Controlador instancia = null;
	Sistema sistema = null;
	
	private Controlador () {
		this.v = new VentanaAdministrador();
		this.v.setControlador(this);
	}
	
	public static Controlador getInstancia() {
		if (instancia == null)
			instancia = new Controlador();
		return instancia;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals(IVista.nuevoSistema)) {  //Ventana login
			sistema = Sistema.getInstancia();
			sistema.setNombre(v.getTextFieldNombreLocal()); //Conseguir dato de ventana
		}else if(e.getActionCommand().equals(IVista.guardaSistema)) {
			
		}else if(e.getActionCommand().equals(IVista.recuperaSistema)) {
			
		}else if(e.getActionCommand().equals(IVista.confirmaLoginUsuario)) {
			
		}else if(e.getActionCommand().equals(IVista.confirmaLogoutUsuario)) {
			
		}else if(e.getActionCommand().equals(IVista.confirmaEstadoMozoDia)) { //Ventana general
			
		}else if(e.getActionCommand().equals(IVista.asociaMozoAMesa)) {
			
		}else if(e.getActionCommand().equals(IVista.ocupaMesa)) {
			
		}else if(e.getActionCommand().equals(IVista.agregaPedido)) {
			
		}else if(e.getActionCommand().equals(IVista.cerrarComanda)) {
			
		}else if(e.getActionCommand().equals(IVista.crearOperario)) { //Ventana operarios y mesa
			
		}else if(e.getActionCommand().equals(IVista.eliminarOperario)) {
			
		}else if(e.getActionCommand().equals(IVista.modificarOperario)) {
			
		}else if(e.getActionCommand().equals(IVista.crearMesa)) {
			
		}else if(e.getActionCommand().equals(IVista.eliminarMesa)) {
			
		}else if(e.getActionCommand().equals(IVista.modificarMesa)) {
			
		}else if(e.getActionCommand().equals(IVista.crearPromPerm)) { //Ventana promociones
			
		}else if(e.getActionCommand().equals(IVista.eliminarPromPerm)) {
			
		}else if(e.getActionCommand().equals(IVista.modificarPromPerm)) {
			
		}else if(e.getActionCommand().equals(IVista.crearPromTemp)) {
			
		}else if(e.getActionCommand().equals(IVista.eliminarPromTemp)) {
			
		}else if(e.getActionCommand().equals(IVista.modificarPromTemp)) {
			
		}else if(e.getActionCommand().equals(IVista.crearMozo)) { //Ventana mozos
			
		}else if(e.getActionCommand().equals(IVista.eliminarMozo)) {
			
		}else if(e.getActionCommand().equals(IVista.modificarMozo)) {
			
		}else if(e.getActionCommand().equals(IVista.estadEmpleado)) {
			
		}else if(e.getActionCommand().equals(IVista.estadEmpleadoMayorVol)) {
			
		}else if(e.getActionCommand().equals(IVista.estadEmpleadoMenorVol)) {
			
		}else if(e.getActionCommand().equals(IVista.estadPromMesas)) {
			
		}else if(e.getActionCommand().equals(IVista.crearProducto)) { //Ventana productos
			
		}else if(e.getActionCommand().equals(IVista.eliminarProducto)) {
			
		}else if(e.getActionCommand().equals(IVista.modificarProducto)) {
			
		}else if(e.getActionCommand().equals(IVista.actualizarStockProducto)) {
			
		}
		
		
	}
	
	
	public boolean existeSistema() {
		return sistema != null ;
	}
}
