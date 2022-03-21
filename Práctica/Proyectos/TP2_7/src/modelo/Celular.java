package modelo;

import java.util.HashMap;

public class Celular {
	private static Celular instance = null;
	private HashMap<String,Contacto> contactos = new HashMap<String,Contacto>();
	
	private Celular() {
	}
	
	public static Celular getInstance() {
		if (instance == null)
			instance = new Celular();
		return instance;
	}
	
	public boolean nuevoContacto(String nombre) {	// RESUELVE 1. (y 3.)
		if (!this.contactos.containsKey(nombre)) {
			this.contactos.put(nombre, new Contacto(nombre));
			return true;
		} else
			return false;
	}
	public boolean nuevoContacto(String nombre, String telFijo, String cel) {
		if (!this.contactos.containsKey(nombre)) {
			this.contactos.put(nombre, new Contacto(nombre,telFijo,cel));;
			return true;
		} else
			return false;
	}
	public boolean borraContacto(String nombre) {
		if (this.contactos.containsKey(nombre)) {
			this.contactos.remove(nombre);
			return true;
		} else
			return false;
	}
	public boolean agregaCel(String nombre, String cel) {
		if (this.contactos.containsKey(nombre)) {
			this.contactos.get(nombre).getCelulares().add(cel);
			return true;
		} else
			return false;
	}
	public boolean borraCel(String nombre, String cel) {
		if (this.contactos.containsKey(nombre) && this.contactos.get(nombre).getCelulares().contains(cel)) {
			this.contactos.get(nombre).getCelulares().remove(cel);
			return true;
		} else
			return false;
	}
	public boolean cambiaTel(String nombre, String tel) {
		if (this.contactos.containsKey(nombre)) {
			this.contactos.get(nombre).setTelFijo(tel);
			return true;
		} else
			return false;
	}
	
	public Contacto buscaContacto(String nombre) {	// RESUELVE 2.
		if (this.contactos.containsKey(nombre))
			return this.contactos.get(nombre);
		else
			return null;
	}

	public HashMap<String, Contacto> getContactos() {
		return contactos;
	}
	
	
}
