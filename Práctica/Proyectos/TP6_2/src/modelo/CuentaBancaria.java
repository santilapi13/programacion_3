package modelo;

import excepciones.DepositoInvalidoException;
import excepciones.ExtraccionInvalidaException;

public class CuentaBancaria {
	
	private double saldo;
	private String titular;

	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0;
	}

	public double getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}

	public void depositar(double cantidad) throws DepositoInvalidoException {
		if (cantidad <= 0)
			throw new DepositoInvalidoException("Deposito invalido",cantidad);
		else
			this.saldo += cantidad;
	}
	
	public void extraer(double cantidad) throws ExtraccionInvalidaException {
		if (cantidad<=0 || cantidad > this.saldo)
			throw new ExtraccionInvalidaException("Extraccion invalida",new DatoInvalido(cantidad,this.saldo));
		else
			this.saldo -= cantidad;
	}
	
}
