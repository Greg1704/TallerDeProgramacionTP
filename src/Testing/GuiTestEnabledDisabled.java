package Testing;

import static org.junit.Assert.fail;

import java.awt.Robot;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controlador.Controlador;

public class GuiTestEnabledDisabled {
	Robot robot;
	Controlador controlador;
	

	@Before
	public void setUp() throws Exception {
		Controlador.getInstancia();
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testVacios() {
		
	}

}
