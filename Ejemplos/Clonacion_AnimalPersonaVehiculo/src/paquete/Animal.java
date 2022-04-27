package paquete;

public class Animal implements Cloneable
{
    private String nombre;
    private int esperanzaVida;

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEsperanzaVida()
    {
        return esperanzaVida;
    }

    public void setEsperanzaVida(int esperanzaVida)
    {
        this.esperanzaVida = esperanzaVida;
    }

    public Animal(String nombre, int esperanzaVida)
    {
        super();
        this.nombre = nombre;
        this.esperanzaVida = esperanzaVida;
    }


    @Override
    public Object clone() throws CloneNotSupportedException
    {
        //La clase Animal conserva la propagacion de la excepcion, ya que
        //no sabemos si las clases hijas seran o no cloneables
        //El unico objeto de sobreescribir este metodo es hacerlo publico
        return super.clone();
    }

    @Override
    public String toString()
    {
        return " [nombre=" + nombre + ", esperanzaVida=" + esperanzaVida + "]";
    }


}
