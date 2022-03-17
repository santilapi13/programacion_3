package prueba;
import modelo.CuentaBancaria;

public class Prueba {

	public static void main(String[] args) {
		CuentaBancaria cuenta = new CuentaBancaria("Pedro");
		cuenta.depositar(30);
		cuenta.depositar(-50);
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.extraer(-30));
		System.out.println(cuenta.extraer(50));
	}

}
