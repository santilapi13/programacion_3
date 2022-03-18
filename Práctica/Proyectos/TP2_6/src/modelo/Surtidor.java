package modelo;

public class Surtidor {
	private static int maximaCarga = 20000;
	private int cantGasoil;
	private int cantPremium;
	private int cantSuper;
	
	public Surtidor() {
		this.cantGasoil = maximaCarga;
		this.cantPremium = maximaCarga;
		this.cantSuper = maximaCarga;
	}

	public int getCantGasoil() {
		return cantGasoil;
	}
	public int getCantPremium() {
		return cantPremium;
	}
	public int getCantSuper() {
		return cantSuper;
	}
	
	public boolean extraerGasoil(int litros) {
		if (this.cantGasoil >= litros) {
			this.cantGasoil -= litros;
			return true;
		} else {
			this.cantGasoil = 0;
			return false;
		}
	}
	
	public boolean extraerSuper(int litros) {
		if (this.cantSuper >= litros) {
			this.cantSuper -= litros;
			return true;
		} else {
			this.cantSuper = 0;
			return false;
		}
	}
	
	public boolean extraerPremium(int litros) {
		if (this.cantPremium >= litros) {
			this.cantPremium -= litros;
			return true;
		} else {
			this.cantPremium = 0;
			return false;
		}
	}
	
	public void llenarDepositoGasoil() {
		this.cantGasoil = maximaCarga;
	}
	public void llenarDepositoSuper() {
		this.cantSuper = maximaCarga;
	}
	public void llenarDepositoPremium() {
		this.cantPremium = maximaCarga;
	}
	
}
