package modelo;

public class CajaAhorro extends Cuenta {
	private static int maxExtracMes = 10;
	private int extracAct;
	
	public CajaAhorro(String nombreTitular) {
		super(nombreTitular);
		this.extracAct = 0;
	}
	
	public void nuevoMes() {
		this.extracAct = 0;
	}

	@Override
	protected boolean validaExtraccion(double monto) {
		return this.extracAct < maxExtracMes && monto > 0 && super.saldo >= monto;
	}
	
	
	
}
