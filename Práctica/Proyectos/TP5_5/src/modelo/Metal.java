package modelo;

public class Metal extends Material {
	
	private String nombre;

	public Metal(String nombre,String color) {
		super(color);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String transformarseEnJoya() {
		return "Joyero fabrica anillo de " + this.nombre + " color " + super.color;
	}
	
	public String transformarseEnJuguete() {
		return "Juguetero fabrica autito de " + this.nombre + " color " + super.color;
	}
	
}
