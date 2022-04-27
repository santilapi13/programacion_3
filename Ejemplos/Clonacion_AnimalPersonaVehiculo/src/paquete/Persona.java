package paquete;

public class Persona implements Cloneable
{
	private String nombre;
	int dni;
	private Domicilio domicilio;
	private Animal mascota;
	
	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getDni()
	{
		return dni;
	}

	public void setDni(int dni)
	{
		this.dni = dni;
	}

	public Domicilio getDomicilio()
	{
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio)
	{
		this.domicilio = domicilio;
	}

	



	@Override
	public String toString()
	{
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", domicilio=" + domicilio + ", mascota=" + mascota + "]";
	}

	public Persona(String nombre, int dni, Domicilio domicilio, Animal mascota)
	{
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.domicilio = domicilio;
		this.mascota = mascota;
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Persona personaClonada = null;
		personaClonada = (Persona) super.clone();
		
		
		if(this.domicilio!=null)personaClonada.domicilio = (Domicilio) this.domicilio.clone();
		if(this.mascota!=null)personaClonada.mascota = (Animal) this.mascota.clone();
		
		
		return personaClonada;
	}

	

	
	  public Animal getMascota() { return mascota; }
	  
	  public void setMascota(Animal mascota) { this.mascota = mascota; }
	 

}
