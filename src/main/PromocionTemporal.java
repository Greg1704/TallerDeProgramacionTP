package main;

public class PromocionTemporal extends Promocion{
	private String nombre;
	private int porcentajeDeDto;
	private boolean esAcumulable;
	private String formaPago;
	
	
	public PromocionTemporal(boolean activo, String diaDePromo, String nombre, int porcentajeDeDto,
			boolean esAcumulable,String formaPago) {
		super(activo, diaDePromo);
		this.nombre = nombre;
		this.porcentajeDeDto = porcentajeDeDto;
		this.esAcumulable = esAcumulable;
		this.formaPago = formaPago;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPorcentajeDeDto() {
		return porcentajeDeDto;
	}


	public void setPorcentajeDeDto(int porcentajeDeDto) {
		this.porcentajeDeDto = porcentajeDeDto;
	}


	public boolean isEsAcumulable() {
		return esAcumulable;
	}


	public void setEsAcumulable(boolean esAcumulable) {
		this.esAcumulable = esAcumulable;
	}


	public String getFormaPago() {
		return formaPago;
	}


	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}


	@Override
	public String toString() {
		return "Promocion Temporal: nombre=" + nombre + " Porcentaje de descuento: " + porcentajeDeDto + " Se acumula: "
				+ esAcumulable + " Forma de pago: " + formaPago + " Dia de promo: " + getDiaDePromo();
	}
	
	
	
	
}
