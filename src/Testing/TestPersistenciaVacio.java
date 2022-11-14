package Testing;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Comanda;
import main.Factura;
import main.Mesa;
import main.Mozo;
import main.Operario;
import main.Producto;
import main.PromocionPermanente;
import main.PromocionTemporal;
import main.Sistema;
import main.Sueldo;
import persistencia.PersistirSistema;

public class TestPersistenciaVacio {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		File arch = new File("Cerveceria.bin"); // testeo si el archivo existe para borrarlo y arrancar con el metodo de creacion exitosa
		if (arch.exists()) {
			arch.delete();
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testCreaArchivoVacioExitoso() {
		PersistirSistema.EscrituraSistema();
		File arch = new File("Cerveceria.bin");
		Assert.assertTrue("Deberia existir", arch.exists());
	}

	@Test
	public void testLecturaArchivoVacio() {
		ArrayList<PromocionPermanente> promosFijas = new ArrayList<PromocionPermanente>();
		ArrayList<PromocionTemporal> promosTemporales = new ArrayList<PromocionTemporal>();
		ArrayList<Comanda> comandas = new ArrayList<Comanda>();
		ArrayList<Operario> operarios = new ArrayList<Operario>();
		ArrayList<Producto> productos = new ArrayList<Producto>();
		ArrayList<Mozo> mozos = new ArrayList<Mozo>();
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
		ArrayList<Factura> facturas = new ArrayList<Factura>();
		String nombre = null;
		Sueldo sueldo = null;
		PersistirSistema.LecturaSistema();
		Assert.assertEquals("Los sistemas deberian estar vacios", promosFijas, Sistema.getInstancia().getPromosFijas());
		Assert.assertEquals("Los sistemas deberian estar vacios", promosTemporales, Sistema.getInstancia().getPromosTemporales());
		Assert.assertEquals("Los sistemas deberian estar vacios", comandas, Sistema.getInstancia().getComandas());
		Assert.assertEquals("Los sistemas deberian estar vacios", operarios, Sistema.getInstancia().getOperarios());
		Assert.assertEquals("Los sistemas deberian estar vacios", productos, Sistema.getInstancia().getProducto());
		Assert.assertEquals("Los sistemas deberian estar vacios", mozos, Sistema.getInstancia().getMozos());
		Assert.assertEquals("Los sistemas deberian estar vacios", mesas, Sistema.getInstancia().getMesas());
		Assert.assertEquals("Los sistemas deberian estar vacios", facturas, Sistema.getInstancia().getFacturas());
		Assert.assertEquals("Los sistemas deberian estar vacios", nombre, Sistema.getInstancia().getNombre());
		Assert.assertEquals("Los sistemas deberian estar vacios", sueldo, Sistema.getInstancia().getSueldo());
	}
}

