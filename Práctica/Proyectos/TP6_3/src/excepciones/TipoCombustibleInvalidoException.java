package excepciones;

import modelo.DatoCargaInvalido;

@SuppressWarnings("serial")
public class TipoCombustibleInvalidoException extends CargaInvalidaException {

	public TipoCombustibleInvalidoException(String message, DatoCargaInvalido dato) {
		super(message, dato);
	}
	
}
