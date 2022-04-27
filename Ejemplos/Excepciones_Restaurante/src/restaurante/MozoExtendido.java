package restaurante;

import excepciones.ImposiblePrepararPlatoException;
import paquete.Cafe;
import paquete.Plato;

public class MozoExtendido extends Mozo
{

	@Override
	public Plato traerPlato(String nombre)
	{
		Plato plato = new Cafe(60);
		try
		{
			plato = super.traerPlato(nombre);
		} catch (ImposiblePrepararPlatoException e)
		{

			System.out.println("El mozo Extendido dicidio que va a llevarle un Cafe y punto");
		}

		return plato;
	}

}
