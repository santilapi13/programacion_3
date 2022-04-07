package modelo;

public class Chofer {

	private String domicilio;
	private String nombre;
	private Categoria categoria;
	private Vehiculo vehiculoAsignado;
	
	public Chofer(String domicilio,String nombre,Categoria categoria) {
		this.domicilio = domicilio;
		this.nombre = nombre;
		this.categoria = categoria;
	}
	public Chofer(String domicilio,String nombre,Categoria categoria,Vehiculo vehiculo) {
		this(domicilio,nombre,categoria);
		this.vehiculoAsignado = vehiculo;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Vehiculo getVehiculoAsignado() {
		return vehiculoAsignado;
	}

	public void setVehiculoAsignado(Vehiculo vehiculoAsignado) {
		this.vehiculoAsignado = vehiculoAsignado;
	}

	public String getNombre() {
		return nombre;
	}
	@Override
	public String toString() {
		return "\nChofer " + nombre + ", domicilio: " + domicilio + ", categoria: " + categoria
				+ "\nVehiculo Asignado: " + vehiculoAsignado;
	}
	
	
	
}
