package excepciones;

import modelo.DatoCargaInvalido;

@SuppressWarnings("serial")
public class FaltaCombustibleException extends CargaInvalidaException {

	public FaltaCombustibleException(String message, DatoCargaInvalido dato) {
		super(message, dato);
	}

}
