package Testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Sueldo;

public class TestSueldo {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructor() {
		Sueldo sueldo=new Sueldo(50000,5);
		double basico=sueldo.getBasico();
		double porcentaje=sueldo.getPorcentaje();
		assertEquals("El basico no se registro correctamente", 50000, basico,0);
		assertEquals("El porcentaje no se registro correctamente", 5, porcentaje,0);
		
	}
	
	@Test
	public void testSetBasico() {
		Sueldo sueldo=new Sueldo(50000,5);
		sueldo.setBasico(100000);
		assertEquals("El basico no se setea correctamente", 100000, sueldo.getBasico(),0 );
		
	}
	@Test
	public void testSetPorcentaje() {
		Sueldo sueldo=new Sueldo(50000,5);
		sueldo.setPorcentaje(15);
		assertEquals("El porcentaje no se setea correctamente", 15, sueldo.getPorcentaje(),0 );
	}
	
	
	

}
