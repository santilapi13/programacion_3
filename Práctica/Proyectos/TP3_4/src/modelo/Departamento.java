package modelo;

import java.util.ArrayList;

public class Departamento {
	private String nombre;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
	public Departamento(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		if (!this.empleados.contains(empleado))
			this.empleados.add(empleado);
	}
	public void expulsarEmpleado(Empleado empleado) {
		if (this.empleados.contains(empleado))
			this.empleados.remove(empleado);
	}


	public String toString() {
		return "\nDepartamento " + nombre + ":\n" + empleados;
	}
	
	
}
