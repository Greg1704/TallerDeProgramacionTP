package excepciones;

public class StockNegativoException extends Exception {
	
	public StockNegativoException() {
		super("No hay mas stock de ese producto.");
	}
}
