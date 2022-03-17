package modelo;

public class Categoria {
	// ATRIBUTOS
	private String nombreCategoria;
	private double sueldoPorHora;
	
	// GETTERS
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public double getSueldoPorHora() {
		return sueldoPorHora;
	}
	
	// CONSTRUCTOR
	public Categoria(String nombreCategoria, double sueldoPorHora) {
		this.nombreCategoria = nombreCategoria;
		this.sueldoPorHora = sueldoPorHora;
	}
	
}
