package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Ventana.IVista;
import Ventana.VentanaAdministrador;
import excepciones.ContraseniaIncorrectaException;
import excepciones.HijosNegativosException;
import excepciones.MesaYaExistenteException;
import excepciones.MozoDuplicadoException;
import excepciones.NegativoException;
import excepciones.NoHayPromoException;
import excepciones.OperarioDuplicadoException;
import excepciones.PrecioVentaMenorCostoException;
import excepciones.ProductoDuplicadoException;
import excepciones.UsuarioIncorrectoException;
import main.Mesa;
import main.Mozo;
import main.Operario;
import main.Producto;
import main.PromocionPermanente;
import main.PromocionTemporal;
import main.Sistema;

public class Controlador implements ActionListener {
	
	VentanaAdministrador v;
	private static Controlador instancia = null;
	Sistema sistema = null;
	Boolean primeraVez=false;
	Operario operario=null;
	Mesa mesa=null;
	Mozo mozo=null;
	
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
			primeraVez=true;
		}else if(e.getActionCommand().equals(IVista.guardaSistema)) {
			
		}else if(e.getActionCommand().equals(IVista.recuperaSistema)) {
			
		}else if(e.getActionCommand().equals(IVista.confirmaLoginUsuario)) {
			if(v.getTextFieldLoginUsuario().equals("ADMIN")) {
				try {
					sistema.loginAdmin(v.getTextFieldLoginUsuario(), v.getTextFieldLoginContrasenia());
					if(primeraVez) {
						sistema.getAdmin().setPassword(v.passwordNueva());
						sistema.getAdmin().setNombreYApellido(v.NyANueva());
						primeraVez=false;
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
			sistema.sacaOperario(v.getSelectedOperario());
			v.actualizarListaOperarios();
		}else if(e.getActionCommand().equals(IVista.modificarOperario)) {
			operario = v.getSelectedOperario();
			if(!operario.getNombreDeUsuario().equals(v.getTextFieldOperarioUsuarioModif()))
				operario.setNombreDeUsuario(v.getTextFieldOperarioUsuarioModif());
			if(!operario.getPassword().equals(v.getTextFieldOperarioContraseniaModif()))
				operario.setPassword(v.getTextFieldOperarioContraseniaModif());
			if(!operario.getNombreYApellido().equals(v.getTextFieldOperarioNyAModif()))
				operario.setNombreYApellido(v.getTextFieldOperarioNyAModif());
		    if(operario.isActivo() == true && v.getComboBoxOperarioEstadoModif().equals("Inactivo"))
		    	operario.setActivo(false);
		    if(operario.isActivo() == false && v.getComboBoxOperarioEstadoModif().equals("Activo"))
		    	operario.setActivo(true);
		    v.actualizarListaOperarios();
		}else if(e.getActionCommand().equals(IVista.crearMesa)) {
			try {
				sistema.agregaMesa(v.getTextFieldMesaNumeroAlta(),v.getTextFieldMesaCantidadComensalesAlta());
				v.actualizarListaMesas();
			} catch (MesaYaExistenteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(e.getActionCommand().equals(IVista.eliminarMesa)) {
			sistema.sacaMesa(v.getSelectedMesa());
			v.actualizarListaMesas();
		}else if(e.getActionCommand().equals(IVista.modificarMesa)) {
			mesa = v.getSelectedMesa();
			if(mesa.getNumero() != v.getTextFieldMesaNumeroModif())
				mesa.setNumero(v.getTextFieldMesaNumeroModif());
			if(mesa.getComensales() != v.getTextFieldMesaCantidadComensalesModif()) {
				mesa.setComensales(v.getTextFieldMesaCantidadComensalesModif());
			}
			v.actualizarListaMesas();
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
			try {
				sistema.agregaMozo(new Mozo(null,"ausente",v.getTextFieldMozoHijosAlta(),v.getTextFieldMozoNyAAlta(),v.getFormattedTextFieldFechaNacimientoAlta()));
				v.actualizarListaMozos();
			} catch (MozoDuplicadoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (HijosNegativosException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}else if(e.getActionCommand().equals(IVista.eliminarMozo)) {
			sistema.sacaMozo(v.getSelectedMozo());
			v.actualizarListaMozos();
		}else if(e.getActionCommand().equals(IVista.modificarMozo)) {
			mozo = v.getSelectedMozo();
			if(!mozo.getNombreYApellido().equals(v.getTextFieldMozoNyAModif()))
				mozo.setNombreYApellido(v.getTextFieldMozoNyAModif());
			if(!mozo.getFechaDeNacimiento().equals(v.getFormattedTextFieldFechaNacimientoModif()))
				mozo.setFechaDeNacimiento(v.getFormattedTextFieldFechaNacimientoModif());
			if(mozo.getHijos() != v.getTextFieldMozoHijosModif())
				mozo.setHijos(v.getTextFieldMozoHijosModif());
			v.actualizarListaMozos();
		}else if(e.getActionCommand().equals(IVista.estadEmpleado)) {
			
		}else if(e.getActionCommand().equals(IVista.estadEmpleadoMayorVol)) {
			
		}else if(e.getActionCommand().equals(IVista.estadEmpleadoMenorVol)) {
			
		}else if(e.getActionCommand().equals(IVista.estadPromMesas)) {
			
		}else if(e.getActionCommand().equals(IVista.crearProducto)) { //Ventana productos
			try {
				sistema.agregaProductos(new Producto(v.getTextFieldProductoNombreAlta(),v.getTextFieldProductoPrecioCostoAlta(),v.getTextFieldProductoPrecioVentaAlta(),v.getTextFieldProductoStockInicialAlta()));
				v.actualizarListaProductos();
			} catch (ProductoDuplicadoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (NegativoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (PrecioVentaMenorCostoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(e.getActionCommand().equals(IVista.eliminarProducto)) {
			
		}else if(e.getActionCommand().equals(IVista.modificarProducto)) {
			
		}else if(e.getActionCommand().equals(IVista.actualizarStockProducto)) {
			
		}
		
		
	}
	
	
	public boolean existeSistema() {
		return sistema != null ;
	}
	
	public void recuperaDatosOperario(Operario operario) {
		String activo;
		v.setTextFieldOperarioUsuarioModif(operario.getNombreDeUsuario());
		v.setTextFieldOperarioContraseniaModif(operario.getPassword());
		v.setTextFieldOperarioNyAModif(operario.getNombreYApellido());
		if(operario.isActivo())
			activo = "Activo";
		else
			activo = "Inactivo";
		v.setComboBoxOperarioEstadoModif(activo);
	}
	
	public void recuperaDatosMesa(Mesa mesa) {
		// TODO Auto-generated method stub
		v.setTextFieldMesaNumeroModif(mesa.getNumero());
		v.setTextFieldMesaCantidadComensalesModif(mesa.getComensales());
	}
	
	public void recuperaDatosMozo(Mozo mozo) {
		// TODO Auto-generated method stub
		v.setTextFieldMozoNyAModif(mozo.getNombreYApellido());
		v.setTextFieldMozoHijosModif(mozo.getHijos());
		v.setFormattedTextFieldFechaNacimientoModif(mozo.getFechaDeNacimiento());
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
	
	public ArrayList<Mozo> recuperaListaMozos() {
		// TODO Auto-generated method stub
		return sistema.getMozos();
	}
	
	public ArrayList<Producto> recuperaListaProductos() {
		// TODO Auto-generated method stub
		return sistema.getProducto();
	}

	
}
