package paquete;

public class Domicilio implements Cloneable
{
    private String nombre;
    private int numero;

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public Domicilio(String nombre, int numero)
    {
  
        this.nombre = nombre;
        this.numero = numero;
    }

    @Override
    public String toString()
    {
        return "Domicilio [nombre=" + nombre + ", numero=" + numero + "]";
    }

	@Override
	public Object clone() 
	{
		
		//La clase Domicilio SIEMPRE sera cloneable. Se elimino la propagacion de la excepcion
        //La Excepcion, si existiese, se trata dentro del metodo, el cual, en el peor de los casos
        // retornaria un objeto null. De todas formas, como los atributos de la clase son primitivos y String
        // esta metodo nunca entrara al bloque catch

		Object clonado=null;
		
		try
		{
			clonado=super.clone();
		} catch (CloneNotSupportedException e)
		{
			//ESTE BLOQUE NO SE EJECUTA JAMAS
			e.printStackTrace();
		}
		return clonado;
	}
  

}
