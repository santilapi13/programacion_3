package excepciones;

public class FaltaIngredienteException extends ImposiblePrepararPlatoException
{
private String ingredienteFaltante;

    public FaltaIngredienteException(String arg0,String ingredienteFaltante)
    {
	super(arg0);
	this.ingredienteFaltante=ingredienteFaltante;
	
    }
    
    public String getIngredienteFaltante()
    {
        return ingredienteFaltante;
    }
      
    
    
}
