package modelo;

public class Empleado {
	// ATRIBUTOS
	private String nombre;
	private int antiguedad, hsTrabajadas;
	private Categoria cat;
	
	// GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public int getHsTrabajadas() {
		return hsTrabajadas;
	}
	public void setHsTrabajadas(int hsTrabajadas) {
		this.hsTrabajadas = hsTrabajadas;
	}
	public Categoria getCat() {
		return cat;
	}
	public void setCat(Categoria cat) {
		this.cat = cat;
	}
	public double getSueldo() {
		double aux;
		aux = this.cat.getSueldoPorHora() * this.hsTrabajadas;
		if (this.antiguedad > 5)
			if (this.antiguedad < 10)
				aux *= 1.25;
			else
				aux *= 1.35;
		return aux;
	}
	
	// TO STRING
	 public String detalle() {
		String retorno = "\nNombre: " + nombre + "\nAntiguedad: " + antiguedad + "\nHoras Trabajadas: " + hsTrabajadas + "\nTipo de categoria: " + this.cat.getNombreCategoria() + "\nSueldo por hora: " + this.cat.getSueldoPorHora() + "\nSueldo a cobrar: " + this.getSueldo() + "\n";
		return retorno;
	}
	
}
