package modelo;

public class Revista extends ElemLectura {
	
	private int num;
	
	public Revista(String codigo, String titulo, int anio, int num) {
		super(codigo, titulo, anio);
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	@Override
	public String toString() {
		return super.toString() + "num = " + num;
	}

}
