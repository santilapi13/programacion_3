package modelo;

public class EmpPermIntermedio extends EmpleadoPermanente {

	public EmpPermIntermedio(String nombre, String nroLegajo, String domicilio, double sueldoBase, int antiguedad) {
		super(nombre, nroLegajo, domicilio, sueldoBase, antiguedad);
		super.plusAntiguedad = 1.25 + 0.01*super.antiguedad;
	}

	public double calcularSueldo() {
		double sueldoBruto;
		sueldoBruto = super.sueldoBase*super.plusAntiguedad;
		return sueldoBruto - sueldoBruto*EmpleadoPermanente.aportesJub - sueldoBruto*EmpleadoPermanente.obraSocial;
	}
}
