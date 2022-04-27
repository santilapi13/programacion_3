package modelo;

public abstract class Deportista
{
	protected String nombre;

	public Deportista(String nombre)
	{
		super();
		this.nombre = nombre;
	}

	public void entrenar()
	{
		this.calentamientoPrevio();//Metodo concreto ya implemntado
		this.realizarEjericios(); //Este metodo es abstracto, lo tendre que implementar
		this.ejerciciosFinales(); //Metodo concreto ya implemntado funcionara como hook
		this.estiramiento();      //Metodo concreto ya implemntado
	}

	//Metodo que funcionara como hook
	protected void ejerciciosFinales()
	{
		System.out.println(this.nombre + " No realiza mas ejercicios");
	}

	protected  void calentamientoPrevio()
	{
		System.out.println(this.nombre + " realiza un trote suave durante 15 minutos");
	}

	protected  void estiramiento()
	{
		System.out.println(this.nombre + " estira todos los músculos durante 10 minutos\n\n");
	}
	//Metodo abstracto que se redefinira en las clases extendidas
	protected  abstract void realizarEjericios();

	

}
