package modelo;

public class DatoCargaInvalido {
	
	private double cantDisponible;
	private double cantRequerida;
	private String combustible;

	public DatoCargaInvalido(double cantDisponible, double cantRequerida, String combustible) {
		super();
		this.cantDisponible = cantDisponible;
		this.cantRequerida = cantRequerida;
		this.combustible = combustible;
	}

	public double getCantDisponible() {
		return cantDisponible;
	}
	public double getCantRequerida() {
		return cantRequerida;
	}
	public String getCombustible() {
		return combustible;
	}
	
}
