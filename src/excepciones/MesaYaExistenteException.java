package excepciones;

public class MesaYaExistenteException extends Exception {

	public MesaYaExistenteException() {
		super("El numero de mesa que quiere agregar ya se encuentra en el sistema");
		
	}

	
	
}
