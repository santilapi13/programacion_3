package modelo;

public abstract class Personaje implements Movible {
	private String nombre;
	protected int vitalidad;
	private Movible movible;
	
	public Personaje(String nombre, int vitalidad, Posicion posicion) {
		this.nombre = nombre;
		this.vitalidad = vitalidad;
		this.movible = posicion;
	}

	public String getNombre() {
		return nombre;
	}
	public int getVitalidad() {
		return vitalidad;
	}
	public Movible getPosicion() {
		return movible;
	}

	@Override
	public double getX() {
		return this.movible.getX();
	}

	@Override
	public double getY() {
		return this.movible.getY();
	}

	@Override
	public void setXY(double posX, double posY) {
		this.movible.setXY(posX, posY);
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", vitalidad=" + vitalidad + ", posicion=" + movible + "]";
	}

	@Override
	public void incrementaPos(double incrX, double incrY) {
		this.movible.incrementaPos(incrX, incrY);
	}
	
	@Override
	public double distancia(Movible otro) {
		return this.movible.distancia(otro);
	}

	public abstract String ataca(Personaje adversario);
	public abstract void recibeDano(int cantidad);

}
