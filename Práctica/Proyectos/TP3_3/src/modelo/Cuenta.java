package modelo;

public abstract class Cuenta {
	protected double saldo;
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
	public abstract void extraer(double monto);

	public String toString() {
		return "[Saldo=" + saldo + ", nombreTitular=" + nombreTitular + "]";
	}
	
}
