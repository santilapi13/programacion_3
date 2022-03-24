package modelo;

public class CuentaUniversitaria extends Cuenta {
	private static double maxMontoDia = 1000;
	private double montoAct;

	public CuentaUniversitaria(String nombreTitular) {
		super(nombreTitular);
		this.montoAct = 0;
	}

	public void extraer(double monto) {
		if (monto+montoAct <= maxMontoDia && monto >= 0 && super.saldo >= monto) {
			super.saldo -= monto;
			this.montoAct += monto;
		}
	}
	
	public void nuevoDia() {
		this.montoAct = 0;
	}

}
