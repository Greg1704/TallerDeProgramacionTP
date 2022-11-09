package main;

import java.io.Serializable;

public class Operario implements Serializable{
	private transient boolean activo;
	private String nombreDeUsuario; //Tamaño 10
	private String password;		//Tamaño de 6 a 12
	private String nombreYApellido;
	
	
	public Operario(String nombreDeUsuario, String password, String nombreYApellido) {
		this.activo=true;
		this.nombreDeUsuario = nombreDeUsuario;
		this.password = password;
		this.nombreYApellido = nombreYApellido;
	}
	
	
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}
	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombreYApellido() {
		return nombreYApellido;
	}
	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}
	
	public void asignaMozoAMesa(Mozo mozo,Mesa mesa) {
		mozo.agregarMesa(mesa);
	}


	@Override
	public String toString() {
		return "Nombre y Apellido: " + nombreYApellido + " Nombre de usuario: " + nombreDeUsuario  + "Se encuentra activo:" + activo ;
	}
	
	
}
