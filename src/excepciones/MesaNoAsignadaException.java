package excepciones;

public class MesaNoAsignadaException extends Exception {

	public MesaNoAsignadaException() {
		super("La mesa no fue asignada a ningun mozo.");
	}
	
}
