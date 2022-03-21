package prueba;

import modelo.Estacion;

public class Prueba {

	public static void main(String[] args) {
		Estacion estacion = Estacion.getInstance();
		
		estacion.creaSurtidor();
		estacion.creaSurtidor();
		
		System.out.println("Cant de surtidores: " + estacion.cantSurtidores());
		
		System.out.println("*****************************");
		
		System.out.println(estacion.getSurtidores().get(1).extraerGasoil(25000));
		System.out.println(estacion.getSurtidores().get(0).extraerSuper(5000));
		System.out.println(estacion.getSurtidores().get(0).extraerSuper(3000));
		System.out.println(estacion.getSurtidores().get(1).extraerPremium(10000));
		System.out.println(estacion.getSurtidores().get(0).extraerPremium(8000));
		System.out.println(estacion.getSurtidores().get(0).extraerSuper(1000));
		System.out.println(estacion.getSurtidores().get(1).extraerSuper(5000));
		System.out.println(estacion.getSurtidores().get(1).extraerPremium(10000));
		
		System.out.println("*****************************");
		
		System.out.println("Existencia de Gasoil: " + estacion.existCombustible('G'));
		System.out.println("Existencia de Premium: " + estacion.existCombustible('p'));
		System.out.println("Existencia de Super: " + estacion.existCombustible('S'));
		System.out.println("Error?: " + estacion.existCombustible('a'));
		
		System.out.println("*****************************");

		System.out.println("Surtidor q' vendio Gasoil mas veces: " + estacion.surtMasVentas('G'));
		System.out.println("Surtidor q' vendio Premium mas veces: " + estacion.surtMasVentas('P'));
		System.out.println("Surtidor q' vendio Super mas veces: " + estacion.surtMasVentas('S'));
		System.out.println("Error: " + estacion.surtMasVentas('a'));
		
		System.out.println("*****************************");
		
		System.out.println("Historico Gasoil vendido: " + estacion.historicoComb('G', null));
		System.out.println("Historico Super vendido: " + estacion.historicoComb('s', null));
		System.out.println("Historico Premium vendido: " + estacion.historicoComb('p', null));
		
		System.out.println("*****************************");
		
		System.out.println("Historico Gasoil vendido surtidor 0: " + estacion.historicoComb('G', estacion.getSurtidores().get(0)));
		System.out.println("Historico Super vendido surtidor 0: " + estacion.historicoComb('s', estacion.getSurtidores().get(0)));
		System.out.println("Historico Premium vendido surtidor 0: " + estacion.historicoComb('p', estacion.getSurtidores().get(0)));
		System.out.println("Historico Gasoil vendido surtidor 1: " + estacion.historicoComb('G', estacion.getSurtidores().get(1)));
		System.out.println("Historico Super vendido surtidor 1: " + estacion.historicoComb('s', estacion.getSurtidores().get(1)));
		System.out.println("Historico Premium vendido surtidor 1: " + estacion.historicoComb('p', estacion.getSurtidores().get(1)));
	}

}
