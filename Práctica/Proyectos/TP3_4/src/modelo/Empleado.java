package modelo;

public abstract class Empleado {
	private String nombre;
	private String nroLegajo;
	private String domicilio;
	
	public Empleado(String nombre, String nroLegajo, String domicilio) {
		super();
		this.nombre = nombre;
		this.nroLegajo = nroLegajo;
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return nombre;
	}
	public String getNroLegajo() {
		return nroLegajo;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public abstract double calcularSueldo();
	
	public String toString() {
		return nombre + ", sueldo: $" + this.calcularSueldo() + "\n";
	}
	
}
