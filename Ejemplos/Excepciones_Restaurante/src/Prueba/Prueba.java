package Prueba;

import paquete.Cliente;
import restaurante.Mozo;
import restaurante.MozoExtendido2;
import restaurante.Restaurante;

public class Prueba
{

	public static void main(String[] args)
	{
		
		//Puedo intercambiar las instancias del mozo y ver como cambia el
		//funcionamiento del programa.
		//Mozo otroMozo= new MozoExtendido2();
		//Restaurante.getInstance().setMozo(otroMozo);
		
		
		Cliente cliente = new Cliente();
		cliente.hacerPedido("Cafe");
		cliente.hacerPedido("Cortado");
		cliente.hacerPedido("Hamburguesa");
		cliente.hacerPedido("Milanesa");
		System.out.println("***********************");
		Restaurante.getInstance().setHayCafe(false);
		cliente.hacerPedido("Cafe");
		cliente.hacerPedido("Cortado");
		cliente.hacerPedido("Hamburguesa");
		Restaurante.getInstance().setFuncionaLaCocina(false);
		System.out.println("***********************");
		cliente.hacerPedido("Cafe");
		cliente.hacerPedido("Cortado");
		cliente.hacerPedido("Hamburguesa");
	
	}

}
