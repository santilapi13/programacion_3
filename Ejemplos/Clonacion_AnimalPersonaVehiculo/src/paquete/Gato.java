package paquete;

public class Gato extends Animal
{

    public Gato(String nombre, int esperanzaVida)
    {
        super(nombre, esperanzaVida);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        // Esta clase SIEMPRE lanza una excepcion, los gatos no ser�n cloneables
        throw new CloneNotSupportedException();
    }

	@Override
	public String toString()
	{
		return "Gato "+super.toString();
	}
    
    
    

}
