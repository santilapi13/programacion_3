package excepciones;

import modelo.DatoInvalido;

public class ExtraccionInvalidaException extends Exception {

	private DatoInvalido datoInvalido;
	
	public ExtraccionInvalidaException(String message,DatoInvalido datoInvalido) {
		super(message);
		this.datoInvalido = datoInvalido;
	}

	public DatoInvalido getDatoInvalido() {
		return datoInvalido;
	}
	
}
