package modelo;

public class EmpPermExperto extends EmpleadoPermanente {

	public EmpPermExperto(String nombre, String nroLegajo, String domicilio, double sueldoBase, int antiguedad) {
		super(nombre, nroLegajo, domicilio, sueldoBase,antiguedad);
		super.plusAntiguedad = 1.5 + 0.015*super.antiguedad;
	}

	public double calcularSueldo() {
		double sueldoBruto;
		sueldoBruto = super.sueldoBase*super.plusAntiguedad;
		return sueldoBruto - sueldoBruto*EmpleadoPermanente.aportesJub - sueldoBruto*EmpleadoPermanente.obraSocial;
	}

}
