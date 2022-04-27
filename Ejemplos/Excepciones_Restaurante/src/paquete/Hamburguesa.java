package paquete;

public class Hamburguesa extends Plato
{

	public Hamburguesa(double precio)
	{
		super("Hamburguesa", precio);
	}

	@Override
	public String toString()
	{
		return "Carne de ternera exquisitamente picada y acompañada por ingredientes de primera calidad, un aquelarre de sensaciones";
	}

}
