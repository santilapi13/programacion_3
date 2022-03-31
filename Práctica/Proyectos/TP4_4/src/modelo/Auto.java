package modelo;

/**
 * @author Santiago Lapiana
 *
 */
public class Auto extends VehiculoDeTransporte {
	
	/**
	 * Constructor cuyos parametros son la patente y las plazas del auto correspondiente.<br>
	 * Se calcula tambien el incremento diario por plaza, que para los autos sera un 1.5% diario adicional por plaza.<br>
	 * @param patente : parametro de tipo String que representa la patente unica que identifica al vauto.
	 * @param plazas : parametro de tipo entero (y debe ser positivo) que representa la capacidad maxima de personas que pueden ser transportadas en el auto.
	 */
	public Auto(String patente,int plazas) {
		super(patente,plazas);
	}

}
