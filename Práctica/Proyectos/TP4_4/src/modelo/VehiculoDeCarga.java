package modelo;

/**
 * @author Santiago Lapiana
 *
 */
public abstract class VehiculoDeCarga extends Vehiculo {
	protected double PMA;
	protected double incrPorPMA;

	/**
	 * Constructor cuyos parametros son la patente del vehiculo de carga y su PMA.<br>
	 * Ademas se calcula un incremento que depende del PMA y del precio base de todos los vehiculos. <br>
	 * @param patente : parametro de tipo String que representa la patente unica que identifica al vehiculo de carga.
	 * @param PMA : parametro de tipo double que representa el Peso Maximo Autorizado en toneladas. Debe ser un valor positivo.
	 */
	public VehiculoDeCarga(String patente,double PMA) {
		super(patente);
		this.PMA = PMA;
		this.incrPorPMA = super.precioBase*0.2*PMA; 
	}

	/**
	 * Metodo que calcula el precio de alquiler de un vehiculo de carga de la empresa. Es considerado el precio base establecido para todos los vehiculos y es afectado por un incremento diario por su PMA.<br>
	 * <b>Pre:</b> La cantidad de dias debe ser positiva.  <br>
	 * <b>Post:</b> El valor del alquiler retornado debe ser positivo.<br> 
	 * @param dias : entero que representa la cantidad de dias que permanecera alquilado el vehiculo y que servira para calcular el precio de alquiler.
	 * @return double con el valor de lo que se debe pagar por el alquiler del vehiculo
	 */
	public double calculaAlquiler(int dias) {
		return (super.precioBase + incrPorPMA) * dias;
	}

}
