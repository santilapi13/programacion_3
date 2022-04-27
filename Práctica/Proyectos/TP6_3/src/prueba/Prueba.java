package prueba;

import excepciones.CargaInvalidaException;
import excepciones.FaltaCombustibleException;
import excepciones.TipoCombustibleInvalidoException;
import modelo.Surtidor;

public class Prueba {

	public static void main(String[] args) {
		Surtidor s = new Surtidor();
		try {
			s.cargarCombustible("diesel", 2000);
			s.cargarCombustible("superr", 500);
			s.cargarCombustible("super", -4);
			s.cargarCombustible("premium", 21000);
			System.out.println("Carga con exito");
		} catch(TipoCombustibleInvalidoException e) {
			System.out.println(e.getMessage());
		} catch(FaltaCombustibleException e) {
			System.out.println(e.getMessage());
		} catch (CargaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
