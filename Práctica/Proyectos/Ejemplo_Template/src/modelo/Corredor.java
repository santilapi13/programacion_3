package modelo;

public class Corredor extends Deportista
{

	

	public Corredor(String nombre)
	{
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void realizarEjericios()
	{
		System.out.println(this.nombre+" Corre intensamente durante 10km");
		
	}

}
