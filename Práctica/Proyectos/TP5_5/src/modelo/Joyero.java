package modelo;

public class Joyero extends Artesano {

	public Joyero(String nombre) {
		super(nombre);
	}
	
	public String trabajar(Material mat) {
		return mat.transformarseEnJoya();
	}

}
