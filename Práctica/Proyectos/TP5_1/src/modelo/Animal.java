package modelo;

public abstract class Animal implements Emisor_De_Sonido{
	private String nombre;
	private int esperanzaDeVida;
	
	public Animal(String nombre, int esperanzaDeVida) {
		this.nombre = nombre;
		this.esperanzaDeVida = esperanzaDeVida;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getEsperanzaDeVida() {
		return esperanzaDeVida;
	}
	
	
	
}
