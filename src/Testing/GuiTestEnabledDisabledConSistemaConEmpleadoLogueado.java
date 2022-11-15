package Testing;

import static org.junit.Assert.*;

import java.awt.Robot;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controlador.Controlador;
import main.Sistema;

public class GuiTestEnabledDisabledConSistemaConEmpleadoLogueado {
	Robot robot;
	Controlador controlador;
	
	@Before
	public void setUp() throws Exception {
		this.controlador=Controlador.getInstancia();
		this.controlador.getVentana().setVisible(true);
		this.robot=new Robot();
		JButton recuperarSistema= controlador.getVentana().getBtnRecuperarSistema();
		TestUtils.clickComponent(recuperarSistema, robot);
		TestUtils.setDelay(200);
		JButton btnLogin = this.controlador.getVentana().getBtnLogin();
		JButton btnLogout = this.controlador.getVentana().getBtnLogout();
		
		JTextField textoContrasenia= this.controlador.getVentana().getTextFieldLoginContrasenia2();
		JTextField textoNombreUsuario= this.controlador.getVentana().getTextFieldLoginUsuario2();
		TestUtils.clickComponent(textoNombreUsuario, robot);
		TestUtils.tipeaTexto("Juan", robot);
		TestUtils.clickComponent(textoContrasenia, robot);
		TestUtils.tipeaTexto("Juan12", robot);
		TestUtils.clickComponent(btnLogin, robot);
		robot.delay(5000);
	}

	@After
	public void tearDown() throws Exception {
		this.controlador.getVentana().getTextFieldLoginContrasenia2().setText("");
		this.controlador.getVentana().getTextFieldLoginUsuario2().setText("");
		this.controlador.getVentana().getTextFieldNombreLocal2().setText("");
	
	}

	@Test
	public void testLogout() {
		JButton btnLogout = this.controlador.getVentana().getBtnLogout();
		assertTrue("El boton nuevo sistema debe estar habilitado",btnLogout.isEnabled());			
	}

}
