package prueba;

import modelo.Clase1;
import modelo.Clase2;
import modelo.Clase3;

public class Prueba {

	public static void main(String[] args) {
		Clase3 c3= new Clase3();
		Clase1 c1=c3;
		Clase2 c2=c3;
		
		System.out.println(c1.metodo1());	// Muestra 11
		c1.metodo2();	// Muestra "Clase2.metodo2" y "Clase3.metodo2"
		c1.metodo3();	// Muestra "Clase2.metodo3" y "Clase2.metodo3"
		c1.metodo4();	// Muestra "Clase2.metodo4
		System.out.println(c2.metodo1());	// Muestra 11

		c2.metodo2();
		c2.metodo3();
		c2.metodo4();
		System.out.println(c3.metodo1());
		c3.metodo2();
		c3.metodo3();
		c3.metodo4(); 
		System.out.println(c1.atributo);
		System.out.println(c2.atributo);
		System.out.println(c3.atributo);
		System.out.println(c1.getAtributo());
		System.out.println(c2.getAtributo());
		System.out.println(c3.getAtributo()); 
	}

}
