package modelo;

public class Cancion {
	
	private int numPista;
	private String titulo;
	private String duracion;
	
	public Cancion(int numPista,String titulo,String duracion) {
		this.numPista = numPista;
		this.titulo = titulo;
		this.duracion = duracion;
	}

	public int getNumPista() {
		return numPista;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDuracion() {
		return duracion;
	}
	
}
