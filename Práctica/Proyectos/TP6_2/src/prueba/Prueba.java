package prueba;

import excepciones.DepositoInvalidoException;
import excepciones.ExtraccionInvalidaException;
import modelo.CuentaBancaria;

public class Prueba {

	public static void main(String[] args) {
		CuentaBancaria cuenta = new CuentaBancaria("Pedro");
		try {
			cuenta.depositar(1000);
			cuenta.extraer(500);
			cuenta.depositar(-20);
			System.out.println("Operaciones llevadas a cabo con exito");
		} catch (DepositoInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (ExtraccionInvalidaException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Saldo final: " + cuenta.getSaldo());
	}

}
