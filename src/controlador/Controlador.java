package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Ventana.IVista;
import Ventana.VentanaAdministrador;
import excepciones.ContraseniaIncorrectaException;
import excepciones.MesaYaExistenteException;
import excepciones.NegativoException;
import excepciones.NoHayPromoException;
import excepciones.OperarioDuplicadoException;
import excepciones.UsuarioIncorrectoException;
import main.Mesa;
import main.Operario;
import main.PromocionPermanente;
import main.PromocionTemporal;
import main.Sistema;

public class Controlador implements ActionListener {
	
	VentanaAdministrador v;
	private static Controlador instancia = null;
	Sistema sistema = null;
	Boolean primeraVez=true;
	
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
			sistema.setNombre(v.getTextFieldNombreLocal());
			v.setLblNombreLocalGrande(sistema.getNombre());
		}else if(e.getActionCommand().equals(IVista.guardaSistema)) {
			
		}else if(e.getActionCommand().equals(IVista.recuperaSistema)) {
			
		}else if(e.getActionCommand().equals(IVista.confirmaLoginUsuario)) {
			if(v.getTextFieldLoginUsuario().equals("ADMIN")) {
				try {
					sistema.loginAdmin(v.getTextFieldLoginUsuario(), v.getTextFieldLoginContrasenia());
					if(primeraVez) {
						sistema.getAdmin().setPassword(v.passwordNueva());
						sistema.getAdmin().setNombreYApellido(v.NyANueva());
					}
					v.logueoAdmin();
				} catch (ContraseniaIncorrectaException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UsuarioIncorrectoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else {
				try {
					sistema.loginOperario(v.getTextFieldLoginUsuario(), v.getTextFieldLoginContrasenia());
					v.logueoOperario();
				} catch (ContraseniaIncorrectaException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UsuarioIncorrectoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}else if(e.getActionCommand().equals(IVista.confirmaLogoutUsuario)) {
			v.logout();
		}else if(e.getActionCommand().equals(IVista.confirmaEstadoMozoDia)) { //Ventana general
			
		}else if(e.getActionCommand().equals(IVista.asociaMozoAMesa)) {
			
		}else if(e.getActionCommand().equals(IVista.ocupaMesa)) {
			
		}else if(e.getActionCommand().equals(IVista.agregaPedido)) {
			
		}else if(e.getActionCommand().equals(IVista.cerrarComanda)) {
			
		}else if(e.getActionCommand().equals(IVista.crearOperario)) { //Ventana operarios y mesa
			try {
				sistema.agregaOperario(new Operario(v.getTextFieldOperarioUsuarioAlta(),v.getTextFieldOperarioContraseniaAlta(),v.getTextFieldOperarioNyAAlta()));
				v.actualizarListaOperarios();
			} catch (OperarioDuplicadoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(e.getActionCommand().equals(IVista.eliminarOperario)) {
			
		}else if(e.getActionCommand().equals(IVista.modificarOperario)) {
			
		}else if(e.getActionCommand().equals(IVista.crearMesa)) {
			try {
				sistema.agregaMesa(v.getTextFieldMesaNumeroAlta(),v.getTextFieldMesaCantidadComensalesAlta());
				v.actualizarListaMesas();
			} catch (MesaYaExistenteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(e.getActionCommand().equals(IVista.eliminarMesa)) {
			
		}else if(e.getActionCommand().equals(IVista.modificarMesa)) {
			
		}else if(e.getActionCommand().equals(IVista.crearPromPerm)) { //Ventana promociones VER LO DE COMO METER EL PRODUCTO AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
			boolean dosPorUno,dtoPorCantidad;
			if(v.getComboBoxPromPermDosPorUnoAlta().equals("Si")) 
				dosPorUno=true;
			else
				dosPorUno=false;
			if(v.getComboBoxPromPermDtoPorCantAlta().equals("Si")) 
				dtoPorCantidad=true;
			else
				dtoPorCantidad=false;
			try {
				sistema.agregaPromocionPermanente(new PromocionPermanente(true,v.getComboBoxPromPermDiasAlta(),null,dosPorUno,dtoPorCantidad,
						v.getTextFieldPromPermDtoPorCantMinimoAlta(),v.getTextFieldPromPermDtoPorCantPrecioUnitarioAlta()));
				v.actualizarListaPromPerm();
			} catch (NoHayPromoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (NegativoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(e.getActionCommand().equals(IVista.eliminarPromPerm)) {
			
		}else if(e.getActionCommand().equals(IVista.modificarPromPerm)) {
			
		}else if(e.getActionCommand().equals(IVista.crearPromTemp)) {
			boolean acumulable;
			if(v.getComboBoxPromTempAcumulableAlta().equals("Si"))
				acumulable=true;
			else
				acumulable=false;
			sistema.agregaPromocionTemporal(new PromocionTemporal(true,v.getComboBoxPromTempDiasAlta(),v.getTextFieldPromTempNombreAlta(),
					v.getTextFieldPromTempPorcentajeDtoAlta(),acumulable,v.getComboBoxPromTempMetodoPagoAlta()));
			v.actualizarListaPromTemp();
			
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
	
	public ArrayList<Operario> recuperaListaOperarios() {
		return sistema.getOperarios();
	}
	
	public ArrayList<Mesa> recuperaListaMesas() {
		return sistema.getMesas();
	}

	public ArrayList<PromocionPermanente> recuperaListaPromPerm() {
		// TODO Auto-generated method stub
		return sistema.getPromosFijas();
	}
	
	public ArrayList<PromocionTemporal> recuperaListaPromTemp() {
		// TODO Auto-generated method stub
		return sistema.getPromosTemporales();
	}
}
