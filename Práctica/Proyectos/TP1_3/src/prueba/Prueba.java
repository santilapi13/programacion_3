package prueba;
import modelo.Empleado;
import modelo.Categoria;

public class Prueba {
	public static void main(String[] args) {
		// INSTANCIAS
		Empleado e1 = new Empleado();
		Empleado e2 = new Empleado();
		Empleado e3 = new Empleado();
		Empleado e4 = new Empleado();
		Empleado e5 = new Empleado();
		Empleado e6 = new Empleado();
		Categoria cP = new Categoria("Principiante", 80);
		Categoria cO = new Categoria("Operario", 100);
		Categoria cE = new Categoria("Experto", 130);
		
		// DEFINICION DE CADA EMPLEADO
		e1.setNombre("Juan Perez");
		e1.setCat(cP);
		e1.setHsTrabajadas(100);
		e1.setAntiguedad(4);
		
		e2.setNombre("Roberto Gonzales");
		e2.setCat(cP);
		e2.setHsTrabajadas(120);
		e2.setAntiguedad(8);
		
		e3.setNombre("Sandra Lopez");
		e3.setCat(cP);
		e3.setHsTrabajadas(120);
		e3.setAntiguedad(14);
		
		e4.setNombre("German Gutierrez");
		e4.setCat(cO);
		e4.setHsTrabajadas(110);
		e4.setAntiguedad(16);
		
		e5.setNombre("Vicente Hernandez");
		e5.setCat(cE);
		e5.setHsTrabajadas(100);
		e5.setAntiguedad(9);
		
		e6.setNombre("Carolina Gomez");
		e6.setCat(cE);
		e6.setHsTrabajadas(115);
		e6.setAntiguedad(20);
		
		// MUESTRA POR PANTALLA
		System.out.println(e1.detalle());
		System.out.println(e2.getSueldo());
		System.out.println(e3.getSueldo());
		System.out.println(e4.getSueldo());
		System.out.println(e5.getSueldo());
		System.out.println(e6.getSueldo());
	}
}
