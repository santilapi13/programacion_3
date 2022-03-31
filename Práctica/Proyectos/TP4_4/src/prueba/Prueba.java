package prueba;

import java.util.ArrayList;

import modelo.Auto;
import modelo.Camion;
import modelo.Camioneta;
import modelo.Combi;
import modelo.Vehiculo;

public class Prueba {
	public static void main(String[] args) {
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(new Auto("AA437MO",5));
		vehiculos.add(new Camioneta("AA721ME",3.5));
		vehiculos.add(new Combi("AE728US",20));
		vehiculos.add(new Camion("AR981IE",7.5));
		
		vehiculos.add(new Auto("AA438MO",2));
		vehiculos.add(new Camioneta("AA722ME",4));
		vehiculos.add(new Combi("AE729US",30));
		vehiculos.add(new Camion("AR982IE",10.5));
		
		vehiculos.add(new Auto("AA439MO",4));
		vehiculos.add(new Camion("AA721MH",12));
		
		int i;
		for(i=0;i<vehiculos.size();i++)
			System.out.println(vehiculos.get(i).calculaAlquiler(5));
	}

}
