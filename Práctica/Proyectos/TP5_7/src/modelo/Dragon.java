package modelo;

public class Dragon extends Personaje {

	public Dragon(String nombre) {
		super(nombre);
	}

	@Override
	public double getArmadura() {
		return 10000;
	}

	@Override
	public double getAtaqueCorto() {
		return 500;
	}

	@Override
	public double getAtaqueDistante() {
		return 200;
	}

}
