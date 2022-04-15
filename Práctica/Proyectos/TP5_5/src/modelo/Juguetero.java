package modelo;

public class Juguetero extends Artesano {

	public Juguetero(String nombre) {
		super(nombre);
	}

	public String trabajar(Material mat) {
		return mat.transformarseEnJuguete();
	}
}
