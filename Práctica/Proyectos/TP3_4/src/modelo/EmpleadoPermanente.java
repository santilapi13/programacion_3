package modelo;

public abstract class EmpleadoPermanente extends Empleado {
	protected int antiguedad;
	protected double plusAntiguedad;
	protected double sueldoBase;
	protected static double aportesJub = 0.11;
	protected static double obraSocial = 0.06;

	public EmpleadoPermanente(String nombre, String nroLegajo, String domicilio,double sueldoBase,int antiguedad) {
		super(nombre, nroLegajo, domicilio);
		this.sueldoBase = sueldoBase;
		this.antiguedad = antiguedad;
	}
	public double getPlusAntiguedad() {
		return plusAntiguedad;
	}
	public static double getAportesJub() {
		return aportesJub;
	}
	public static double getObraSocial() {
		return obraSocial;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public void nuevoAño() {
		(this.antiguedad)++;
	}
	
}
