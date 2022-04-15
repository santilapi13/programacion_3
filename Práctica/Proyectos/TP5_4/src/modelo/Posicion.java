package modelo;

public class Posicion implements Movible {
	private double x;
	private double y;

	public Posicion(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public double getX() {
		return x;
	}
	
	@Override
	public double getY() {
		return y;
	}
	
	@Override
	public void setXY(double posX, double posY) {
		this.x = posX;
		this.y = posY;
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public double distancia(Movible otro) {
		double respuesta;
		respuesta = (otro.getX() - this.x) * (otro.getX() - this.x) + (otro.getY() - this.y) * (otro.getY() - this.y);
		respuesta = Math.sqrt(respuesta);
		return respuesta;
	}

	@Override
	public void incrementaPos(double incrX, double incrY) {
		this.x += incrX;
		this.y += incrY;
	}

}
