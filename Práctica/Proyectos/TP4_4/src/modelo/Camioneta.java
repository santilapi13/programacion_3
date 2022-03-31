package modelo;

/**
 * @author Santiago Lapiana
 *
 */
public class Camioneta extends VehiculoDeCarga {

	/**
	 * Constructor cuyos parametros son la patente de la camioneta y su PMA.<br>
	 * Ademas se calcula un incremento que depende del PMA y del precio base de todos los vehiculos. <br>
	 * @param patente : parametro de tipo String que representa la patente unica que identifica a la camioneta.
	 * @param PMA : parametro de tipo double que representa el Peso Maximo Autorizado en toneladas. Debe ser un valor positivo.
	 */
	public Camioneta(String patente, double PMA) {
		super(patente, PMA);
	}

}
