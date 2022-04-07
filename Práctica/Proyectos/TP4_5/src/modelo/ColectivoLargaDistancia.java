package modelo;

public class ColectivoLargaDistancia extends Colectivo {
	
	private boolean cocheCama;
	
	public ColectivoLargaDistancia(String modelo, int cantidadPasajeros, boolean cocheCama) {
		super(modelo, cantidadPasajeros);
		this.cocheCama = cocheCama;
	}

	public boolean isCocheCama() {
		return cocheCama;
	}
	
	@Override
	public boolean aceptoChofer(Chofer chofer) {
		return (chofer.getCategoria().isHabilitaColectivoLarga());
	}

	@Override
	public String toString() {
		return "Coche Cama:" + cocheCama + "\n";
	}
	
	
	
}
