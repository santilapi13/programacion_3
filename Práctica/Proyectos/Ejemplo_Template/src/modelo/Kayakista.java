package modelo;

public class Kayakista extends Deportista
{
	private boolean realizaAblande;

	public Kayakista(String nombre, boolean realizaAblande)
	{
		super(nombre);
		this.realizaAblande = realizaAblande;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected  void realizarEjericios()
	{
		System.out.println(this.nombre + " Rema intensamente durante 1 hora ");
	}

	@Override
	protected  void ejerciciosFinales()
	{
		if (this.realizaAblande)
			System.out.println(
					this.nombre + " Rema a maxima velocidad 3 minutos y luego Rema suavemente durante 5 minutos");
		else
			super.ejerciciosFinales();
	}

}
