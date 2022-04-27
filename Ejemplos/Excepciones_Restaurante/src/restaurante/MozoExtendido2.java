package restaurante;

import excepciones.CausaNoContempladaException;
import excepciones.ImposiblePrepararPlatoException;
import paquete.Hamburguesa;
import paquete.Plato;

public class MozoExtendido2 extends Mozo
{

	@Override
	public Plato traerPlato(String nombre) throws CausaNoContempladaException
	{
		Plato plato = new Hamburguesa(100); 
		if (!nombre.equals("Hamburguesa"))
			throw new CausaNoContempladaException("Causa no Contenplada");

		return plato;
	}

}
