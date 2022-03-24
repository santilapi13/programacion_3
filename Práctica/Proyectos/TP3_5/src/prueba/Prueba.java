package prueba;

import modelo.Automovil;
import modelo.AutomovilAutomatico;
import modelo.AutomovilManual;

public class Prueba {

	public static void main(String[] args) {
		Automovil AM = new AutomovilManual("123123");
		Automovil AA = new AutomovilAutomatico("54375645");
		System.out.println(AM);
		AM.acelerar(150);
		System.out.println(AM);
		AM.frenar(155);
		System.out.println(AM);
		AM.frenar(120);
		System.out.println(AM);
		
		System.out.println(AA);
		AA.acelerar(150);
		System.out.println(AA);
		AA.frenar(155);
		System.out.println(AA);
		AA.frenar(70);
		System.out.println(AA);
		
	}

}
