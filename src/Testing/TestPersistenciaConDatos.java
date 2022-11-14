package Testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import excepciones.NegativoException;
import excepciones.PrecioVentaMenorCostoException;
import excepciones.ProductoDuplicadoException;
import main.Producto;
import main.Sistema;
import persistencia.PersistirSistema;

public class TestPersistenciaConDatos {

	@Before
	public void setUp() throws Exception {
		Sistema sist = Sistema.getInstancia();
		Producto producto = new Producto("Hamburguesa", 100, 200, 5);
		sist.agregaProductos(producto);
		PersistirSistema.EscrituraSistema();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEscrituraLecturaConDatos() throws NegativoException, PrecioVentaMenorCostoException, ProductoDuplicadoException {
		Producto producto = new Producto("Papas fritas", 10, 30, 6);
		Sistema.getInstancia().agregaProductos(producto); // propago las excepciones porque estoy creando bien
		PersistirSistema.LecturaSistema();
		Assert.assertNotNull("No deberia ser null", Sistema.getInstancia().getProducto()); // verifico si algo se guardó
		Assert.assertNotEquals("Deberian ser diferentes", producto, Sistema.getInstancia().getProducto());
	}

}
