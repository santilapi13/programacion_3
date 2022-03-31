package prueba;

import modelo.A;
import modelo.C;

public class Prueba {

	public static void main(String[] args) {

		C datoc = new C();
		 datoc.m3();	// m3 de C
		 datoc.m2();	// m2 de A
		 datoc.m1();	// m1 de B
		 System.out.println("El valor de los atributos es: \n "+ " varC1="+datoc.varC1+ " var1="+ datoc.var1 + " var2="+ datoc.var2 + " varB1=" + datoc.varB1 + "\n");
		 // el valor de los atributos es:
		 // varC1=500 var1=700 var2=200 varB1 = 100
		 
		 // INCISO B
		 A datoX = new C();
		 //datoX.m3();	// no funciona porque no es un metodo propio de A
		 datoX.m2();	// m2 de A
		 datoc.m1();	// m1 de B (porque está sobrescrito
		 System.out.println("El valor de los atributos es: \n "+ /*" varC1="+ datoX.varC1 +*/ " var1="+ datoX.var1 + " var2="+ datoX.var2 /*+" varB1=" + datoX.varB1*/);
		 // el valor de los atributos es:
		 // varC1= error porque el atributo no existe para variable A
		 // var1 = 10
		 // var2 = 20
		 // varB1 = error porque el atributo no existe para variable A
	}

}
