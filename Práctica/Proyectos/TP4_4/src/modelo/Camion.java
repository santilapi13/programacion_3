package modelo;

/**
 * @author Santiago Lapiana
 *
 */
public class Camion extends VehiculoDeCarga {
	double adicional;

	/**
	 * Constructor cuyos parametros son la patente del vcamion y su PMA.<br>
	 * Ademas se calcula un incremento que depende del PMA y del precio base de todos los vehiculos <br>
	 * Tambien se le agrega un adicional fijo del 40% inherente a que se trate de un camion de carga. <br>
	 * @param patente : parametro de tipo String que representa la patente unica que identifica al camion.
	 * @param PMA : parametro de tipo double que representa el Peso Maximo Autorizado en toneladas. Debe ser un valor positivo.
	 */
	public Camion(String patente, double PMA) {
		super(patente, PMA);
		this.adicional = 1.4;
	}
	
	/**
	 * Metodo que calcula el precio de alquiler de un camion de la empresa. Es considerado el precio base establecido para todos los vehiculos y es afectado por un incremento diario por su PMA.<br>
	 * Ademas se le agrega un adicional fijo inherente a que se trate de un camion de carga. <br>
	 * <b>Pre:</b> La cantidad de dias debe ser positiva.  <br>
	 * <b>Post:</b> El valor del alquiler retornado debe ser positivo.<br> 
	 * @param dias : entero que representa la cantidad de dias que permanecera alquilado el vehiculo y que servira para calcular el precio de alquiler.
	 * @return double con el valor de lo que se debe pagar por el alquiler del vehiculo
	 */
	public double calculaAlquiler(int dias) {
		return super.calculaAlquiler(dias) * adicional;
	}
	
}
