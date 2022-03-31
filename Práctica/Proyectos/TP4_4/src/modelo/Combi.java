package modelo;

/**
 * @author Santiago Lapiana
 *
 */
public class Combi extends VehiculoDeTransporte {
	private double incrPorPlaza;

	/**
	 * Constructor cuyos parametros son la patente y las plazas de la combi.<br>
	 * Se calcula tambien el incremento diario por plaza, que para todos los vehiculos de transporte sera un 1.5% diario adicional por plaza.<br>
	 * Ademas se calcula el incremento inherente a la cantidad de plazas de la combi (independiente de los dias). <br>
	 * @param patente : parametro de tipo String que representa la patente unica que identifica a la combi.
	 * @param plazas : parametro de tipo entero (y debe ser positivo) que representa la capacidad maxima de personas que pueden ser transportadas en la combi.
	 */
	public Combi(String patente, int plazas) {
		super(patente, plazas);
		this.incrPorPlaza = 0.02 * plazas;
	}
	
	/**
	 * Metodo que calcula el precio de alquiler de una combi de la empresa. Es considerado el precio calculado para todos los vehiculos de transporte y ese le adiciona un incremento por plaza.<br>
	 * <b>Pre:</b> La cantidad de dias debe ser positiva.  <br>
	 * <b>Post:</b> El valor del alquiler retornado debe ser positivo.<br> 
	 * @param dias : entero que representa la cantidad de dias que permanecera alquilado el vehiculo y que servira para calcular el precio de alquiler.
	 * @return double con el valor de lo que se debe pagar por el alquiler de la combi.
	 */
	public double calculaAlquiler(int dias) {
		double precioParcial = super.calculaAlquiler(dias);
		return precioParcial + precioParcial * this.incrPorPlaza;
	}
	
}
