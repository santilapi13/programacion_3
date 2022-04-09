package modelo;

public class Libro extends ElemLectura implements Prestable {
	
	private boolean prestado = false;

	public Libro(String codigo, String titulo, int anio) {
		super(codigo, titulo, anio);
	}

	@Override
	public void prestar() {
		if (!this.prestado)
			this.prestado = true;
	}

	@Override
	public void devolver() {
		if (this.prestado)
			this.prestado = false;
	}

	@Override
	public boolean isPrestado() {
		return this.prestado;
	}

	@Override
	public String toString() {
		return super.toString() + "prestado = " + prestado;
	}
	
}
