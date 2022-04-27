package paquete;

public class Cafe extends Plato
{

	public Cafe(double precio)
	{
		super("Cafe", precio);
	}

	@Override
	public String toString()
	{
		return "Un clasico de nuestra casa, para disfrutar de la intensidad y elegancia de nuestros granos de cafe finamente seleccionados. Una verdadera sinfonia de sabores en su paladar";
	}

}
