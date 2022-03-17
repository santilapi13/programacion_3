package modelo;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Colectivo> colectivos = new ArrayList<Colectivo>();
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	private ArrayList<Chofer> choferes = new ArrayList<Chofer>();
	
	public ArrayList<Colectivo> getColectivos() {
		return colectivos;
	}
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	public ArrayList<Chofer> getChoferes() {
		return choferes;
	}
	
	public void nuevoColectivo(Colectivo colectivo) {
		this.colectivos.add(colectivo);
	}
	
	public void nuevaCategoria(Categoria categoria) {
		this.categorias.add(categoria);
	}
	
	public void nuevoChofer(Chofer chofer) {
		this.choferes.add(chofer);
	}
	
	public void borraColectivo(Colectivo colectivo) {
		if (this.colectivos.contains(colectivo))
			this.colectivos.remove(colectivo);
	}
	
	public void borraCategoria(Categoria categoria) {
		if (this.categorias.contains(categoria))
			this.categorias.remove(categoria);
	}
	
	public void borraChofer(Chofer chofer) {
		if (this.choferes.contains(chofer))
			this.choferes.remove(chofer);
	}
	
	public boolean asignaColectivo(Chofer chofer, Colectivo colectivo) {	// Retorna true si se hizo o false si no
		int i=0;
		if (this.choferes.contains(chofer) && this.colectivos.contains(colectivo)) {	// Comprueba que chofer y colectivo existan
			while (i<this.choferes.size() && this.choferes.get(i).getColectivo() != colectivo)
				i++;
			if (i>=this.choferes.size() || this.choferes.get(i).getColectivo() != colectivo) {
				chofer.setColectivo(colectivo);
				return true;
			} else
				return false;
		} else
			return false;
	}
	
	public void desasignaColectivo(Chofer chofer) {
		if (this.choferes.contains(chofer))
			chofer.setColectivo(null);
	}
	
	public int choferesSinColectivo() {	// RESUELVE 1.
		int i,cont = 0;
		for(i=0;i<this.choferes.size();i++)
			if (this.choferes.get(i).getColectivo() == null)
				cont++;
		return cont;
	}
	
	public int cantColectivos() {	// RESUELVE 2.
		return colectivos.size();
	}
	
	public ArrayList<Chofer> choferesDeCat(Categoria categoria) {	// RESUELVE 3.
		int i;
		ArrayList<Chofer> choferes = new ArrayList<Chofer>();
		for(i=0;i<this.choferes.size();i++)
			if (this.choferes.get(i).getCategoria() == categoria)
				choferes.add(this.choferes.get(i));
		return choferes;
	}
		
	public ArrayList<Categoria> catMayorSueldoQue(double monto) {	// RESUELVE 4.
		int i;
		ArrayList<Categoria> categorias = new ArrayList<Categoria>();
		for (i=0;i<this.categorias.size();i++)
			if (this.categorias.get(i).getSueldo() > monto)
				categorias.add(this.categorias.get(i));
		return categorias;
	}
	
	public ArrayList<Chofer> choferMayorSueldoQue(double monto) {	// RESUELVE 5.
		int i;
		ArrayList<Chofer> choferes = new ArrayList<Chofer>();
		for (i=0;i<this.choferes.size();i++)
			if (this.choferes.get(i).getCategoria().getSueldo() > monto)
				choferes.add(this.choferes.get(i));
		return choferes;
	}
	
}
