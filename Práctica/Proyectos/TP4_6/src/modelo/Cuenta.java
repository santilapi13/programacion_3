package modelo;

public abstract class Cuenta {
	protected double saldo = 0;
	private String nombreTitular;
	
	public Cuenta(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}

	public void depositar(double monto) {
		this.saldo += monto;
	}
	public void extraer(double monto) {
		if (this.validaExtraccion(monto))
			this.saldo -= monto;
	}
	
	protected boolean validaExtraccion(double monto) {
		return monto > 0;
	}

	public String toString() {
		return "[Saldo=" + saldo + ", nombreTitular=" + nombreTitular + "]";
	}
	
}
