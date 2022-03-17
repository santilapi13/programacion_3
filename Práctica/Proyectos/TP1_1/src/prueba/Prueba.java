package prueba;
import modelo.CuentaBancaria;

public class Prueba {
	public static void main(String[] args) {
		CuentaBancaria unaCuenta = new CuentaBancaria();
		String aux = new String();
		
		unaCuenta.depositar(1250);
		unaCuenta.extraer(450);
		System.out.println(unaCuenta.getSaldo());
		unaCuenta.setTitular("Juan Perez");
		aux = unaCuenta.getTitular();
		System.out.println(aux);
	}
}
