package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Ventana.IVista;
import Ventana.VentanaAdministrador;
import excepciones.ComensalesInsuficientesException;
import excepciones.ContraseniaIncorrectaException;
import excepciones.ContraseniaNoCreadaException;
import excepciones.HijosNegativosException;
import excepciones.MenorDeDieciochoException;
import excepciones.MesaNoAsignadaException;
import excepciones.MesaNoExistenteException;
import excepciones.MesaOcupadaException;
import excepciones.MesaYaExistenteException;
import excepciones.MozoDuplicadoException;
import excepciones.NegativoException;
import excepciones.NoHayDosPromosException;
import excepciones.NoHayMozosException;
import excepciones.NoHayProductosException;
import excepciones.NoHayPromoException;
import excepciones.OperarioDuplicadoException;
import excepciones.PedidoAsociadoAComandaException;
import excepciones.PrecioVentaMenorCostoException;
import excepciones.ProductoDuplicadoException;
import excepciones.StockNegativoException;
import excepciones.UsuarioIncorrectoException;
import main.Comanda;
import main.Mesa;
import main.Mozo;
import main.Operario;
import main.Pedido;
import main.Producto;
import main.PromocionPermanente;
import main.PromocionTemporal;
import main.Sistema;
import persistencia.PersistirSistema;

public class Controlador implements ActionListener {
	
	VentanaAdministrador v;
	private static Controlador instancia = null;
	Sistema sistema = null;
	Boolean primeraVez=false;
	Operario operario=null;
	Mesa mesa=null;
	Mozo mozo=null;
	Producto producto=null;
	PromocionPermanente promPerm = null;
	PromocionTemporal promTemp = null;
	Pedido pedido;
	Comanda comanda;
	
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
			v.popUp("Sistema creado");
			v.sistemaInicio();
		}else if(e.getActionCommand().equals(IVista.guardaSistema)) {
			PersistirSistema.EscrituraSistema();
			v.popUp("Sistema guardado");
			v.sistemaInicio();
		}else if(e.getActionCommand().equals(IVista.recuperaSistema)) {
			PersistirSistema.LecturaSistema();
			sistema=Sistema.getInstancia();
			//v.popUp("Sistema recuperado");
			v.setLblNombreLocalGrande(sistema.getNombre());
			if(sistema != null)
				v.sistemaInicio();
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
					v.popUp(e1.getMessage());
				} catch (UsuarioIncorrectoException e1) {
					// TODO Auto-generated catch block
					v.popUp(e1.getMessage());
				} catch (ContraseniaNoCreadaException e1) {
					// TODO Auto-generated catch block
					v.popUp(e1.getMessage());
				}
			}else {
				try {
					sistema.loginOperario(v.getTextFieldLoginUsuario(), v.getTextFieldLoginContrasenia());
					v.logueoOperario();
				} catch (ContraseniaIncorrectaException e1) {
					// TODO Auto-generated catch block
					v.popUp(e1.getMessage());
				} catch (UsuarioIncorrectoException e1) {
					// TODO Auto-generated catch block
					v.popUp(e1.getMessage());
				}
			}
		}else if(e.getActionCommand().equals(IVista.confirmaLogoutUsuario)) {
			v.logout();
		}else if(e.getActionCommand().equals(IVista.confirmaEstadoMozoDia)) { //Ventana general
			mozo = v.getSelectedMozoEstado();
			if(v.getRdbtnEstadoActivo()) 
				mozo.setEstado("Activo");
			else if(v.getRdbtnEstadoAusente())
				mozo.setEstado("Ausente");
			else if(v.getRdbtnEstadoDeFranco())
				mozo.setEstado("De franco");
			v.actualizarListaMozos();
			v.actualizarListaMozosActivos();
			v.actualizarListaMozosEstados();
		}else if(e.getActionCommand().equals(IVista.asociaMozoAMesa)) {
			mesa = v.getSelectedMesaAsignable();
			mozo = v.getSelectedMozoActivo();
			mozo.agregarMesa(mesa); 
			v.actualizarListaMesas();
			v.actualizarListaMesasAsignables();
		}else if(e.getActionCommand().equals(IVista.ocupaMesa)) {
			
			mesa = v.getSelectedMesaAsignable();
			try {
				sistema.ocupaMesa(mesa.getNumero(), v.getTextFieldOcupacionComensales());
				v.actualizarListaMesasAsignables();
				v.actualizarListaMesas();
				v.actualizarListaComandasActivas();
			} catch (MesaNoExistenteException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			} catch (ComensalesInsuficientesException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			} catch (MesaOcupadaException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			} catch (NoHayProductosException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			} catch (MesaNoAsignadaException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			} catch (NoHayMozosException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			} catch (NoHayDosPromosException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			}
			
		}else if(e.getActionCommand().equals(IVista.agregaPedido)) {
			
			try {
				pedido = new Pedido(v.getTextFieldCantidadProducto(),v.getSelectedProductoGeneral());
				comanda = v.getSelectedComandaActiva();
				comanda.agregarPedido(pedido);
				v.actualizarListaProductos();
			} catch (StockNegativoException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			} catch (NegativoException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			}
			
		}else if(e.getActionCommand().equals(IVista.cerrarComanda)) {
			comanda = v.getSelectedComandaActiva();
			sistema.cierraComanda(comanda, v.getComboBoxMetodoPagoGeneral());
			v.actualizarListaComandasActivas();
		}else if(e.getActionCommand().equals(IVista.crearOperario)) { //Ventana operarios y mesas
			try {
				sistema.agregaOperario(new Operario(v.getTextFieldOperarioUsuarioAlta(),v.getTextFieldOperarioContraseniaAlta(),v.getTextFieldOperarioNyAAlta()));
				v.actualizarListaOperarios();
			} catch (OperarioDuplicadoException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			} catch (ContraseniaNoCreadaException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			}
		}else if(e.getActionCommand().equals(IVista.eliminarOperario)) {
			sistema.sacaOperario(v.getSelectedOperario());
			v.actualizarListaOperarios();
		}else if(e.getActionCommand().equals(IVista.modificarOperario)) {
			operario = v.getSelectedOperario();
			if(!operario.getNombreDeUsuario().equals(v.getTextFieldOperarioUsuarioModif()))
				operario.setNombreDeUsuario(v.getTextFieldOperarioUsuarioModif());
			if(!operario.getPassword().equals(v.getTextFieldOperarioContraseniaModif()))
				try {
					operario.setPassword(v.getTextFieldOperarioContraseniaModif());
				} catch (ContraseniaNoCreadaException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
				v.actualizarListaMesasAsignables();
				v.cleanMesa();
			} catch (MesaYaExistenteException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			}
		}else if(e.getActionCommand().equals(IVista.eliminarMesa)) {
			sistema.sacaMesa(v.getSelectedMesa());
			v.actualizarListaMesas();
			v.actualizarListaMesasAsignables();
		}else if(e.getActionCommand().equals(IVista.modificarMesa)) {
			mesa = v.getSelectedMesa();
			if(mesa.getNumero() != v.getTextFieldMesaNumeroModif())
				mesa.setNumero(v.getTextFieldMesaNumeroModif());
			if(mesa.getComensales() != v.getTextFieldMesaCantidadComensalesModif()) {
				mesa.setComensales(v.getTextFieldMesaCantidadComensalesModif());
			}
			v.actualizarListaMesas();
			v.actualizarListaMesasAsignables();
		}else if(e.getActionCommand().equals(IVista.crearPromPerm)) {
			boolean dosPorUno,dtoPorCantidad;
			if(v.getComboBoxPromPermDosPorUnoAlta().equals("Si")) 
				dosPorUno=true;
			else
				dosPorUno=false;
			if(v.getComboBoxPromPermDtoPorCantAlta().equals("Si")) 
				dtoPorCantidad=true;
			else
				dtoPorCantidad=false;
			producto = sistema.buscaProducto(v.getComboBoxPromPermProductoAlta());
			try {
				sistema.agregaPromocionPermanente(new PromocionPermanente(true,v.getComboBoxPromPermDiasAlta(),producto,dosPorUno,dtoPorCantidad,
						v.getTextFieldPromPermDtoPorCantMinimoAlta(),v.getTextFieldPromPermDtoPorCantPrecioUnitarioAlta()));
				v.actualizarListaPromPerm();
			} catch (NoHayPromoException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			} catch (NegativoException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			}
		}else if(e.getActionCommand().equals(IVista.eliminarPromPerm)) {
			sistema.sacaPromocionPermanente(v.getSelectedPromPerm());
			v.actualizarListaPromPerm();
		}else if(e.getActionCommand().equals(IVista.modificarPromPerm)) {
			
			promPerm=v.getSelectedPromPerm();
			boolean activa,dosPorUno,dtoPorCantidad;
			
			if(v.getComboBoxPromPermEstadoModif().equals("Activa"))
				activa = true;
			else
				activa = false;
			
			if(activa != promPerm.isActivo())
				promPerm.setActivo(activa);
			
			if(!promPerm.getDiaDePromo().equals(v.getComboBoxPromPermDiasModif()))
				promPerm.setDiaDePromo(v.getComboBoxPromPermDiasModif());
			
			producto = sistema.buscaProducto(v.getComboBoxPromPermProductoModif());
			if(!producto.equals(promPerm.getProducto()))
				promPerm.setProducto(producto);
			if(v.getComboBoxPromPermDosPorUnoModif().equals("Si")) 
				dosPorUno=true;
			else
				dosPorUno=false;
			if(dosPorUno != promPerm.isAplicaDosPorUno())
				promPerm.setAplicaDosPorUno(dosPorUno);
			
			if(v.getComboBoxPromPermDtoPorCantModif().equals("Si")) 
				dtoPorCantidad=true;
			else
				dtoPorCantidad=false;
			
			if(dtoPorCantidad != promPerm.isAplicaDtoPorCantidad())
				promPerm.setAplicaDtoPorCantidad(dtoPorCantidad);
			
			if(v.getTextFieldPromPermDtoPorCantMinimoModif() != promPerm.getDtoPorCantidad_cantidadMinima())
				promPerm.setDtoPorCantidad_cantidadMinima(v.getTextFieldPromPermDtoPorCantMinimoModif());
			
			if(v.getTextFieldPromPermDtoPorCantPrecioUnitarioModif() != promPerm.getDtoPorCantidad_PrecioUnitario())
				promPerm.setDtoPorCantidad_PrecioUnitario(v.getTextFieldPromPermDtoPorCantPrecioUnitarioModif());
			
			v.actualizarListaPromPerm();
			
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
			sistema.sacaPromocionTemporal(v.getSelectedPromTemp());
			v.actualizarListaPromTemp();
			
		}else if(e.getActionCommand().equals(IVista.modificarPromTemp)) {
			
			boolean activo,acumulable;
			promTemp = v.getSelectedPromTemp();
			
			if(v.getComboBoxPromTempEstadoModif().equals("Activa"))
				activo = true;
			else
				activo = false;
			
			if(activo != promTemp.isActivo())
				promTemp.setActivo(activo);
			
			if(!promTemp.getDiaDePromo().equals(v.getComboBoxPromTempDiasModif()))
				promTemp.setDiaDePromo(v.getComboBoxPromTempDiasModif());
			
			if(!promTemp.getNombre().equals(v.getTextFieldPromTempNombreModif()))
				promTemp.setNombre(v.getTextFieldPromTempNombreModif());
			
			if(promTemp.getPorcentajeDeDto() != v.getTextFieldPromTempPorcentajeDtoModif())
				promTemp.setPorcentajeDeDto(v.getTextFieldPromTempPorcentajeDtoModif());
			
			if(v.getComboBoxPromTempAcumulableModif().equals("Si"))
				acumulable = true;
			else
				acumulable = false;
			
			if(promTemp.isEsAcumulable() != acumulable)
				promTemp.setEsAcumulable(acumulable);
			
			if(!promTemp.getFormaPago().equals(v.getComboBoxPromTempMetodoPagoModif()))
				promTemp.setFormaPago(v.getComboBoxPromTempMetodoPagoModif());
			
			v.actualizarListaPromTemp();
			
		}else if(e.getActionCommand().equals(IVista.crearMozo)) { //Ventana mozos
				try {
					sistema.agregaMozo(new Mozo("ausente",v.getTextFieldMozoHijosAlta(),v.getTextFieldMozoNyAAlta(),v.getFormattedTextFieldFechaNacimientoAlta()));
				} catch (MozoDuplicadoException e1) {
					// TODO Auto-generated catch block
					v.popUp(e1.getMessage());
				} catch (HijosNegativosException e1) {
					// TODO Auto-generated catch block
					v.popUp(e1.getMessage());
				} catch (MenorDeDieciochoException e1) {
					// TODO Auto-generated catch block
					v.popUp(e1.getMessage());
				}
				v.actualizarListaMozos();
				v.actualizarListaMozosEstados();
			
		}else if(e.getActionCommand().equals(IVista.eliminarMozo)) {
			sistema.sacaMozo(v.getSelectedMozo());
			v.actualizarListaMozos();
			v.actualizarListaMozosEstados();
		}else if(e.getActionCommand().equals(IVista.modificarMozo)) {
			mozo = v.getSelectedMozo();
			if(!mozo.getNombreYApellido().equals(v.getTextFieldMozoNyAModif()))
				mozo.setNombreYApellido(v.getTextFieldMozoNyAModif());
			if(!mozo.getFechaDeNacimiento().equals(v.getFormattedTextFieldFechaNacimientoModif()))
				mozo.setFechaDeNacimiento(v.getFormattedTextFieldFechaNacimientoModif());
			if(mozo.getHijos() != v.getTextFieldMozoHijosModif())
				mozo.setHijos(v.getTextFieldMozoHijosModif());
			v.actualizarListaMozos();
			v.actualizarListaMozosEstados();
		}else if(e.getActionCommand().equals(IVista.estadEmpleado)) {
			mozo = v.getSelectedMozo();
			v.actualizarTextAreaEstadisticas(sistema.retornaEstadisticasMozo(mozo.getNombreYApellido()));
			
		}else if(e.getActionCommand().equals(IVista.estadEmpleadoMayorVol)) {
			v.actualizarTextAreaEstadisticas(sistema.informeMasVende());
			
		}else if(e.getActionCommand().equals(IVista.estadEmpleadoMenorVol)) {
			v.actualizarTextAreaEstadisticas(sistema.informeMenosVende());
			
		}else if(e.getActionCommand().equals(IVista.estadPromMesas)) {
			for(int i=0;i<sistema.getMesas().size();i++)
				v.actualizarTextAreaEstadisticas(sistema.retornaMesaConEstadisticas(i));
			
		}else if(e.getActionCommand().equals(IVista.crearProducto)) { //Ventana productos
			try {
				sistema.agregaProductos(new Producto(v.getTextFieldProductoNombreAlta(),v.getTextFieldProductoPrecioCostoAlta(),v.getTextFieldProductoPrecioVentaAlta(),v.getTextFieldProductoStockInicialAlta()));
				v.actualizarListaProductos();
				v.actualizarComboBoxProductosAlta();
				v.actualizarComboBoxProductosModif();
			} catch (ProductoDuplicadoException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			} catch (NegativoException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			} catch (PrecioVentaMenorCostoException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			}
		}else if(e.getActionCommand().equals(IVista.eliminarProducto)) {
			try {
				sistema.sacaProducto(v.getSelectedProducto());
			} catch (PedidoAsociadoAComandaException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			}
			v.actualizarListaProductos();
			v.actualizarComboBoxProductosAlta();
			v.actualizarComboBoxProductosModif();
		}else if(e.getActionCommand().equals(IVista.modificarProducto)) {
			producto = v.getSelectedProducto();
			if(!producto.getNombre().equals(v.getTextFieldProductoNombreModif()))
				producto.setNombre(v.getTextFieldProductoNombreModif());
			if(producto.getPrecioDeCosto() != v.getTextFieldProductoPrecioCostoModif()){
				try {
					producto.setPrecioDeCosto(v.getTextFieldProductoPrecioCostoModif());
				} catch (NegativoException e1) {
					// TODO Auto-generated catch block
					v.popUp(e1.getMessage());
				} catch (PrecioVentaMenorCostoException e1) {
					// TODO Auto-generated catch block
					v.popUp(e1.getMessage());
				}
			}
			if(producto.getPrecioDeVenta() != v.getTextFieldProductoPrecioVentaModif())
				try {
					producto.setPrecioDeVenta(v.getTextFieldProductoPrecioVentaModif());
				} catch (NegativoException e1) {
					// TODO Auto-generated catch block
					v.popUp(e1.getMessage());
				} catch (PrecioVentaMenorCostoException e1) {
					// TODO Auto-generated catch block
					v.popUp(e1.getMessage());
				}
			if(producto.getStock() != v.getTextFieldProductoStockInicialModif())
				try {
					producto.setStock(v.getTextFieldProductoStockInicialModif());
				} catch (NegativoException e1) {
					// TODO Auto-generated catch block
					v.popUp(e1.getMessage());
				}
			v.actualizarListaProductos();
			v.actualizarComboBoxProductosAlta();
			v.actualizarComboBoxProductosModif();
		}else if(e.getActionCommand().equals(IVista.actualizarStockProducto)) {
			producto = v.getSelectedProducto();
			try {
				producto.setStock(v.getTextFieldProductoNuevoStock());
			} catch (NegativoException e1) {
				// TODO Auto-generated catch block
				v.popUp(e1.getMessage());
			}
			v.actualizarListaProductos();
			v.actualizarComboBoxProductosAlta();
			v.actualizarComboBoxProductosModif();
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
	
	public void recuperaDatosProducto(Producto producto) {
		v.setTextFieldProductoNombreModif(producto.getNombre());
		v.setTextFieldProductoPrecioCostoModif(producto.getPrecioDeCosto());
		v.setTextFieldProductoPrecioVentaModif(producto.getPrecioDeVenta());
		v.setTextFieldProductoStockInicialModif(producto.getStock());
	}
	
	public void recuperarDatosPromPerm(PromocionPermanente promPerm) {
		String activa,dosPorUno,dtoCantidad;
		v.setTextFieldPromPermDtoPorCantMinimoModif(promPerm.getDtoPorCantidad_cantidadMinima());
		v.setTextFieldPromPermDtoPorCantPrecioUnitarioModif(promPerm.getDtoPorCantidad_PrecioUnitario());
		if(promPerm.isActivo())
			activa = "Activa";
		else
			activa = "Inactiva";
		v.setComboBoxPromPermEstadoModif(activa);
		v.setComboBoxPromPermDiasModif(promPerm.getDiaDePromo());
		if(promPerm.isAplicaDosPorUno())
			dosPorUno = "Si";
		else
			dosPorUno = "No";
		v.setComboBoxPromPermDosPorUnoModif(dosPorUno);
		if(promPerm.isAplicaDtoPorCantidad())
			dtoCantidad = "Si";
		else
			dtoCantidad = "No";
		v.setComboBoxPromPermDtoPorCantModif(dtoCantidad);
		v.setComboBoxPromPermProductoModif(promPerm.getProducto().getNombre());
	}
	
	public void recuperarDatosPromTemp(PromocionTemporal promTemp) {
		// TODO Auto-generated method stub
		String activo,acumulable;
		v.setComboBoxPromTempDiasModif(promTemp.getDiaDePromo());
		v.setTextFieldPromTempNombreModif(promTemp.getNombre());
		v.setTextFieldPromTempPorcentajeDtoModif(promTemp.getPorcentajeDeDto());
		v.setComboBoxPromTempMetodoPagoModif(promTemp.getFormaPago());
		if(promTemp.isActivo() == true)
			activo = "Activa";
		else
			activo = "Inactiva";
		v.setComboBoxPromTempEstadoModif(activo);
		
		if(promTemp.isEsAcumulable() == true)
			acumulable = "Si";
		else
			acumulable = "No";
		v.setComboBoxPromTempAcumulableModif(acumulable);
		
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
	
	public ArrayList<Comanda> recuperaListaComandas(){
		return sistema.getComandas();
	}

	public boolean mozoActivo(Mozo mozo) {
		if(mozo.getEstado().equals("Activo"))
			return true;
		else
			return false;
	}
	
	public boolean comandaActiva(Comanda comanda) {
		if(comanda.getEstado().equals("Abierta"))
			return true;
		else
			return false;
	}
	
	public void recuperaMensaje(String mensaje) {
		v.popUp(mensaje);
	}
	
	public VentanaAdministrador getVentana() {
		return this.v;
	}
	
}
