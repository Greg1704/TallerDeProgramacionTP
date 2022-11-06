package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Ventana.VentanaAdministrador;

public class Controlador implements ActionListener {
	
	VentanaAdministrador v;
	private static Controlador instancia = null;
	
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
		
		
		
	}

}