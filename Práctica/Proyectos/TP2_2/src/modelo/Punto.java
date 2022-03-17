package modelo;

public class Punto {
	private int x;
	private int y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}


	public void cambia(int x1, int y1) {
		setX(x1);	
		setY(y1);	
	}

	public String cartel() {
		return "x=" + x + ", y=" + y;
	}
}