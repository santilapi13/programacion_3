package modelo;

import java.util.ArrayList;

public class Empresa {
	
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private ArrayList<Acoplado> acoplados = new ArrayList<Acoplado>();
	private ArrayList<Chofer> choferes = new ArrayList<Chofer>();
	private static Empresa instance = null;

	private Empresa() {
	}
	
	public static Empresa getInstance() {
		if (instance == null)
			instance = new Empresa();
		return instance;
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	public ArrayList<Acoplado> getAcoplados() {
		return acoplados;
	}
	public ArrayList<Chofer> getChoferes() {
		return choferes;
	}

	public void addVehiculo(Vehiculo vehiculo) {
		this.vehiculos.add(vehiculo);
	}
	
	public void addAcoplado(Acoplado acoplado) {
		int i=0;
		Acoplado acopladoAct = this.acoplados.get(0);
		while (i < this.acoplados.size() && acoplado.getNumeroAcoplado() != acopladoAct.getNumeroAcoplado()) {
			i++;
			acopladoAct = this.acoplados.get(i);
			if (i >= this.acoplados.size())	// Verifica que su numero sea unico
				acoplados.add(acoplado);
		}
	}
	
	public void addChofer(Chofer chofer) {
		int i=0;
		Chofer choferAct = this.choferes.get(0);
		if(chofer.getCategoria().getNombreCategoria() == "Categoria 1" || chofer.getCategoria().getNombreCategoria() == "Categoria 2" || chofer.getCategoria().getNombreCategoria() == "Categoria 3" || chofer.getCategoria().getNombreCategoria() == "Categoria 4") {
			while (i < this.choferes.size() && chofer.getDomicilio() != choferAct.getDomicilio()) {
				i++;
				choferAct = this.choferes.get(i);
			}
			if (i >= this.choferes.size())	// Verifica que su domicilio sea unico
				choferes.add(chofer);
		}
	}
	
	public void asignaVehiculo(Chofer chofer,Vehiculo vehiculo) {
		int i=0;
		Chofer choferAct;
		Vehiculo vehiculoAct;
		if (vehiculo.aceptoChofer(chofer)) {	// Si la categoria lo permite
			vehiculoAct = this.vehiculos.get(i);
			while (i < this.vehiculos.size() && vehiculo != vehiculoAct) {
				i++;
				vehiculoAct = this.vehiculos.get(i);
			}
			if (i < this.vehiculos.size() && vehiculo == vehiculoAct) {		// Si el vehiculo existe
				if (chofer.getVehiculoAsignado() != null)
					desasignaVehiculo(chofer);
				choferAct = this.choferes.get(i);
				i = 0;
				while (i < this.choferes.size() && chofer.getVehiculoAsignado() != choferAct.getVehiculoAsignado()) {
					i++;
					choferAct = this.choferes.get(i);
				}
				if (i >= this.choferes.size())	// Si el vehiculo no está asignado ya
					chofer.setVehiculoAsignado(vehiculo);
			}
		}
	}
	
	public void desasignaVehiculo(Chofer chofer) {
		chofer.setVehiculoAsignado(null);
	}
	
	public void asignaAcoplado(Camion camion, Acoplado acoplado) {
		if (acoplado != null && !acoplado.isEnUso()) {
			if (camion.getAcoplado() != null)
				desasignaAcoplado(camion);
			camion.setAcoplado(acoplado);
			acoplado.setEnUso(true);
		}
	}
	
	public void desasignaAcoplado(Camion camion) {
		camion.getAcoplado().setEnUso(false); 
		camion.setAcoplado(null);
	}
	
	public int getCantidadVehiculos() {
		return this.vehiculos.size();
	}
	
	public int getCantidadAcoplados() {
		return this.acoplados.size();
	}
	
	/*
	 * 1. recorrer ArrayList choferes e ir contando si categoria del chofer actual == categoria pasada por parametro
	 * 2.recorrer ArrayList choferes e ir contando si vehiculoAsignado == null
	 */
	
}
	