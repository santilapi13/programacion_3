package modelo;

public interface Movible {
	double getX();
	double getY();
	void setXY(double posX, double posY);
	void incrementaPos(double incrX, double incrY);
	double distancia(Movible otro);
}
