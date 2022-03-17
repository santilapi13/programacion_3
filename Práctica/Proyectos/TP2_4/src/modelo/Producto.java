package modelo;

public class Producto {
	private String cod;
	private String descripcion;
	private double precio;
	
	
	
	public Producto(String cod, String descripcion, double precio) {
		this.cod = cod;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public String getCod() {
		return cod;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
