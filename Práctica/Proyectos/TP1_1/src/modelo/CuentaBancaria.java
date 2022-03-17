package modelo;

public class CuentaBancaria {
	
	private double saldo;
	private String titular;
	
	public void depositar(double cantidad) {
		this.saldo += cantidad;
	}
	
	public void extraer(double cantidad) {
		double nuevoSaldo;
		nuevoSaldo = this.saldo - cantidad;
		if (nuevoSaldo >= 0)
			this.saldo = nuevoSaldo;
		else
			System.out.println("Saldo insuficiente");
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
}
