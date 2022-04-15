package prueba;

import modelo.Artesano;
import modelo.Joyero;
import modelo.Juguetero;
import modelo.Madera;
import modelo.Material;
import modelo.Metal;

public class Prueba {

	public Prueba() {
	}

	public static void main(String[] args) {
		Material cobre=new Metal("cobre","rojo");
		Material pino=new Madera("pino","amarillo");
		Artesano a1=new Juguetero("Juan");
		Artesano a2=new Joyero("Pedro");
		System.out.println(a1.trabajar(cobre));
		System.out.println(a1.trabajar(pino));
		System.out.println(a2.trabajar(cobre));
		System.out.println(a2.trabajar(pino));
	}

}
