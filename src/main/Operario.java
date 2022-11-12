package main;

import java.io.Serializable;

import excepciones.ContraseniaNoCreadaException;

public class Operario implements Serializable{
	private boolean activo;
	private String nombreDeUsuario; //Tamaño 10
	private String password;		//Tamaño de 6 a 12
	private String nombreYApellido;
	
	
	public Operario(String nombreDeUsuario, String password, String nombreYApellido) throws ContraseniaNoCreadaException {
		this.activo=true;
		this.nombreDeUsuario = nombreDeUsuario;
		if(verificarPassword(password))
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
	public void setPassword(String password) throws ContraseniaNoCreadaException {
		if(verificarPassword(password))
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

	
	private boolean verificarPassword(String password) throws ContraseniaNoCreadaException {
		char aux;
		boolean mayus = false,digito = false;
		if(password.length()<6)
			throw new ContraseniaNoCreadaException("La contrasenia es menor a 6 caracteres");
		else if(password.length()>12)
			throw new ContraseniaNoCreadaException("La contrasenia es mayor a 12 caracteres");
		else {
			for(int i=0;i<password.length();i++) {
				aux = password.charAt(i);
				if(aux >= 'A' && aux <= 'Z') 
					mayus = true;
				
				if(aux >= '0' && aux <= '9')
					digito = true;
			}
			if(!mayus)
				throw new ContraseniaNoCreadaException("La contrasenia no cuenta con al menos una mayuscula");
			if(!digito)
				throw new ContraseniaNoCreadaException("La contrasenia no cuenta con al menos un digito");
		}
			
		return true;
	}


	@Override
	public String toString() {
		return "Nombre y Apellido: " + nombreYApellido + " Nombre de usuario: " + nombreDeUsuario  + "Se encuentra activo:" + activo ;
	}
	
	
}
