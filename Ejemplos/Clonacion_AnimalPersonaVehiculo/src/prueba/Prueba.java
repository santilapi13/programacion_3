package prueba;

import paquete.Animal;
import paquete.Domicilio;
import paquete.DomicilioConDpto;
import paquete.Gato;
import paquete.Persona;

public class Prueba
{
	public static void main(String[] args)
	{
		Domicilio d = new DomicilioConDpto("Matheu", 23,6,'B');
		Animal m=new Gato("Tom",15);
		
		Persona p = new Persona("Carlos", 123456789, d,m);
		
		Persona q = null;
		try
		{
			q = (Persona) p.clone();
		} catch (CloneNotSupportedException e1)
		{
			// TODO Auto-generated catch block
		System.out.println("Error al clonar");
		}
		System.out.println(p);
		System.out.println(q);
		
		
	
	}
}
