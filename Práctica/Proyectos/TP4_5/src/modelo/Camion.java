package modelo;

public class Camion extends Vehiculo {
	
	private double tara;
	private double cargaMaxima;
	private Acoplado acoplado = null;
	
	public Camion(String modelo,double tara,double cargaMaxima) {
		super(modelo);
		this.tara = tara;
		this.cargaMaxima = cargaMaxima;
	}

	public Acoplado getAcoplado() {
		return acoplado;
	}
	public void setAcoplado(Acoplado acoplado) {
		this.acoplado = acoplado;
	}
	public double getTara() {
		return tara;
	}
	public double getCargaMaxima() {
		return cargaMaxima;
	}

	@Override
	public boolean aceptoChofer(Chofer chofer) {
		return (chofer.getCategoria().isHabilitaCamion());
	}

	@Override
	public String toString() {
		return "Tara: " + tara + "\nCarga Maxima: " + cargaMaxima + "\nAcoplado: " + acoplado + "\n";
	}
	
	

}
