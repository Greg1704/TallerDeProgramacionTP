package main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import excepciones.*;

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
	
	/*
	public Sistema(String nombre, Sueldo sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	*/
	
	private Sistema() {
		admin = new Operario("ADMIN","ADMIN1234",""); //Creacion de Operario Admin
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

	
	public Operario loginAdmin(String usuario,String password) throws ContraseniaIncorrectaException, UsuarioIncorrectoException{
		if(Sistema.getInstancia().getAdmin().getNombreDeUsuario().compareTo(usuario) == 0) {
			if(Sistema.getInstancia().getAdmin().getPassword().compareTo(password) == 0)
				return Sistema.getInstancia().getAdmin();
			else
				throw new ContraseniaIncorrectaException();
		}else
			throw new UsuarioIncorrectoException();
	}
	
	public Operario loginOperario(String usuario,String password) throws ContraseniaIncorrectaException, UsuarioIncorrectoException {
		int i=0;
		while(i<operarios.size()) {
			if(Sistema.getInstancia().getOperarios().get(i).getNombreDeUsuario().compareTo(usuario) == 0) {
				if(Sistema.getInstancia().getOperarios().get(i).getPassword().compareTo(password) == 0)
					return Sistema.getInstancia().getOperarios().get(i);
				else
					throw new ContraseniaIncorrectaException();
			}
			i++;
		}
		throw new UsuarioIncorrectoException();
	}
	
	public void estadoMozo(Mozo mozo, String estado) {
		int i=0;
		if(mozos.contains(mozo)) {
			while(!mozos.get(i).equals(mozo))
				i++;
			mozos.get(i).setEstado(estado);
		}//No se si podria llegar a existir el caso donde el mozo buscado no se encuentre en el sistema
	}
	
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
	
	public void sacaProducto(Producto p){
		this.productos.remove(p);
	}
	
	public Producto buscaProducto(String nombre) {
		int i = 0;
		while (i<productos.size() && !this.productos.get(i).getNombre().equals(nombre))
			i++;
		return productos.get(i);
	}
	
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
	
	public void ocupaMesa(int numero, int cantComensales) throws MesaNoExistenteException, ComensalesInsuficientesException, MesaOcupadaException, NoHayProductosException, MesaNoAsignadaException {
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
					mesa.setComensales(cantComensales);
					this.comandas.add(creaComanda(mesa));  //Tal vez habria que hacer una funcion de la creacion de la comanda que verifique todos los requisitos
				}else
					throw new ComensalesInsuficientesException();
			else
				throw new MesaOcupadaException();
		}
	}
	
	
	
	
	/*No es posible crear una nueva comanda si el local:
	  -no tiene mesas habilitadas--------------------------------->VERIFICADO DE ANTEMANO
	  -la mesa asociada debe tener un mozo activo asociado
	  -no tiene mozos activos
	  -al menos 2 productos están en promoción activa
	  -la lista de productos no puede estar vacía----------------->ENCARADO EN LA FUNCION DE ABAJO
	 * */
	public Comanda creaComanda(Mesa mesa) throws NoHayProductosException, MesaNoAsignadaException {
		int i = 0,j;
		boolean encontrado = false;
		
		if(this.productos.size() == 0)
			throw new NoHayProductosException();
		
		while(i < this.mozos.size() && !encontrado && this.mozos.get(i).getEstado().equalsIgnoreCase("Activo")) {
			j = 0;
			while(j < this.mozos.get(i).getMesasAtendidas() && !encontrado) {
				if(this.mozos.get(i).getMesas().get(j).getNumero() == mesa.getNumero()) {
					encontrado = true;
				}
				j++;
			}	
			i++;
		}
		if(!encontrado) {
			throw new MesaNoAsignadaException();
		}
		
		for(i = 0; i < this.mozos.size(); i++) {
			
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
	
	
	public Mozo buscaMozo(Mesa mesa) { //no se si sea muy programacion estructurada retornar en 2 while, perdon Sandra
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
	
	// desde el controlador hay que invocar las mesas que haya
	public String retornaMesaConEstadisticas(int i) {
		
		return this.mesas.get(i).getNumero() + " recaudo $" + this.mesas.get(i).generaPromedio();
		
	}
	
	//precondicion: el nombre debe existir
	public String retornaEstadisticasMozo(String nombre) {
		int i = 0;
		
		while(!nombre.equals(this.mozos.get(i).getNombreYApellido())) {
			i++;
		}
		return this.mozos.get(i).datosEmpleado();	
	}
	
	public void cierraComanda(Comanda comanda,String formaDePago){
		Factura factura;
		double total = 0,parcialPorProducto, porcentajeDescuento;
		int j,k, cantDosPorUno;
		ArrayList<Promocion> promocionesAplicadas = new ArrayList<Promocion>();
		boolean tienePromoFija; //sirve para ver si tiene o no promo fija para ver si se acumula la promo temporal
		
		//total = calculaTot(); se necesita para calcular el total de la mesas
		
		comanda.setEstado("Cerrada");
		
		for (int i = 0; i < comanda.getPedidos().size(); i++){
			parcialPorProducto = comanda.getPedidos().get(i).getProducto().getPrecioDeVenta() * comanda.getPedidos().get(i).getCantidad(); //precio total de los productos
			tienePromoFija = false;
			j = 0;
			k = 0;
			//promos fijas
			while(j < this.promosFijas.size() && !tienePromoFija){//falta condicion para dia
				if(this.promosFijas.get(j).isActivo() && this.diaActual.equalsIgnoreCase(this.promosFijas.get(j).getDiaDePromo()) && this.promosFijas.get(j).getProducto().getNombre().equalsIgnoreCase(comanda.getPedidos().get(i).getProducto().getNombre())) {
					
					if(this.promosFijas.get(i).isAplicaDosPorUno() && comanda.getPedidos().get(i).getCantidad() >= 2) {
						tienePromoFija = true;
						cantDosPorUno = (int) comanda.getPedidos().get(i).getCantidad() / 2;
						parcialPorProducto -= cantDosPorUno * comanda.getPedidos().get(i).getProducto().getPrecioDeVenta();	
						promocionesAplicadas.add(this.promosFijas.get(j));
						if(this.promosFijas.get(j).isAplicaDtoPorCantidad() && comanda.getPedidos().get(i).getCantidad() >= this.promosFijas.get(j).getDtoPorCantidad_cantidadMinima()) {				
							porcentajeDescuento = this.promosFijas.get(j).getDtoPorCantidad_PrecioUnitario() / comanda.getPedidos().get(i).getProducto().getPrecioDeVenta();
							parcialPorProducto = parcialPorProducto - parcialPorProducto * porcentajeDescuento;						
						}				
					}else {		
						if(this.promosFijas.get(j).isAplicaDtoPorCantidad() && this.diaActual.equalsIgnoreCase(this.promosFijas.get(j).getDiaDePromo()) && comanda.getPedidos().get(i).getCantidad() >= this.promosFijas.get(j).getDtoPorCantidad_cantidadMinima()) {
							tienePromoFija = true;
							porcentajeDescuento = this.promosFijas.get(j).getDtoPorCantidad_PrecioUnitario() / comanda.getPedidos().get(i).getProducto().getPrecioDeVenta();
							parcialPorProducto = parcialPorProducto - parcialPorProducto * porcentajeDescuento;		
							promocionesAplicadas.add(this.promosFijas.get(j));
						}			
					}
					
				}		
				j++;
			}
			
			//promos temporales
			while(k < this.getPromosTemporales().size()) {
				//FALTA EL DIA DE LA PROMO
				if (this.getPromosTemporales().get(k).isActivo() && this.diaActual.equalsIgnoreCase(this.promosTemporales.get(k).getDiaDePromo()) && (!tienePromoFija || this.getPromosTemporales().get(k).isEsAcumulable()) && this.getPromosTemporales().get(k).getFormaPago().equalsIgnoreCase(formaDePago) ) { //falta contemplar el dia y forma de pago
					parcialPorProducto = parcialPorProducto - parcialPorProducto * this.promosTemporales.get(k).getPorcentajeDeDto();	
					promocionesAplicadas.add(this.promosTemporales.get(j));
				}
				
				k++;	
			}
			
			total += parcialPorProducto;
			
		}	
		
		comanda.getMozo().setCantidadRecaudada(comanda.getMozo().getCantidadRecaudada() + total);
		comanda.getMesa().setCantCompras(comanda.getMesa().getCantCompras() + 1);
		comanda.getMesa().setTotalGanado(comanda.getMesa().getTotalGanado() + total);
		
		factura = new Factura(comanda.getPedidos(),promocionesAplicadas,formaDePago,comanda.getMesa(),total,comanda.getMozo());
		
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
	
	
}
