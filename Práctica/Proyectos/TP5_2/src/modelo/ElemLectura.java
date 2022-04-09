package modelo;

public abstract class ElemLectura {
	
	private String codigo;
	private String titulo;
	private int anio;

	public ElemLectura(String codigo, String titulo, int anio) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.anio = anio;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnio() {
		return anio;
	}

	@Override
	public String toString() {
		return "codigo = " + codigo + ", titulo = " + titulo + ", anio = " + anio + "\n";
	}
	
	

}
