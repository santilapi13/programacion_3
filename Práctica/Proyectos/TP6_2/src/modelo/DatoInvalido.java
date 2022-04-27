package modelo;

public class DatoInvalido {

	private double extracSolicitada;
	private double saldo;
	
	public DatoInvalido(double extracSolicitada, double saldo) {
		this.extracSolicitada = extracSolicitada;
		this.saldo = saldo;
	}

	public double getExtracSolicitada() {
		return extracSolicitada;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
