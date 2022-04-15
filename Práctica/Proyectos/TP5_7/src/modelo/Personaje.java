package modelo;

public abstract class Personaje implements IPersonaje {
	
	private String nombre;

	public Personaje(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
}
