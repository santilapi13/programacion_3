package modelo;

import java.util.ArrayList;

public class Estacion {
	private ArrayList<Surtidor> surtidores = new ArrayList<Surtidor>();
	private static Estacion instance = null;	// Patron Singleton
	
	private Estacion() {
	}
	
	public static Estacion getInstance() {
		if (instance == null)
			instance = new Estacion();
		return instance;
	}
	
	public int cantSurtidores() {	// RESUELVE 1.
		return this.surtidores.size();
	}
	
	public existCombustible() {
		
	}
	
}
