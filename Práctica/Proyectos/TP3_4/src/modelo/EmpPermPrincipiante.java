package modelo;

public class EmpPermPrincipiante extends EmpleadoPermanente{
	
	public EmpPermPrincipiante(String nombre, String nroLegajo, String domicilio, double sueldoBase, int antiguedad) {
		super(nombre, nroLegajo, domicilio, sueldoBase, antiguedad);
		if (super.antiguedad >= 2 && super.antiguedad < 5 )
			super.plusAntiguedad = 1.05;
		else if (super.antiguedad >= 5 && super.antiguedad < 10 )
			super.plusAntiguedad = 1.07;
		else if (super.antiguedad >= 10 && super.antiguedad < 15 )
			super.plusAntiguedad = 1.1;
		else if (super.antiguedad >= 15 && super.antiguedad < 20 )
			super.plusAntiguedad = 1.15;
		else if (super.antiguedad >= 20 )
			super.plusAntiguedad = 1.2;
	}

	public double calcularSueldo() {
		double sueldoBruto;
		sueldoBruto = super.sueldoBase*super.plusAntiguedad;
		return sueldoBruto - sueldoBruto*EmpleadoPermanente.aportesJub - sueldoBruto*EmpleadoPermanente.obraSocial;
	}

}
