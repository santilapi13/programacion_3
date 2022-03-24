package modelo;

public class AutomovilManual extends Automovil {

	public AutomovilManual(String patente, double velocidadmaxima) {
		super(patente, velocidadmaxima);
	}
	public AutomovilManual(String patente) {
		super(patente, 160);
	}

	public void acelerar(double vel) {
		if (vel > super.velocidad && vel > 0 && vel <= super.velocidadmaxima) {
			super.velocidad = vel;
		}
	}

	public void frenar(double vel) {
		if (vel < super.velocidad && vel >= 0)
			super.velocidad = vel;
	}

}
