package prueba;

import modelo.Chofer;
import modelo.Empresa;
import modelo.Categoria;
import modelo.Domicilio;
import modelo.Colectivo;

public class Prueba {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		
		empresa.nuevaCategoria(new Categoria("cat1",1000));
		empresa.nuevaCategoria(new Categoria("cat2",2000));;
		empresa.nuevaCategoria(new Categoria("cat3",3000));
		
		Chofer chof1 = new Chofer(empresa.getCategorias().get(0),new Domicilio("Pringles",852),"Juan Carlos");	
		empresa.nuevoChofer(chof1);
		
		Chofer chof2 = new Chofer(empresa.getCategorias().get(1),new Domicilio("Juan J. Paso",3273),"Roberto");
		empresa.nuevoChofer(chof2);
		
		Chofer chof3 = new Chofer(empresa.getCategorias().get(2),new Domicilio("Belgrano",2481),"Clodomiro");
		empresa.nuevoChofer(chof3);
		
		Chofer chof4 = new Chofer(empresa.getCategorias().get(0),new Domicilio("Catamarca",391),"Pedro");
		empresa.nuevoChofer(chof4);
		
		empresa.nuevoColectivo(new Colectivo("Primero",1));
		empresa.nuevoColectivo(new Colectivo("Segundo",2));
		empresa.nuevoColectivo(new Colectivo("Tercero",3));
		
		if (empresa.asignaColectivo(chof1, empresa.getColectivos().get(0)))
			System.out.println("Chofer asignado con exito");
		else
			System.out.println("Imposible asignar chofer");
		
		if (empresa.asignaColectivo(chof2, empresa.getColectivos().get(1)))
			System.out.println("Chofer asignado con exito");
		else
			System.out.println("Imposible asignar chofer");
		
		if (empresa.asignaColectivo(chof3, empresa.getColectivos().get(2)))
			System.out.println("Chofer asignado con exito");
		else
			System.out.println("Imposible asignar chofer");

		if (empresa.asignaColectivo(chof4, empresa.getColectivos().get(0)))
			System.out.println("Chofer asignado con exito");
		else
			System.out.println("Imposible asignar chofer");
		
		System.out.println(chof1);
		System.out.println(chof2);
		System.out.println(chof3);
		System.out.println(chof4);
	}

}
