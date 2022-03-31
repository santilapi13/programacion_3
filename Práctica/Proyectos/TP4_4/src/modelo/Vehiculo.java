package modelo;

/**
 * @author Santiago Lapiana
 *
 */
public abstract class Vehiculo {
	protected double precioBase;
	protected String patente;
	
	/**
	 * Constructor cuyo unico parametro es la patente del vehiculo. Se define el precio base como 500 pero esta sujeto a modificaciones.<br>
	 * @param patente : parametro de tipo String que representa la patente unica que identifica al vehiculo.
	 */
	public Vehiculo(String patente) {
		this.patente = patente;
		this.precioBase = 500;
	}
	
	public String getPatente() {
		return patente;
	}

	/**
	 * Metodo que calcula el precio de alquiler de un vehiculo de la empresa.<br>
	 * <b>Pre:</b> La cantidad de dias debe ser positiva.  <br>
	 * <b>Post:</b> El valor del alquiler retornado debe ser positivo.<br> 
	 * @param dias : entero que representa la cantidad de dias que permanecera alquilado el vehiculo y que servira para calcular el precio de alquiler.
	 * @return double con el valor de lo que se debe pagar por el alquiler del vehiculo
	 */
	public abstract double calculaAlquiler(int dias);

}
