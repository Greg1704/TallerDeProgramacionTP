package main;

public class PromocionPermanente extends Promocion{
	private int id_Promocion;
	private Producto producto;
	private boolean aplicaDosPorUno;
	private boolean aplicaDtoPorCantidad;
	private int dtoPorCantidad_cantidadMinima;
	private double dtoPorCantidad_PrecioUnitario;
	
	
	public PromocionPermanente(boolean activo, String diaDePromo, int id_Promocion, Producto producto,
			boolean aplicaDosPorUno, boolean aplicaDtoPorCantidad, int dtoPorCantidad_cantidadMinima,
			double dtoPorCantidad_PrecioUnitario) {
		super(activo, diaDePromo);
		this.id_Promocion = id_Promocion;
		this.producto = producto;
		this.aplicaDosPorUno = aplicaDosPorUno;
		this.aplicaDtoPorCantidad = aplicaDtoPorCantidad;
		this.dtoPorCantidad_cantidadMinima = dtoPorCantidad_cantidadMinima;
		this.dtoPorCantidad_PrecioUnitario = dtoPorCantidad_PrecioUnitario;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public boolean isAplicaDosPorUno() {
		return aplicaDosPorUno;
	}


	public void setAplicaDosPorUno(boolean aplicaDosPorUno) {
		this.aplicaDosPorUno = aplicaDosPorUno;
	}


	public boolean isAplicaDtoPorCantidad() {
		return aplicaDtoPorCantidad;
	}


	public void setAplicaDtoPorCantidad(boolean aplicaDtoPorCantidad) {
		this.aplicaDtoPorCantidad = aplicaDtoPorCantidad;
	}


	public int getDtoPorCantidad_cantidadMinima() {
		return dtoPorCantidad_cantidadMinima;
	}


	public void setDtoPorCantidad_cantidadMinima(int dtoPorCantidad_cantidadMinima) {
		this.dtoPorCantidad_cantidadMinima = dtoPorCantidad_cantidadMinima;
	}


	public double getDtoPorCantidad_PrecioUnitario() {
		return dtoPorCantidad_PrecioUnitario;
	}


	public void setDtoPorCantidad_PrecioUnitario(double dtoPorCantidad_PrecioUnitario) {
		this.dtoPorCantidad_PrecioUnitario = dtoPorCantidad_PrecioUnitario;
	}


	public int getId_Promocion() {
		return id_Promocion;
	}
	
	
	
}
