package paquete;

public class DomicilioConDpto extends Domicilio
{private int piso;
	private char letra;
	// esta clase por extenderse de domicilio tambien es cloneable.
	// Como la clase Domicilio elimino la propagacion de la excepcion del metodo clone
	// resultaria imposible hacer a esta clase no cloneable. Esto romperia el principio de Liskov


	public DomicilioConDpto(String nombre, int numero,int piso,char letra)
	{
		super(nombre, numero);
		this.piso=piso;
		this.letra=letra;
		
	}


	public int getPiso()
	{
		return piso;
	}


	public void setPiso(int piso)
	{
		this.piso = piso;
	}


	public char getLetra()
	{
		return letra;
	}


	public void setLetra(char letra)
	{
		this.letra = letra;
	}


	@Override
	public String toString()
	{
		return super.toString()+"piso" + piso + ", letra=" + letra;
	}
	
	
	
	

}
