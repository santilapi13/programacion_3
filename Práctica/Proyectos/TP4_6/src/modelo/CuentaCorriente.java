package modelo;

public class CuentaCorriente extends Cuenta {
	private double topeGiro;

	public CuentaCorriente(String nombreTitular, double topeGiro) {
		super(nombreTitular);
		this.topeGiro = topeGiro;
	}
	
	public double getTopeGiro() {
		return topeGiro;
	}
	public void setTopeGiro(double topeGiro) {
		this.topeGiro = topeGiro;
	}

	@Override
	protected boolean validaExtraccion(double monto) {
		return monto > 0 && super.saldo + this.topeGiro >= monto;
	}
	
}
