package Testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.Robot;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import controlador.Controlador;
import main.Sistema;
import persistencia.PersistirSistema;

public class GuiTestEnabledDisabledSinUsuarioLogueado {
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
		this.controlador.getVentana().getTextFieldLoginContrasenia2().setText("");
		this.controlador.getVentana().getTextFieldLoginUsuario2().setText("");
		this.controlador.getVentana().getTextFieldNombreLocal2().setText("");
	}

	@Test
	public void testVaciosLogin() {
		JButton btnLogin = this.controlador.getVentana().getBtnLogin();
		JButton btnLogout = this.controlador.getVentana().getBtnLogout();	
		assertFalse("El boton login debe estar deshbilitado",btnLogin.isEnabled());
		assertFalse("El boton logout debe estar deshbilitado",btnLogout.isEnabled());
	}
	
	@Test
	public void testSoloNombreUsuarioLogin() {
		robot.delay(TestUtils.getDelay());
		PersistirSistema.LecturaSistema();
		Sistema.getInstancia();
		JButton btnLogin = this.controlador.getVentana().getBtnLogin();
		JButton btnLogout = this.controlador.getVentana().getBtnLogout();
		
		JTextField textoNombreUsuario= this.controlador.getVentana().getTextFieldLoginUsuario2();
		TestUtils.clickComponent(textoNombreUsuario, robot);
		TestUtils.tipeaTexto("ADMIN", robot);
		assertFalse("El boton login debe estar deshbilitado",btnLogin.isEnabled());
		assertFalse("El boton logout debe estar deshbilitado",btnLogout.isEnabled());
		
	}
	
	@Test
	public void testSoloContraseniaLogin() {
		robot.delay(TestUtils.getDelay());
		JButton btnLogin = this.controlador.getVentana().getBtnLogin();
		JButton btnLogout = this.controlador.getVentana().getBtnLogout();
		
		JTextField textoContrasenia= this.controlador.getVentana().getTextFieldLoginContrasenia2();
		TestUtils.clickComponent(textoContrasenia, robot);
		TestUtils.tipeaTexto("Josesito124", robot);
		assertFalse("El boton login debe estar deshbilitado",btnLogin.isEnabled());
		assertFalse("El boton logout debe estar deshbilitado",btnLogout.isEnabled());

	}
	
	@Test
	public void testUsuarioContraseniaLogin() {
		robot.delay(TestUtils.getDelay());
		JButton btnLogin = this.controlador.getVentana().getBtnLogin();
		JButton btnLogout = this.controlador.getVentana().getBtnLogout();
		
		JTextField textoContrasenia= this.controlador.getVentana().getTextFieldLoginContrasenia2();
		JTextField textoNombreUsuario= this.controlador.getVentana().getTextFieldLoginUsuario2();
		TestUtils.clickComponent(textoNombreUsuario, robot);
		TestUtils.tipeaTexto("ADMIN", robot);
		TestUtils.clickComponent(textoContrasenia, robot);
		TestUtils.tipeaTexto("Josesito124", robot);
		assertTrue("El boton login no debe estar deshbilitado",btnLogin.isEnabled());
		assertFalse("El boton logout debe estar deshbilitado",btnLogout.isEnabled());

	}
	
	@Test
	public void testVacioSerializacion() {
		JButton btnNuevoSistema = this.controlador.getVentana().getBtnNuevoSistema();
		assertFalse("El boton nuevo sistema debe estar deshbilitado",btnNuevoSistema.isEnabled());		
		
	}
	
	@Test
	public void testNombreSerializacion() {
		robot.delay(TestUtils.getDelay());
		JButton btnNuevoSistema = this.controlador.getVentana().getBtnNuevoSistema();
		JTextField textoNombre= this.controlador.getVentana().getTextFieldNombreLocal2();
		TestUtils.clickComponent(textoNombre, robot);
		TestUtils.tipeaTexto("BOHR", robot);
		assertTrue("El boton nuevo sistema no debe estar deshbilitado",btnNuevoSistema.isEnabled());
	
	}
	

}
