package modelo;

public abstract class Material implements IMaterial {
	
	protected String color;

	public Material(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	

}
