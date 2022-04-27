package restaurante;

public class Restaurante
{

    private static Restaurante instance = null;
    private Mozo mozo = new Mozo();
    private Cocinero cocinero = new Cocinero();
    private boolean hayCafe = true;
    private boolean hayLeche = true;
    private boolean funcionaLaCocina = true;
    private boolean hayHamburguesas = true;
    private boolean hayPan = true;

    private Restaurante()
    {
    }

    public static Restaurante getInstance()
    {
	if (Restaurante.instance == null)
	    Restaurante.instance = new Restaurante();
	return instance;
    }

    public Mozo getMozo()
    {
	return mozo;
    }

    protected Cocinero getCocinero()
    {
	return cocinero;
    }

    public boolean isHayCafe()
    {
        return hayCafe;
    }

    public void setHayCafe(boolean hayCafe)
    {
        this.hayCafe = hayCafe;
    }

    public boolean isHayLeche()
    {
        return hayLeche;
    }

    public void setHayLeche(boolean hayLeche)
    {
        this.hayLeche = hayLeche;
    }

    public boolean isFuncionaLaCocina()
    {
        return funcionaLaCocina;
    }

    public void setFuncionaLaCocina(boolean funcionaLaCocina)
    {
        this.funcionaLaCocina = funcionaLaCocina;
    }

    public boolean isHayHamburguesas()
    {
        return hayHamburguesas;
    }

    public void setHayHamburguesas(boolean hayHamburguesas)
    {
        this.hayHamburguesas = hayHamburguesas;
    }

    public boolean isHayPan()
    {
        return hayPan;
    }

    public void setHayPan(boolean hayPan)
    {
        this.hayPan = hayPan;
    }

    public static void setInstance(Restaurante instance)
    {
        Restaurante.instance = instance;
    }

    public void setMozo(Mozo mozo)
    {
        this.mozo = mozo;
    }

    public void setCocinero(Cocinero cocinero)
    {
        this.cocinero = cocinero;
    }
    
    
    
    
    
    

}
