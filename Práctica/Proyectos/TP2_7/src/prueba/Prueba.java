package prueba;

import modelo.Celular;

public class Prueba {

	public static void main(String[] args) {
		Celular celular = Celular.getInstance();
		System.out.println(celular.nuevoContacto("Santiago Lapiana"));
		System.out.println(celular.nuevoContacto("Santiago Lapiana"));	// Verifica 3.
		System.out.println(celular.agregaCel("Santiago Lapiana", "2235803002"));
		System.out.println(celular.agregaCel("Roberto", "127360"));
		System.out.println(celular.nuevoContacto("Hugo Lapiana","4893933","2235947591"));
		System.out.println(celular.buscaContacto("Santiago Lapiana"));	// 2.
		System.out.println(celular.getContactos());
	}

}
