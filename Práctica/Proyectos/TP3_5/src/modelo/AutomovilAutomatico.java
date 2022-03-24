package modelo;

public class AutomovilAutomatico extends Automovil {
	public AutomovilAutomatico(String patente, double velocidadmaxima) {
		super(patente, velocidadmaxima);
	}
	public AutomovilAutomatico(String patente) {
		super(patente, 160);
	}

	public void acelerar(double vel) {
		if (vel > super.velocidad && vel > 0 && vel <= super.velocidadmaxima) {
			super.velocidad = vel;
			if (vel <= 10)
				this.setMarcha(1);
			else if (vel <= 35)
				this.setMarcha(2);
			else if (vel <=50)
				this.setMarcha(3);
			else if (vel <= 90)
				this.setMarcha(4);
			else
				this.setMarcha(5);
		}
	}

	public void frenar(double vel) {
		if (vel < super.velocidad && vel >= 0) {
			super.velocidad = vel;
			if (vel == 0)
				this.setMarcha(0);
			else if (vel <= 10)
				this.setMarcha(1);
			else if (vel <= 35)
				this.setMarcha(2);
			else if (vel <=50)
				this.setMarcha(3);
			else if (vel <= 90)
				this.setMarcha(4);
			else
				this.setMarcha(5);
		}
	}
	
}
