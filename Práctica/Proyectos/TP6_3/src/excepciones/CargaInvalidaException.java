package excepciones;

import modelo.DatoCargaInvalido;

@SuppressWarnings("serial")
public class CargaInvalidaException extends Exception {

	private DatoCargaInvalido dato;

	public CargaInvalidaException(String message, DatoCargaInvalido dato) {
		super(message);
		this.dato = dato;
	}

	public DatoCargaInvalido getDato() {
		return dato;
	}
	
}
