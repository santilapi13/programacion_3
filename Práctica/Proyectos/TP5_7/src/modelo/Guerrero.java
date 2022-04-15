package modelo;

public class Guerrero extends Personaje {

	public Guerrero(String nombre) {
		super(nombre);
	}

	@Override
	public double getArmadura() {
		return 1500;
	}

	@Override
	public double getAtaqueCorto() {
		return 100;
	}

	@Override
	public double getAtaqueDistante() {
		return 100;
	}

}
