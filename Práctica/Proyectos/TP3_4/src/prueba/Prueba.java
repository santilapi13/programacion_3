package prueba;

import modelo.Departamento;
import modelo.EmpPermExperto;
import modelo.EmpPermIntermedio;
import modelo.EmpPermPrincipiante;
import modelo.EmpleadoTemporario;

public class Prueba {

	public static void main(String[] args) {
		Departamento DM = new Departamento("Mantenimiento");
		Departamento DC = new Departamento("Contabilidad");
		
		DM.agregarEmpleado(new EmpPermIntermedio("Juan Perez","1234","Matheu 2343",12000,7));
		DM.agregarEmpleado(new EmpleadoTemporario("Julio Garcia","3209","Colon 5561",80,160));
		DM.agregarEmpleado(new EmpleadoTemporario("Martin Rodriguez","3210","Mitre 3451",70,100));
		
		DC.agregarEmpleado(new EmpPermExperto("Mara Anchorena","9876","Luro 3489",13000,18));
		DC.agregarEmpleado(new EmpPermPrincipiante("Sandra Fernandez","1276","Cordoba 3843",11500,6));
		DC.agregarEmpleado(new EmpPermPrincipiante("Luis Gomez","1544","Formosa 2354",10500,2));
		DC.agregarEmpleado(new EmpPermIntermedio("Lucas Benitez","1634","Castelli 4563",12000,12));
		
		System.out.println(DM);
		System.out.println(DC);
	}

}
