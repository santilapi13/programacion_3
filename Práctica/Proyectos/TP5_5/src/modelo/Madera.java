package modelo;

public class Madera extends Material {
	
	private String tipo;

	public Madera(String tipo,String color) {
		super(color);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public String transformarseEnJoya() {
		return "Joyero fabrica par de aros de " + this.tipo + " color " + super.color;
	}
	
	public String transformarseEnJuguete() {
		return "Juguetero fabrica munequito de " + this.tipo + " color " + super.color;
	}
}
