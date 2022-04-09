package modelo;

public class Nadador extends Deportista
{

	public Nadador(String nombre)
	{
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected  void realizarEjericios()
	{
		System.out.println(this.nombre+" Nada a ritmo intenso durante 1 hora 30 minutos");
	
	}

	

}
