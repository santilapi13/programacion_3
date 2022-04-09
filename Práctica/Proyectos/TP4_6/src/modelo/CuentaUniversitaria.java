package modelo;

public class CuentaUniversitaria extends Cuenta {
	private static double maxMontoDia = 1000;
	private double montoAct;

	public CuentaUniversitaria(String nombreTitular) {
		super(nombreTitular);
		this.montoAct = 0;
	}
	
	public void nuevoDia() {
		this.montoAct = 0;
	}

	@Override
	protected boolean validaExtraccion(double monto) {
		return monto+montoAct <= maxMontoDia && monto >= 0 && super.saldo >= monto;
	}

	
	
}
