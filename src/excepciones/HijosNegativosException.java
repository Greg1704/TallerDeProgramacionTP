package excepciones;

public class HijosNegativosException extends Exception {

	public HijosNegativosException() {
		super("Cantidad de hijos menor que 0.");
	}
	
}
