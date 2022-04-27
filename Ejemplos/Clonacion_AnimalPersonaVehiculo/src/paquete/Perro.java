package paquete;

public class Perro extends Animal
{
    private String raza;

    public Perro(String nombre, int esperanzaVida, String raza)
    {
        super(nombre, esperanzaVida);
        this.raza = raza;
        // TODO Auto-generated constructor stub
    }

    public void setRaza(String raza)
    {
        this.raza = raza;
    }

    public String getRaza()
    {
        return raza;
    }


    @Override
    public Object clone()
    {
        //La clase Perro SIEMPRE sera cloneable. Se elimino la propagacion de la excepcion
        //La Excepcion, si existiese, se trata dentro del metodo, el cual, en el peor de los casos
        // retornaria un objeto null. De todas formas, como los atributos de la clase son primitivos y String
        // esta metodo nunca entrara al bloque catch
        Object clon = null;
        try
        {
            clon = super.clone();
        } catch (CloneNotSupportedException e)
        {
            //NUNCA entraremos a este bloque
            e.printStackTrace();
        }
        return clon;
    }


    @Override
    public String toString()
    {
        // TODO Implement this method
        return "Perro"+super.toString() + " Raza: " + this.raza;
    }
}
