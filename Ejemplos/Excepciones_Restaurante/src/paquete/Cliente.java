package paquete;

import excepciones.FaltaIngredienteException;
import excepciones.ImposiblePrepararPlatoException;
import excepciones.NoFuncionaLaCocinaException;
import restaurante.Mozo;
import restaurante.Restaurante;

public class Cliente
{

	public void hacerPedido(String nombre)
	{

		Plato plato = null;
		Mozo mozo = Restaurante.getInstance().getMozo();

		try
		{
			plato = mozo.traerPlato(nombre);
		}

		catch (NoFuncionaLaCocinaException e)
		{
			System.out.println("Pienso en pedir un pato frio");
		} catch (FaltaIngredienteException e)
		{
			System.out.println("Faltan ingredientes!!!!");

			String ingredienteFaltante = e.getIngredienteFaltante();

			System.out.println("El ingrediente que falta es: " + ingredienteFaltante);
		} catch (ImposiblePrepararPlatoException e)
		{
			System.out.println("Debo pensar un plato que conozca el cocinero");
		}
		if (plato != null)
			System.out.println("Disfrutando de mi plato: " + plato.toString());
	}

}
