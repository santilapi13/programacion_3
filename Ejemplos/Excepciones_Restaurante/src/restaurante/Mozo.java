package restaurante;

import excepciones.FaltaIngredienteException;
import excepciones.ImposiblePrepararPlatoException;
import excepciones.NoFuncionaLaCocinaException;
import paquete.Plato;

public class Mozo
{
   public Plato traerPlato(String nombre) throws ImposiblePrepararPlatoException
    {
	Cocinero cocinero = Restaurante.getInstance().getCocinero();
	
	Plato plato = null;
	plato = cocinero.prepararPlato(nombre);
	
	System.out.println("El Mozo lleva el pedido");
	
	return plato;
    }

}
