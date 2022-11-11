package excepciones;

public class NoHayDosPromosException extends Exception {

	public NoHayDosPromosException() {
		super("No hay dos promos disponibles en este momento.");
	}
	
}
