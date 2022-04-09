package prueba;

import modelo.Corredor;
import modelo.Deportista;
import modelo.Kayakista;
import modelo.Nadador;

public class Prueba
{

	

	public static void main(String[] args)
	{
		Deportista d1=new Nadador("Valeria");
		Deportista d2=new Kayakista("Adriana",true);
		Deportista d3=new Kayakista("Ezequiel",false);
		Deportista d4=new Corredor("Emanuel");
		
		d1.entrenar();
		d2.entrenar();
		d3.entrenar();
		d4.entrenar();
	}

}
