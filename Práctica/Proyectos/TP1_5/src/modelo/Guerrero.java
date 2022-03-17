package modelo;

public class Guerrero {
	// ATRIBUTOS
	private String nombre;
	private double vitalidad;
	private double armadura;
	private double x;
	private double y;
	
	// GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getVitalidad() {
		return vitalidad;
	}
	public void setVitalidad(double vitalidad) {
		this.vitalidad = vitalidad;
	}
	public double getArmadura() {
		return armadura;
	}
	public void setArmadura(double armadura) {
		this.armadura = armadura;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	// METODOS
	public void mover(double inc_x, double inc_y) {
		this.x += inc_x;
		this.y += inc_y;
	}
	
	public void recibeDano(double cantidad) {
		if (this.armadura > cantidad)
			this.armadura -= cantidad;
		else {
			vitalidad -= cantidad - armadura;
			this.armadura = 0;
		}
	}
	
}
