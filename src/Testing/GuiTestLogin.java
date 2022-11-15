package Testing;

import java.awt.Robot;
import java.awt.event.InputEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import controlador.Controlador;
import main.Sistema;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GuiTestLogin {
	Robot robot;
	Controlador controlador;
	

	@Before
	public void setUp() throws Exception {
		this.controlador=Controlador.getInstancia();
		this.controlador.getVentana().setVisible(true);
		this.robot=new Robot();
		JButton recuperarSistema= controlador.getVentana().getBtnRecuperarSistema();
		TestUtils.clickComponent(recuperarSistema, robot);
		TestUtils.setDelay(50);
	}
	@After
	public void tearDown() throws Exception {
		JButton btnLogout = this.controlador.getVentana().getBtnLogout();
		TestUtils.clickComponent(btnLogout, robot);
		this.controlador.getVentana().getTextFieldLoginContrasenia2().setText("");
		this.controlador.getVentana().getTextFieldLoginUsuario2().setText("");
	}

	@Test
	public void LoginOK() {
		JButton btnLogin = this.controlador.getVentana().getBtnLogin();
		
		JTextField textoContrasenia= this.controlador.getVentana().getTextFieldLoginContrasenia2();
		JTextField textoNombreUsuario= this.controlador.getVentana().getTextFieldLoginUsuario2();
		TestUtils.clickComponent(textoNombreUsuario, robot);
		TestUtils.tipeaTexto("Juan", robot);
		TestUtils.clickComponent(textoContrasenia, robot);
		TestUtils.tipeaTexto("Juan12", robot);
		TestUtils.clickComponent(btnLogin, robot);
		System.out.println(Sistema.getInstancia().getOperarios().get(0));
		Assert.assertEquals("Deberia coincidir el nombre de usuario con el nombre ingresado", "Juan",
                Sistema.getInstancia().getOperarios().get(0).getNombreYApellido());

	}
	
	
	@Test
	public void ALoginUsuarioIncorrecto() {
		JButton btnLogin = this.controlador.getVentana().getBtnLogin();
		
		JTextField textoContrasenia= this.controlador.getVentana().getTextFieldLoginContrasenia2();
		JTextField textoNombreUsuario= this.controlador.getVentana().getTextFieldLoginUsuario2();
		TestUtils.clickComponent(textoNombreUsuario, robot);
		TestUtils.tipeaTexto("Juann", robot);
		TestUtils.clickComponent(textoContrasenia, robot);
		TestUtils.tipeaTexto("Juan12", robot);
		TestUtils.clickComponent(btnLogin, robot);
		robot.delay(500);
		robot.mouseMove(700, 425);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(10);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	@Test
	public void BLoginContraseniaIncorrecta() {
		JButton btnLogin = this.controlador.getVentana().getBtnLogin();
		
		JTextField textoContrasenia= this.controlador.getVentana().getTextFieldLoginContrasenia2();
		JTextField textoNombreUsuario= this.controlador.getVentana().getTextFieldLoginUsuario2();
		TestUtils.clickComponent(textoNombreUsuario, robot);
		TestUtils.tipeaTexto("Juan", robot);
		TestUtils.clickComponent(textoContrasenia, robot);
		TestUtils.tipeaTexto("Juan123", robot);
		TestUtils.clickComponent(btnLogin, robot);
		
	}

}
