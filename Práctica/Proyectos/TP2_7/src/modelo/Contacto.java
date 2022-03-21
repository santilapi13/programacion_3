package modelo;

import java.util.ArrayList;

public class Contacto {
	private String nombre;
	private String telFijo;
	private ArrayList<String> celulares = new ArrayList<String>();
	
	public Contacto(String nombre, String telFijo, String celular) {
		super();
		this.nombre = nombre;
		this.telFijo = telFijo;
		this.celulares.add(celular);
	}

	public Contacto(String nombre) {
		super();
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTelFijo() {
		return telFijo;
	}
	public void setTelFijo(String telFijo) {
		this.telFijo = telFijo;
	}
	public ArrayList<String> getCelulares() {
		return celulares;
	}
	public void setCelulares(ArrayList<String> celulares) {
		this.celulares = celulares;
	}
	
	
}
