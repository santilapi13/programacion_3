package paquete;

public abstract class Plato
{
private String nombre;
private double precio;



public Plato(String nombre, double precio)
{
    super();
    this.nombre = nombre;
    this.precio = precio;
}
public String getNombre()
{
    return nombre;
}
public double getPrecio()
{
    return precio;
}


@Override
public abstract String toString();



}
