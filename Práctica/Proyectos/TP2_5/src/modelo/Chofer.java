package modelo;

public class Chofer {
	private Categoria categoria;
	private Domicilio domicilio;
	private String nombre;
	private Colectivo colectivo = null;
	
	public Chofer(Categoria categoria, Domicilio domicilio, String nombre) {
		this.categoria = categoria;
		this.domicilio = domicilio;
		this.nombre = nombre;
	}
	
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	public String getNombre() {
		return nombre;
	}
	public Colectivo getColectivo() {
		return colectivo;
	}
	public void setColectivo(Colectivo colectivo) {
		this.colectivo = colectivo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "[categoria=" + categoria + ", domicilio=" + domicilio + ", nombre=" + nombre + ", colectivo="
				+ colectivo + "]";
	}
	
}
