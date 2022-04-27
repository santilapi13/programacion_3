package restaurante;

import excepciones.FaltaIngredienteException;
import excepciones.ImposiblePrepararPlatoException;
import excepciones.NoFuncionaLaCocinaException;
import paquete.Cafe;
import paquete.Cortado;
import paquete.Hamburguesa;
import paquete.Plato;

public class Cocinero
{

	public Plato prepararPlato(String nombre) throws ImposiblePrepararPlatoException
	{
		Plato plato = null;
		if (Restaurante.getInstance().isFuncionaLaCocina())
		{
			if (nombre.equalsIgnoreCase("Cafe"))
			{
				if (Restaurante.getInstance().isHayCafe())
					plato = new Cafe(60);
				else
					throw new FaltaIngredienteException("Falta Cafe", "Cafe");
			}
			else if (nombre.equalsIgnoreCase("Cortado"))
			{
				if (Restaurante.getInstance().isHayCafe())
				{
					if (Restaurante.getInstance().isHayLeche())
						plato = new Cortado(65);
					else
						throw new FaltaIngredienteException("Falta Leche", "Leche");
				} else
					throw new FaltaIngredienteException("Falta Cafe", "Cafe");
			}

			else if (nombre.equalsIgnoreCase("Hamburguesa"))
			{
				if (Restaurante.getInstance().isHayHamburguesas())
				{
					if (Restaurante.getInstance().isHayPan())
						plato = new Hamburguesa(200);
					else
						throw new FaltaIngredienteException("Falta Pan", "Pan");
				} else
					throw new FaltaIngredienteException("Falta Haburguesas", "Hamburguesa");

			}
			else {
				throw new ImposiblePrepararPlatoException("Plato pedido desconocido");
			}
	
		}
		else
		{
			throw new NoFuncionaLaCocinaException("No funciona la cocina");
		}
		return plato;
	}
}