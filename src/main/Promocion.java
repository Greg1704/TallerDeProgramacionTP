package main;

public class Promocion {
	private boolean activo;
	private String diaDePromo;
	
	
	public Promocion(boolean activo, String diaDePromo) {
		super();
		this.activo = activo;
		this.diaDePromo = diaDePromo;
	}
	
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public String getDiaDePromo() {
		return diaDePromo;
	}
	public void setDiaDePromo(String diaDePromo) {
		this.diaDePromo = diaDePromo;
	}
	
	
}
