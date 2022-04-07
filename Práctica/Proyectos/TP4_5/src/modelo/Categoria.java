package modelo;

public class Categoria {

	private String nombreCategoria;
	private double sueldo;
	private boolean habilitaColectivoLinea = false;
	private boolean habilitaColectivoLarga = false;
	private boolean habilitaCamion = false;
	
	public Categoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
		if (nombreCategoria == "Categoria 1") {
			this.sueldo = 10000;
			this.habilitaColectivoLinea = true;
		} else if (nombreCategoria == "Categoria 2") {
			this.sueldo = 15000;
			this.habilitaColectivoLinea = true;
			this.habilitaColectivoLarga = true;
		} else if (nombreCategoria == "Categoria 3") {
			this.sueldo = 15000;
			this.habilitaCamion = true;
		} else if (nombreCategoria == "Categoria 4") {
			this.sueldo = 17000;
			this.habilitaCamion = true;
			this.habilitaColectivoLarga = true;
			this.habilitaColectivoLinea = true;
		}
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public double getSueldo() {
		return sueldo;
	}

	public boolean isHabilitaColectivoLinea() {
		return habilitaColectivoLinea;
	}

	public boolean isHabilitaColectivoLarga() {
		return habilitaColectivoLarga;
	}

	public boolean isHabilitaCamion() {
		return habilitaCamion;
	}

	@Override
	public String toString() {
		return nombreCategoria + ", Sueldo: " + sueldo;
	}
	
	

}
