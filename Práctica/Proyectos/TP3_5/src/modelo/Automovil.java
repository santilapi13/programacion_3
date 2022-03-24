package modelo;

public abstract class Automovil {
	private String patente;
	protected double velocidad;
	protected double velocidadmaxima;
	protected int marcha;
	
	public Automovil(String patente, double velocidadmaxima) {
		this.patente = patente;
		this.velocidadmaxima = velocidadmaxima;
		this.velocidad = 0;
	}
	public Automovil(String patente) {
		this(patente,160);
	}
	
	public String getPatente() {
		return patente;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public int getMarcha() {
		return marcha;
	}
	protected void setMarcha(int nuevaMarcha) {
		if (nuevaMarcha >= -1 && nuevaMarcha <= 5)
			this.marcha = nuevaMarcha;
	}
	
	public abstract void acelerar(double vel);
	
	public abstract void frenar(double vel);
	
	public void marchaAtras(double vel) {
		if (this.velocidad == 0 && vel > 0) {
			this.setMarcha(-1);
			this.velocidad = vel;
		}
	}
	
	public String toString() {
		return "patente " + patente + ", velocidad " + velocidad + ", velocidadmaxima " + velocidadmaxima
				+ ", marcha " + marcha;
	}
	
}
