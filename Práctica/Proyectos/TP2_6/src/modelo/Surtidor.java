package modelo;

public class Surtidor {
	private static int maximaCarga = 20000;
	private int gasoilVendido;
	private int gasoilVentas;
	private int premiumVendido;
	private int premiumVentas;
	private int superVendido;
	private int superVentas;
	private int cantGasoil;
	private int cantPremium;
	private int cantSuper;
	private int id;
	private static int sigId = 0;
	
	public Surtidor() {
		this.cantGasoil = maximaCarga;
		this.cantPremium = maximaCarga;
		this.cantSuper = maximaCarga;
		this.gasoilVendido = 0;
		this.premiumVendido = 0;
		this.superVendido = 0;
		this.gasoilVentas = 0;
		this.premiumVentas = 0;
		this.superVentas = 0;
		this.id = sigId;
		sigId++;
	}
	
	public int getId() {
		return id;
	}
	
	public int getGasoilVendido() {
		return gasoilVendido;
	}

	public int getGasoilVentas() {
		return gasoilVentas;
	}

	public int getPremiumVendido() {
		return premiumVendido;
	}

	public int getPremiumVentas() {
		return premiumVentas;
	}

	public int getSuperVendido() {
		return superVendido;
	}

	public int getSuperVentas() {
		return superVentas;
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
		this.gasoilVentas += 1;
		if (this.cantGasoil >= litros) {
			this.cantGasoil -= litros;
			this.gasoilVendido += litros;
			return true;
		} else {
			this.gasoilVendido += this.cantGasoil;
			this.cantGasoil = 0;
			return false;
		}
	}
	
	public boolean extraerSuper(int litros) {
		this.superVentas += 1;
		if (this.cantSuper >= litros) {
			this.cantSuper -= litros;
			this.superVendido += litros;
			return true;
		} else {
			this.superVendido += this.cantSuper;
			this.cantSuper = 0;
			return false;
		}
	}
	
	public boolean extraerPremium(int litros) {
		this.premiumVentas += 1;
		if (this.cantPremium >= litros) {
			this.cantPremium -= litros;
			this.premiumVendido += litros;
			return true;
		} else {
			this.premiumVendido += this.cantPremium;
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

	@Override
	public String toString() {
		return "Surtidor " + id;
	}
	
}
