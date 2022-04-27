package excepciones;

public class DepositoInvalidoException extends Exception {

	private double cantidadInvalida;
	
	public DepositoInvalidoException(String message,double cantidad) {
		super(message);
		this.cantidadInvalida = cantidad;
	}

	public double getCantidadInvalida() {
		return cantidadInvalida;
	}

}
