package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Mazo
{
	private static Mazo instance = null;

	private Mazo()
	{
	}

	public static Mazo getInstance()
	{
		if (instance == null)
			instance = new Mazo();
		return instance;
	}

	ArrayList<IPersonaje> cartas = new ArrayList<IPersonaje>();

	public void agregaCarta(IPersonaje carta)
	{
		this.cartas.add(carta);
	}

	public Iterator<IPersonaje> getIterator()
	{
		return this.cartas.iterator();
	}

}
