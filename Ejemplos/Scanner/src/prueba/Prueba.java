package prueba;

import java.util.ArrayList;
import java.util.Scanner;

import paquete.Persona;

public class Prueba
{

    public static void main(String[] args)
    {
	ArrayList<Persona> gente = new ArrayList<Persona>();

	Scanner scanner = new Scanner(System.in);
	// Se crea un objeto que para obtener String desde el teclado
	String cadena;
	String nombre;
	do
	{
	    int edad = -1;
	    System.out.println("Ingrese un nombre");
	    nombre = scanner.nextLine(); // El metodo nextLine devuelve el String ingresado por teclado
	    do
	    {
		System.out.println("Ingrese una edad (entero positivo)");
		cadena = scanner.nextLine();
		try
		{
		    edad = Integer.parseInt(cadena); // Para leer enteros se debe convertir el String
						     // ingresado en entero, en caso de haber ingresado
						     // un entero no valido (cualquir cadena) se lanza una excepcion de
						     // tipo NumberFormatException
		} catch (NumberFormatException e)
		{
		    System.out.println("Edad no valida, ingrese un entero positivo"); // En el bloque Catch simplemente
										      // se despliega un cartel en
										      // pantalla y nos aseguramos que
										      // los ciclos repetitivos nos
										      // permitan volver a ingresar el
										      // entero requerido

		}
	    } while (edad < 0);
	    gente.add(new Persona(nombre, edad));
	    System.out.println("Desea ingresar mas personas? (S/N)");
	    cadena = scanner.nextLine();
	} while (cadena.equalsIgnoreCase("S"));

	for (int i = 0; i < gente.size(); i++)
	    System.out.println(gente.get(i));
    }

}
