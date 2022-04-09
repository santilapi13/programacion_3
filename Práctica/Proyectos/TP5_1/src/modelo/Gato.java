package modelo;

public class Gato extends Animal {

	public Gato(String nombre, int esperanzaDeVida) {
		super(nombre, 18);
	}

	@Override
	public void emiteSonido() {
		System.out.println("MIAU");
	}

}
