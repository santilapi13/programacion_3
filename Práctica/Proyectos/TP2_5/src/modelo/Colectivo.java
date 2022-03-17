package modelo;

public class Colectivo {
	private String modelo;
	private int numeroInterno;
	private static int cantColectivos = 0;
	
	public Colectivo(String modelo,int numeroInterno) {
		this.modelo = modelo;
		this.numeroInterno = numeroInterno;
		cantColectivos++;
	}

	public String getModelo() {
		return modelo;
	}

	public static int getCantColectivos() {
		return cantColectivos;
	}

	public int getNumeroInterno() {
		return numeroInterno;
	}

	@Override
	public String toString() {
		return "[modelo=" + modelo + ", numeroInterno=" + numeroInterno + "]";
	}
	
	
}
