package modelo;

public class Perro extends Animal {

	public Perro(String nombre) {
		super(nombre, 13);
	}

	@Override
	public void emiteSonido() {
		System.out.println("GUAU");
	}

}
