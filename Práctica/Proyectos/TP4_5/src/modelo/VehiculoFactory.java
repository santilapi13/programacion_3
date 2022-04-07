package modelo;

public class VehiculoFactory {

	public Vehiculo getVehiculo(String tipoVehiculo, String modelo,int cantidadPasajeros) {
		if (tipoVehiculo == null)
			return null;
		if (tipoVehiculo.equalsIgnoreCase("ColectivoLinea"))
			return new Colectivo(modelo,cantidadPasajeros);
		return null;
	}
	
	public Vehiculo getVehiculo(String tipoVehiculo, String modelo,int cantidadPasajeros, boolean cocheCama) {
		if (tipoVehiculo == null)
			return null;
		if (tipoVehiculo.equalsIgnoreCase("ColectivoLargaDistancia"))
			return new ColectivoLargaDistancia(modelo,cantidadPasajeros,cocheCama);
		return null;
	}

	public Vehiculo getVehiculo(String tipoVehiculo, String modelo,double tara, double cargaMaxima) {
		if (tipoVehiculo == null)
			return null;
		if (tipoVehiculo.equalsIgnoreCase("Camion"))
			return new Camion(modelo,tara,cargaMaxima);
		return null;
	}
	
}
