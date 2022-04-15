package modelo;

public abstract class Artesano implements IArtesano {
	
	private String nombre;

	public Artesano(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

}
