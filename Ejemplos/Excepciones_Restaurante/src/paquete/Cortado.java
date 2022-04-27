package paquete;

public class Cortado extends Plato
{

	public Cortado(double precio)
	{
		super("Cortado", precio);
	}

	@Override
	public String toString()
	{
		return "A la intensidad y elegancia de nuestros granos de cafe finamente seleccionados se suma el contraste de un delicado touch de leche fresca y espumosa.";
	}

}
