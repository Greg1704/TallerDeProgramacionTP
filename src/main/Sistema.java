package main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

import controlador.Controlador;
import excepciones.*;

/**
 * @author Tomi
 * <br>
 * Clase que representa al Administrador del sistema, solamente se puede crear 1. Almacena toda la informacion que se genera.
 */
public class Sistema {
	private ArrayList<PromocionPermanente> promosFijas = new ArrayList<PromocionPermanente>();
	private ArrayList<PromocionTemporal> promosTemporales = new ArrayList<PromocionTemporal>();
	private ArrayList<Comanda> comandas = new ArrayList<Comanda>();
	private ArrayList<Operario> operarios = new ArrayList<Operario>();
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private ArrayList<Mozo> mozos = new ArrayList<Mozo>();
	private ArrayList<Mesa> mesas = new ArrayList<Mesa>();
	private ArrayList<Factura> facturas = new ArrayList<Factura>();
	private String nombre;
	private Sueldo sueldo;
	private static Sistema instancia = null;
	private Operario admin;
	private transient String diaActual;
	private transient LocalDate diaHoy;
	
	/**
	 * Metodo que permite crear el operario <br>
	 */
	private Sistema() {
		try {
			admin = new Operario("ADMIN","ADMIN1234","");
		} catch (ContraseniaNoCreadaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Creacion de Operario Admin
	}
	
	public static Sistema getInstancia() {
		if(instancia == null)
			instancia = new Sistema();
		return instancia;
	}
	
	
	
	public ArrayList<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}
	public ArrayList<PromocionPermanente> getPromosFijas() {
		return promosFijas;
	}
	public void setPromosFijas(ArrayList<PromocionPermanente> promosFijas) {
		this.promosFijas = promosFijas;
	}
	public ArrayList<PromocionTemporal> getPromosTemporales() {
		return promosTemporales;
	}
	public void setPromosTemporales(ArrayList<PromocionTemporal> promosTemporales) {
		this.promosTemporales = promosTemporales;
	}
	public ArrayList<Comanda> getComandas() {
		return comandas;
	}
	public void setComandas(ArrayList<Comanda> comandas) {
		this.comandas = comandas;
	}
	public ArrayList<Operario> getOperarios() {
		return operarios;
	}
	public void setOperarios(ArrayList<Operario> operarios) {
		this.operarios = operarios;
	}
	public ArrayList<Producto> getProducto() {
		return productos;
	}
	public void setProducto(ArrayList<Producto> producto) {
		this.productos = producto;
	}
	public ArrayList<Mozo> getMozos() {
		return mozos;
	}
	public void setMozos(ArrayList<Mozo> mozos) {
		this.mozos = mozos;
	}
	public ArrayList<Mesa> getMesas() {
		return mesas;
	}
	public void setMesas(ArrayList<Mesa> mesas) {
		this.mesas = mesas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Sueldo getSueldo() {
		return sueldo;
	}
	public void setSueldo(Sueldo sueldo) {
		this.sueldo = sueldo;
	}
	public Operario getAdmin() {
		return admin;
	}
	public void setAdmin(Operario admin) {
		this.admin = admin;
	}

	
	/**
	 * Es el metodo que permite loguear al administrador al sistema<br>
	 * @param usuario
	 * @param password
	 * @return Un objeto de tipo Admin
	 * @throws ContraseniaIncorrectaException Se lanza cuando la contrasenia es incorrecta
	 * @throws UsuarioIncorrectoException se lanza si el nombre del usuario es incorrecto
	 */
	public Operario loginAdmin(String usuario,String password) throws ContraseniaIncorrectaException, UsuarioIncorrectoException{
		if(Sistema.getInstancia().getAdmin().getNombreDeUsuario().compareTo(usuario) == 0) {
			if(Sistema.getInstancia().getAdmin().getPassword().compareTo(password) == 0)
				return Sistema.getInstancia().getAdmin();
			else
				throw new ContraseniaIncorrectaException();
		}else
			throw new UsuarioIncorrectoException();
	}
	
	/**
	 * Es el metodo que permite loguear a un operario al sistema<br>
	 * @param usuario
	 * @param password
	 * @return Un objeto de tipo Admin
	 * @throws ContraseniaIncorrectaException Se lanza cuando la contrasenia es incorrecta
	 * @throws UsuarioIncorrectoException se lanza si el nombre del usuario es incorrecto
	 */
	public Operario loginOperario(String usuario,String password) throws ContraseniaIncorrectaException, UsuarioIncorrectoException {
		int i=0;
		while(i<operarios.size()) {
			if(Sistema.getInstancia().getOperarios().get(i).getNombreDeUsuario().compareTo(usuario) == 0 && this.operarios.get(i).isActivo()) {
				if(Sistema.getInstancia().getOperarios().get(i).getPassword().compareTo(password) == 0)
					return Sistema.getInstancia().getOperarios().get(i);
				else
					throw new ContraseniaIncorrectaException();
			}
			i++;
		}
		throw new UsuarioIncorrectoException();
	}
	
	/*
	public void estadoMozo(Mozo mozo, String estado) {
		int i=0;
		if(mozos.contains(mozo)) {
			while(!mozos.get(i).equals(mozo))
				i++;
			mozos.get(i).setEstado(estado);
		}
	}
	*/
	
	/**
	 * Metodo utilizado para agregar un operario al arraylist de Operarios <br>
	 * <b>Pre: </b> El objeto pasado por parametros debe ser de tipo Operario.<br>
	 * <b>Post: </b> Se almacena en el sistema un nuevo operario.<br>
	 * @param o Es un objeto de tipo operario.
	 * @throws OperarioDuplicadoException Se lanza cuando se quiere agregar un operario con datos similares a uno ya existente.
	 * 
	 */
	public void agregaOperario(Operario o) throws OperarioDuplicadoException{
		int j,i=0;
		
		j = this.operarios.size() ;
		
		while(i < j && !(this.operarios.get(i).getNombreDeUsuario().equalsIgnoreCase(o.getNombreDeUsuario()))) {
			i++;
		}
		
		if (i < j) {
			throw new OperarioDuplicadoException("Error: el operario ya existe en el sistema");
		}else {
			this.operarios.add(o) ;
		}
		
	}
	
	public void sacaOperario(Operario o){
		this.operarios.remove(o);
	}
	
	/**
	 * Metodo utilizado para agregar un mozo al arraylist de Mozo <br>
	 * <b>Pre: </b> El objeto pasado por parametros debe ser de tipo Operario.<br>
	 * <b>Post: </b> Se almacena en el sistema un nuevo mozo.<br>
	 * @param m Es un objeto de tipo mozo.
	 * @throws MozoDuplicadoException Se lanza cuando se quiere agregar un mozo con datos similares a uno ya existente.
	 */
	public void agregaMozo(Mozo m) throws MozoDuplicadoException{
		int j,i=0;
		
		j = this.mozos.size() ;
		
		while(i < j && !(this.mozos.get(i).getNombreYApellido().equalsIgnoreCase(m.getNombreYApellido()))) {
			i++;
		}
		
		if (i < j) {
			throw new MozoDuplicadoException("Error: el mozo ya existe en el sistema");
		}else {
			this.mozos.add(m) ;
		}
		
	}
	
	public void sacaMozo(Mozo m){ //throw exception que no cree
		this.mozos.remove(m);
	}
	
	/**
	 * Metodo utilizado para agregar un producto al arraylist de productos <br>
	 * <b>Pre: </b> El objeto pasado por parametros debe ser de tipo Producto.<br>
	 * <b>Post: </b> Se almacena en el sistema un nuevo producto.<br>
	 * @param p Es un objeto de tipo producto.
	 * @throws ProductoDuplicadoException Se lanza cuando se quiere agregar un producto con datos similares a uno ya existente.
	 */
	public void agregaProductos(Producto p) throws ProductoDuplicadoException{
		int j,i=0;
		
		j = this.productos.size() ;
		
		while(i < j && !(this.productos.get(i).getNombre().equalsIgnoreCase(p.getNombre()))) {
			i++;
		}
		
		if (i < j) {
			throw new ProductoDuplicadoException("Error: el producto ya existe en el sistema");
		}else {
			this.productos.add(p) ;
		}
	}
	
	/**
	 * Metodo utilizado para sacar un producto del sistema.
	 * <b>Pre: </b> El objeto pasado por parametros debe ser de tipo Producto y se debe encontrar en el sistema.<br>
	 * <b>Post: </b> Se borra del sistema el producto.<br>
	 * @param p Es un objeto de tipo Producto.
	 * @throws PedidoAsociadoAComandaException Se lanza si el pedido que se quiere eliminar se encuentra en una comanda activa.
	 */
	public void sacaProducto(Producto p) throws PedidoAsociadoAComandaException{
		Comanda com;
		Pedido ped;
		for(int i=0;i<this.comandas.size();i++) {
			com = comandas.get(i);
			for(int j=0;j<com.getPedidos().size();j++) {
				ped = com.getPedidos().get(j);
				if(ped.getProducto().equals(p))
					throw new PedidoAsociadoAComandaException();
			}
		}
		
		this.productos.remove(p);
	}
	
	public Producto buscaProducto(String nombre) {
		int i = 0;
		while (i<productos.size() && !this.productos.get(i).getNombre().equals(nombre))
			i++;
		return productos.get(i);
	}
	
	/**
	 * Metodo utilizado para agregar una mesa al arraylist de mesas <br>
	 * <b>Pre: </b> numero debe ser mayor o igual a 0, cantComensales debe ser mayor que 0.<br>
	 * <b>Post: </b> Se almacena en el sistema una nueva mesa.<br>
	 * @param numero Numero de la mesa.
	 * @param cantComensales Cantidad maxima de clientes que pueden ocupar la mesa.
	 * @throws MesaYaExistenteException Se lanza cuando se quiere agregar una mesa con datos similares a una ya existente.
	 */
	public void agregaMesa(int numero,int cantComensales) throws MesaYaExistenteException{
		for(int i=0;i<mesas.size();i++){
			if(this.mesas.get(i).getNumero() == numero)
				throw new MesaYaExistenteException();
		}
		mesas.add(new Mesa(cantComensales,"Libre",numero));
	}
	
	public void sacaMesa(Mesa mesa) {
		this.mesas.remove(mesa);
	}
	
	/**
	 * Metodo utilizado en el momento que se quiere ocupar una mesa, verificando que exista, se encuentre libre y que la cantidad de clientes que quieran ocuparla sea adecuada. <br>
	 * <b>Post: </b> Se ocupa una mesa. <br>
	 * @param numero Identificador de la mesa.
	 * @param cantComensales Cantidad de clientes que van a ocupar la mesa.
	 * @throws MesaNoExistenteException Se lanza si la mesa no se encuentra registrada en el sistema.
	 * @throws ComensalesInsuficientesException Se lanza en caso que sean menos de 2 comensales en una mesa o 1 en la barra.
	 * @throws MesaOcupadaException Se lanza si la mesa que se quiere ocupar estaba previamente ocupada.
	 * @throws NoHayProductosException Se lanza si no se encuentran productos en el sistema.
	 * @throws MesaNoAsignadaException Se lanza si previamente no se le asigno un mozo a la mesa.
	 * @throws NoHayMozosException Se lanza si no hay mozos registrados en el sistema.
	 * @throws NoHayDosPromosException Se lanza cuando no hay al menos 2 promos para productos en el sistema.
	 */
	public void ocupaMesa(int numero, int cantComensales) throws MesaNoExistenteException, ComensalesInsuficientesException, MesaOcupadaException, NoHayProductosException, MesaNoAsignadaException, NoHayMozosException, NoHayDosPromosException {
		int i=0,j=this.mesas.size();
		Mesa mesa;
		while(i<j && this.mesas.get(i).getNumero() != numero)
			i++;
		
		if(i == j) 
			throw new MesaNoExistenteException();
		else {
			mesa = this.mesas.get(i);
			if(mesa.getEstado().equals("Libre")) 
				if(((mesa.getNumero() != 0 && cantComensales>=2) || mesa.getNumero() == 0) && cantComensales <= mesa.getComensales()) { //Error del enunciado: (la cantidad de comensales debe ser > =2 cuando el nro de mesa es > 1) ??????
					this.comandas.add(creaComanda(mesa));  //Tal vez habria que hacer una funcion de la creacion de la comanda que verifique todos los requisitos
				}else
					throw new ComensalesInsuficientesException();
			else
				throw new MesaOcupadaException();
		}
	}
	
	

	/**
	 * Metodo encargado de verificar que se cumplan todas las condiciones para crear una comanda, y si se cumplen, crearla
	 * <b>Pre: </b> mesa debe ser distinto de null. <br>
	 * <b>Post: </b> Se crea un objeto de tipo comanda. <br>
	 * @param mesa 
	 * @return Un objeto de tipo Comanda.
	 * @throws NoHayProductosException Se lanza si no se encuentran productos en el sistema.
	 * @throws MesaNoAsignadaException Se lanza si previamente no se le asigno un mozo a la mesa.
	 * @throws NoHayMozosException Se lanza si no hay mozos registrados en el sistema.
	 * @throws NoHayDosPromosException Se lanza cuando no hay al menos 2 promos para productos en el sistema.
	 */
	public Comanda creaComanda(Mesa mesa) throws NoHayProductosException, MesaNoAsignadaException, NoHayMozosException, NoHayDosPromosException {
		int i = 0,j;
		boolean encontrado = false;
		boolean haymozo = false;
		
		if(this.productos.size() == 0)
			throw new NoHayProductosException();
		
		while(i < this.mozos.size() && !encontrado && this.mozos.get(i).getEstado().equalsIgnoreCase("Activo")) {
			j = 0;
			
			haymozo = true;
			while(j < this.mozos.get(i).getMesas().size() && !encontrado) {
				if(this.mozos.get(i).getMesas().get(j).getNumero() == mesa.getNumero()) {
					encontrado = true;
				}
				j++;
			}	
			i++;
		}
		
		if(!haymozo) {
			throw new NoHayMozosException("No hay mozos en el sistema.");
		}
		
		if(!encontrado) {
			throw new MesaNoAsignadaException();
		}
				
		if (!analizaDosOMasPromos()) {
			throw new NoHayDosPromosException();
		}
		
		mesa.setEstado("Ocupada");
		return new Comanda(mesa);
	}
	
	public void agregaPromocionPermanente(PromocionPermanente pp) {
		this.promosFijas.add(pp) ;
	}
	
	public void sacaPromocionPermanente(PromocionPermanente pp) {
		this.promosFijas.remove(pp);
	}
	
	public void agregaPromocionTemporal(PromocionTemporal pt) {
		this.promosTemporales.add(pt);
	}
	
	public void sacaPromocionTemporal(PromocionTemporal pt) {
		this.promosTemporales.remove(pt);
	}
	
	/**
	 * Metodo utilizado para corroborar si se cumple la condicion de existencia de dos o mas promociones en el sistema. <br>
	 * @return Un booleano.
	 */
	public boolean analizaDosOMasPromos() {
		int i = 0;
		String producto1;
		
		if (this.promosFijas.isEmpty())
			return false;
		else {
			producto1 = this.promosFijas.get(0).getProducto().getNombre();		
			
			while(i < this.promosFijas.size()) {
				if(!this.promosFijas.get(i).getProducto().getNombre().equalsIgnoreCase(producto1))				
					return true;
				i++;
			}	
			return false; //no retorna el true previamente		
		}

	}

	public Mozo buscaMozo(Mesa mesa) { 
		int i = 0;
		int j;
		
		while(i < this.mozos.size()) {
			j = 0;
			while(j < this.mozos.get(i).getMesas().size()){
				if(this.mozos.get(i).getMesas().get(j).getNumero() == mesa.getNumero()) 
					return this.mozos.get(i);	
				j++;	
			}
			i++;	
		}
		return null;
	}
	
	/**
	 * Metodo utilizado para encontrar cual fue el mozo que mas dinero recaudo.<br>
	 * @return Un String con el nombre del mozo que mas facturo y cual fue la cantidad recaudada.
	 */
	public String informeMasVende() {
		int i = 0;
		double maxCant = 0;
		String masVendio = "";
		
		while(i < this.mozos.size()) {
			if (maxCant < this.mozos.get(i).getCantidadRecaudada()) {
				maxCant = this.mozos.get(i).getCantidadRecaudada();
				masVendio = this.mozos.get(i).getNombreYApellido() + " fue el mozo que mas dinero facturo: $" + this.mozos.get(i).getCantidadRecaudada();	
			}
			i++;
		}
		
		return masVendio;
		
	}
	
	/**
	 * Metodo utilizado para encontrar cual fue el mozo que menos dinero recaudo.<br>
	 * @return Un String con el nombre del mozo que menos facturo y cual fue la cantidad recaudada.
	 */
	public String informeMenosVende() {
		int i = 1;
		double minCant = this.mozos.get(0).getCantidadRecaudada();
		String menosVendio = this.mozos.get(0).getNombreYApellido() + " fue el mozo que menos dinero facturo: $" + this.mozos.get(0).getCantidadRecaudada();
		
		while(i < this.mozos.size()) {
			if (minCant > this.mozos.get(i).getCantidadRecaudada()) {
				minCant = this.mozos.get(i).getCantidadRecaudada();
				menosVendio = this.mozos.get(i).getNombreYApellido() + " fue el mozo que menos dinero facturo: $" + this.mozos.get(i).getCantidadRecaudada();
			}
			i++;
		}
		
		return menosVendio;
	}
	

	public String retornaMesaConEstadisticas(int i) {
		
		return this.mesas.get(i).getNumero() + " recaudo $" + this.mesas.get(i).generaPromedio();
		
	}
	
	/**
	 * Metodo que retorna las estadisticas de un mozo.
	 * <b>Pre: </b> nombre debe corresponder al nombre de un mozo registrado en el sistema.<br>
	 * <b>Post: </b> Se almacena en el sistema una nueva mesa.<br>
	 * @param nombre
	 * @return Un String que contiene las estadisticas del mozo.
	 */
	public String retornaEstadisticasMozo(String nombre) {
		int i = 0;
		
		while(!nombre.equals(this.mozos.get(i).getNombreYApellido())) {
			i++;
		}
		return this.mozos.get(i).datosEmpleado();	
	}
	
	/**
	 * Metodo utilizado para cerrar una comanda, calcular el total a pagar, crear una factura y almacenarla en el sistema.
	 * <b>Pre: </b> La comanda debe existir en el sistema y encontrars en estado "abierta".<br>
	 * <b>Post: </b> Se cierra la comanda, se crea un objeto de tipo Factura y se almacena el mismo en el sistema.<br>
	 * @param comanda
	 * @param formaDePago
	 */
	public void cierraComanda(Comanda comanda,String formaDePago){
		Factura factura;
		double total = 0,parcialPorProducto, porcentajeDescuento,porcentajeDtoTemporal;
		int j,k, cantDosPorUno;
		ArrayList<Promocion> promocionesAplicadas = new ArrayList<Promocion>();
		boolean tienePromoFija; //sirve para ver si tiene o no promo fija para ver si se acumula la promo temporal
		
		//total = calculaTot(); se necesita para calcular el total de la mesas
		
		comanda.setEstado("Cerrada");
		diaActualAlEspanol();
		for (int i = 0; i < comanda.getPedidos().size(); i++){
			parcialPorProducto = comanda.getPedidos().get(i).getProducto().getPrecioDeVenta() * comanda.getPedidos().get(i).getCantidad(); //precio total de los productos
			tienePromoFija = false;
			j = 0;
			k = 0;
			//promos fijas
			while(j < this.promosFijas.size() && !tienePromoFija){
				if(this.promosFijas.get(j).isActivo() && this.diaActual.equalsIgnoreCase(this.promosFijas.get(j).getDiaDePromo()) && this.promosFijas.get(j).getProducto().getNombre().equalsIgnoreCase(comanda.getPedidos().get(i).getProducto().getNombre())) {
					
					if(this.promosFijas.get(j).isAplicaDosPorUno() && comanda.getPedidos().get(i).getCantidad() >= 2) {
						tienePromoFija = true;
						cantDosPorUno = (int) comanda.getPedidos().get(i).getCantidad() / 2;
						parcialPorProducto -= cantDosPorUno * comanda.getPedidos().get(i).getProducto().getPrecioDeVenta();	
						promocionesAplicadas.add(this.promosFijas.get(j));
						if(this.promosFijas.get(j).isAplicaDtoPorCantidad() && comanda.getPedidos().get(i).getCantidad() >= this.promosFijas.get(j).getDtoPorCantidad_cantidadMinima()) {				
							porcentajeDescuento = this.promosFijas.get(j).getDtoPorCantidad_PrecioUnitario() / comanda.getPedidos().get(i).getProducto().getPrecioDeVenta();
							parcialPorProducto = parcialPorProducto - (parcialPorProducto * porcentajeDescuento);						
						}				
					}else {		
						if(this.promosFijas.get(j).isAplicaDtoPorCantidad() && this.diaActual.equalsIgnoreCase(this.promosFijas.get(j).getDiaDePromo()) && comanda.getPedidos().get(i).getCantidad() >= this.promosFijas.get(j).getDtoPorCantidad_cantidadMinima()) {
							tienePromoFija = true;
							porcentajeDescuento = this.promosFijas.get(j).getDtoPorCantidad_PrecioUnitario() / comanda.getPedidos().get(i).getProducto().getPrecioDeVenta();
							parcialPorProducto = parcialPorProducto - (parcialPorProducto * porcentajeDescuento);		
							promocionesAplicadas.add(this.promosFijas.get(j));
						}			
					}
					
				}		
				j++;
			}
			
			//promos temporales
			while(k < this.getPromosTemporales().size()) {
				if (this.getPromosTemporales().get(k).isActivo() && this.diaActual.equalsIgnoreCase(this.promosTemporales.get(k).getDiaDePromo()) && (!tienePromoFija || this.getPromosTemporales().get(k).isEsAcumulable()) && this.getPromosTemporales().get(k).getFormaPago().equalsIgnoreCase(formaDePago) ) { //falta contemplar el dia y forma de pago
					porcentajeDtoTemporal = this.promosTemporales.get(k).getPorcentajeDeDto() / 100.00;
					parcialPorProducto = parcialPorProducto - (parcialPorProducto * porcentajeDtoTemporal);	
					promocionesAplicadas.add(this.promosTemporales.get(k));
				}
				
				k++;	
			}
			
			total += parcialPorProducto;
			
		}	
		
		comanda.getMozo().setCantidadRecaudada(comanda.getMozo().getCantidadRecaudada() + total);
		comanda.getMozo().setMesasAtendidas(comanda.getMozo().getMesasAtendidas() + 1);
		comanda.getMesa().setCantCompras(comanda.getMesa().getCantCompras() + 1);
		comanda.getMesa().setTotalGanado(comanda.getMesa().getTotalGanado() + total);
		comanda.getMesa().setEstado("Libre");
		
		factura = new Factura(comanda.getPedidos(),promocionesAplicadas,formaDePago,comanda.getMesa(),total,comanda.getMozo());
		
		muestraFactura(factura.DatosFactura());
	}
	
	public void diaActualAlEspanol() {
		this.diaHoy = LocalDate.now();
		
		switch(diaHoy.getDayOfWeek()) {
		case SUNDAY:
			this.diaActual = "Domingo";
			break;
		case MONDAY:
			this.diaActual = "Lunes";
			break;
		case TUESDAY:
			this.diaActual = "Martes";
			break;
		case WEDNESDAY:
			this.diaActual = "Miercoles";
			break;
		case THURSDAY:
			this.diaActual = "Jueves";
			break;
		case FRIDAY:
			this.diaActual = "Viernes";
			break;
		case SATURDAY:
			this.diaActual = "Sabado";
			break;
		}	
	}
	
	public void muestraFactura(String mensaje) {
		Controlador.getInstancia().recuperaMensaje(mensaje);
	}
	
}
