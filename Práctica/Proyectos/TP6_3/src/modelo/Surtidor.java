package modelo;

import excepciones.CargaInvalidaException;
import excepciones.FaltaCombustibleException;
import excepciones.TipoCombustibleInvalidoException;

public class Surtidor {
	
	private double cantDiesel;
	private double cantPremium;
	private double cantSuper;
	
	public Surtidor() {
		this.cantDiesel = 20000;
		this.cantPremium = 20000;
		this.cantSuper = 20000;
	}
	
	public double getCantDiesel() {
		return cantDiesel;
	}
	public double getCantPremium() {
		return cantPremium;
	}
	public double getCantSuper() {
		return cantSuper;
	}
	
	public void llenarDiesel() {
		this.cantDiesel = 20000;
	}
	public void llenarPremium() {
		this.cantPremium = 20000;
	}
	public void llenarSuper() {
		this.cantSuper = 20000;
	}
	
	public void cargarCombustible(String combustible,double cantidad) throws CargaInvalidaException {
		double cantDisponible = 0;
		if (!combustible.equalsIgnoreCase("diesel") && !combustible.equalsIgnoreCase("premium")  && !combustible.equalsIgnoreCase("super"))
			throw new TipoCombustibleInvalidoException("Tipo de combustible invalido",new DatoCargaInvalido(cantDisponible,cantidad,combustible));
		else {
			if (combustible.equalsIgnoreCase("diesel"))
				cantDisponible = this.cantDiesel;
			else if (combustible.equalsIgnoreCase("premium"))
				cantDisponible = this.cantPremium;
			else if (combustible.equalsIgnoreCase("super"))
				cantDisponible = this.cantSuper;
			
			if (cantidad <= 0)
				throw new CargaInvalidaException("Imposible cargar cantidad negativa",new DatoCargaInvalido(cantDisponible,cantidad,combustible));
			else if (cantidad > cantDisponible)
				throw new FaltaCombustibleException("Falta combustible",new DatoCargaInvalido(cantDisponible,cantidad,combustible));
		}
	}
	 
	
}
