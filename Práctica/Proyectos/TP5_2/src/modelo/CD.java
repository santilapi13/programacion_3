package modelo;

import java.util.ArrayList;

public class CD implements Prestable,Comparable {
	
	private String codigo;
	private String interprete;
	private String titulo;
	private ArrayList<Cancion> canciones;
	private boolean prestado = false;
	
	public CD(String codigo,String interprete,String titulo,ArrayList<Cancion> canciones) {
		this.codigo = codigo;
		this.interprete = interprete;
		this.titulo = titulo;
		this.canciones = canciones;
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

	public String getCodigo() {
		return codigo;
	}

	public String getInterprete() {
		return interprete;
	}

	public String getTitulo() {
		return titulo;
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	@Override
	public void comparar(CD disco) {
		if (this.interprete != disco.getInterprete())
			if (this.interprete.compareTo(disco.getInterprete()) < 0)
				System.out.println("Este disco va antes que el pasado por parametro");
			else
				System.out.println("Este disco va despues que el pasado por parametro");
		else if (this.titulo != disco.getTitulo())
			if (this.titulo.compareTo(disco.getTitulo()) < 0)
				System.out.println("Este disco va antes que el pasado por parametro");
			else
				System.out.println("Este disco va despues que el pasado por parametro");
		else
			System.out.println("Son el mismo disco");		
	}
	
}
