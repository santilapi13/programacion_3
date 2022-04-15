package modelo;

public class Elfo extends Personaje {

	public Elfo(String nombre) {
		super(nombre);
	}

	@Override
	public double getArmadura() {
		return 1000;
	}

	@Override
	public double getAtaqueCorto() {
		return 20;
	}

	@Override
	public double getAtaqueDistante() {
		return 100;
	}

}
