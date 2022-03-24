package modelo;

public class CajaAhorro extends Cuenta {
	private static int maxExtracMes = 10;
	private int extracAct;
	
	public CajaAhorro(String nombreTitular) {
		super(nombreTitular);
		this.extracAct = 0;
	}

	public void extraer(double monto) {
		if (this.extracAct < maxExtracMes && monto > 0 && super.saldo >= monto) {
			super.saldo -= monto;
			(this.extracAct)++;
		}
	}
	
	public void nuevoMes() {
		this.extracAct = 0;
	}
	
}
