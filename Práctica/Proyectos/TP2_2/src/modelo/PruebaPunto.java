package modelo;

public class PruebaPunto {
	public static void main(String[] args) {
		Punto p1 = new Punto(2,3);
		Punto p2;
		//Punto p3 = new Punto(); No hay constructor sin parametro
		System.out.println("P1=" + p1.cartel());
		//p3 = p2; p3 no existe XD
		p2 = p1;
		p1.cambia(8, 5);
		System.out.println("P2=" + p2.cartel());
	}
}
