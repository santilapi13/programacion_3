package modelo;

public abstract class Vehiculo {
	
	private String modelo;
	
	public Vehiculo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}

	public abstract boolean aceptoChofer(Chofer chofer);

	@Override
	public String toString() {
		return "Modelo: " + modelo + "\n";
	}
	
	

}
