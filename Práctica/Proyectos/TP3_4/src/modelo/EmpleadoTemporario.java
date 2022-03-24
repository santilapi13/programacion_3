package modelo;

public class EmpleadoTemporario extends Empleado {
	private double sueldoHora;
	private double horasTrabajadas;
	
	public EmpleadoTemporario(String nombre, String nroLegajo, String domicilio,double sueldoHora,double horasTrabajadas) {
		super(nombre, nroLegajo, domicilio);
		this.sueldoHora = sueldoHora;
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoHora() {
		return sueldoHora;
	}
	public void setSueldoHora(double sueldoHora) {
		this.sueldoHora = sueldoHora;
	}
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double calcularSueldo() {
		return this.sueldoHora * this.horasTrabajadas;
	}
	
	
}
