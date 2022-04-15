package modelo;

public class Mazo {
	
	private static Mazo instance = null;

	private Mazo() {
	}
	
	public static Mazo getInstance() {
		if (instance == null)
			instance = new Mazo();
		return instance;
	}
}
