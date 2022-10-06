package main;

public class PromocionTemporal extends Promocion{
	private String nombre;
	private int porcentajeDeDto;
	private boolean esAcumulable;
	
	
	public PromocionTemporal(boolean activo, String diaDePromo, String nombre, int porcentajeDeDto,
			boolean esAcumulable) {
		super(activo, diaDePromo);
		this.nombre = nombre;
		this.porcentajeDeDto = porcentajeDeDto;
		this.esAcumulable = esAcumulable;
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
	
	
	
	
}
