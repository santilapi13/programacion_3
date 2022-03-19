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
	
	public int existCombustible(char tipo) {		// RESUELVE 2.
		int i,acum=0;
		if (tipo != 'G' && tipo != 'g' && tipo != 'S'  && tipo != 's'  && tipo != 'P'  && tipo != 'p')
			return -1;	// Retorna un valor imposible para evidenciar que hubo un error en el parametro
		else {
			switch (tipo) {
				case 'G','g':
					for (i=0;i<this.surtidores.size();i++) {
						acum += this.surtidores.get(i).getCantGasoil();
					}
				break;
				case 'P','p':
					for (i=0;i<this.surtidores.size();i++) {
						acum += this.surtidores.get(i).getCantPremium();
					}
				break;
				case 'S','s':
					for (i=0;i<this.surtidores.size();i++) {
						acum += this.surtidores.get(i).getCantSuper();
					}
				break;
			}
			return acum;
		}
	}
	
}
