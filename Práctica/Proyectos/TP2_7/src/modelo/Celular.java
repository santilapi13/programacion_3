package modelo;

import java.util.HashMap;

public class Celular {
	private HashMap<String,Contacto> contactos = new HashMap<String,Contacto>();
	
	public void nuevoContacto(String nombre, String telFijo, String cel) {
		Contacto contacto = new Contacto(nombre,telFijo,cel);
		
		//this.contactos.
	}
}
