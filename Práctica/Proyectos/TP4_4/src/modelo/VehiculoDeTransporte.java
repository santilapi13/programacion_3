package modelo;

/**
 * @author Santiago Lapiana
 *
 */
public abstract class VehiculoDeTransporte extends Vehiculo {
	protected double incrDiarioPorPlaza;
	protected int plazas;

	/**
	 * Constructor cuyos parametros son la patente y las plazas del vehiculo de transporte correspondiente.<br>
	 * Se calcula tambien el incremento diario por plaza, que para todos los vehiculos de transporte sera un 1.5% diario adicional por plaza.<br>
	 * @param patente : parametro de tipo String que representa la patente unica que identifica al vehiculo.
	 * @param plazas : parametro de tipo entero (y debe ser positivo) que representa la capacidad maxima de personas que pueden ser transportadas en el vehiculo.
	 */
	public VehiculoDeTransporte(String patente, int plazas) {
		super(patente);
		this.plazas = plazas;
		this.incrDiarioPorPlaza = super.precioBase*0.015*plazas;
	}

	/**
	 * Metodo que calcula el precio de alquiler de un vehiculo de transporte de la empresa. Es considerado el precio base establecido para todos los vehiculos y es afectado por un incremento diario por plaza.<br>
	 * <b>Pre:</b> La cantidad de dias debe ser positiva.  <br>
	 * <b>Post:</b> El valor del alquiler retornado debe ser positivo.<br> 
	 * @param dias : entero que representa la cantidad de dias que permanecera alquilado el vehiculo y que servira para calcular el precio de alquiler.
	 * @return double con el valor de lo que se debe pagar por el alquiler del vehiculo
	 */
	public double calculaAlquiler(int dias) {
		return (super.precioBase + incrDiarioPorPlaza) * dias ;
	}

}
