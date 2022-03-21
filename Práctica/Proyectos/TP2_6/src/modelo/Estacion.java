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
	
	
	public ArrayList<Surtidor> getSurtidores() {
		return surtidores;
	}

	public void creaSurtidor() {
		this.surtidores.add(new Surtidor());
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
	
	public Surtidor surtMasVentas(char tipo) {		// RESUELVE 3.
		int i,max=-1;
		Surtidor sMax = null,act;	// En caso de no haber surtidores retornará null
		if (tipo == 'G' || tipo == 'g' || tipo == 'S'  || tipo == 's'  || tipo == 'P'  || tipo == 'p') {
			switch (tipo) {
				case 'G','g':
					for (i=0;i<this.surtidores.size();i++) {
						act = this.surtidores.get(i);
						if (act.getGasoilVentas() > max) {
							max = act.getGasoilVentas();
							sMax = act;
						}
					}
				break;
				case 'P','p':
					for (i=0;i<this.surtidores.size();i++) {
						act = this.surtidores.get(i);
						if (act.getPremiumVentas() > max) {
							max = act.getPremiumVentas();
							sMax = act;
						}
					}
				break;
				case 'S','s':
					for (i=0;i<this.surtidores.size();i++) {
						act = this.surtidores.get(i);
						if (act.getSuperVentas() > max) {
							max = act.getSuperVentas();
							sMax = act;
						}
					}
				break;
			}
		}
		return sMax;
	}
	
	public int historicoComb(char tipo, Surtidor surtidor) {	// RESUELVE 4.
		int i,acum=0;
		if (surtidor == null) {		// Toda la estacion
			switch (tipo) {
				case 'G','g':
					for (i=0;i<this.surtidores.size();i++) {
						acum += this.surtidores.get(i).getGasoilVendido();
					}
				break;
				case 'P','p':
					for (i=0;i<this.surtidores.size();i++) {
						acum += this.surtidores.get(i).getPremiumVendido();
					}
				break;
				case 'S','s':
					for (i=0;i<this.surtidores.size();i++) {
						acum += this.surtidores.get(i).getSuperVendido();
					}
				break;
				default:
					acum = -1;
			}
			return acum;
		} else {	// Surtidor especifico
			switch (tipo) {
				case 'G','g':
					return surtidor.getGasoilVendido();
				case 'P','p':
					return surtidor.getPremiumVendido();
				case 'S','s':
					return surtidor.getSuperVendido();
			}
			return -1;
		}
	}
}
