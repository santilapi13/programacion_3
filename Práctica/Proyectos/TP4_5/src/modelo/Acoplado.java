package modelo;

public class Acoplado {
	
	private int tara;
	private int cargaMaxima;
	private boolean refrigerado;
	private int numeroAcoplado;
	private boolean enUso = false;
	
	public Acoplado(int tara, int cargaMaxima, boolean refrigerado, int numeroAcoplado) {
		super();
		this.tara = tara;
		this.cargaMaxima = cargaMaxima;
		this.refrigerado = refrigerado;
		this.numeroAcoplado = numeroAcoplado;
	}

	public boolean isEnUso() {
		return enUso;
	}
	public void setEnUso(boolean enUso) {
		this.enUso = enUso;
	}
	public int getTara() {
		return tara;
	}
	public int getCargaMaxima() {
		return cargaMaxima;
	}
	public boolean isRefrigerado() {
		return refrigerado;
	}
	public int getNumeroAcoplado() {
		return numeroAcoplado;
	}

	@Override
	public String toString() {
		return "Tara: " + tara + ", Carga Maxima: " + cargaMaxima + ", Refrigerado: " + refrigerado
				+ ", numeroAcoplado: " + numeroAcoplado;
	}

	

}
