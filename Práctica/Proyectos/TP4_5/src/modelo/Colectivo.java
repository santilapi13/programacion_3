package modelo;

public class Colectivo extends Vehiculo {
	
	private int cantidadPasajeros;
	private static int contInterno = 0;
	private int numDeInterno;
	
	public Colectivo(String modelo,int cantidadPasajeros) {
		super(modelo);
		this.cantidadPasajeros = cantidadPasajeros;
		contInterno++;
		this.numDeInterno = contInterno;
	}

	public int getNumDeInterno() {
		return numDeInterno;
	}
	
	@Override
	public boolean aceptoChofer(Chofer chofer) {
		return (chofer.getCategoria().isHabilitaColectivoLinea());
	}

	public int getCantidadPasajeros() {
		return cantidadPasajeros;
	}

	@Override
	public String toString() {
		return "Cantidad Pasajeros: " + cantidadPasajeros + "\nNumero Interno: " + numDeInterno + "\n";
	}
	
	
	
}
