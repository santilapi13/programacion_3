package modelo;

import java.util.ArrayList;

public class Pedido {
	private Proveedor proveedor;
	private String fecha;
	private ArrayList<LineaDePedido> lineasDePedido = new ArrayList<LineaDePedido>();
	
	// CONSTRUCTOR
	public Pedido(Proveedor proveedor, String fecha) {
		this.proveedor = proveedor;
		this.fecha = fecha;
	}
	
	// GETTERS Y SETTERS
	public Proveedor getProveedor() {
		return proveedor;
	}
	public String getFecha() {
		return fecha;
	}
	public ArrayList<LineaDePedido> getLineasDePedido() {
		return lineasDePedido;
	}
	
	//METODOS
	public void agregaLinea(LineaDePedido linea) {
		this.lineasDePedido.add(linea);
	}
	public double calculaCostoTotal() {
		int i;
		double total = 0;
		for(i=0;i<lineasDePedido.size();i++)
			total += lineasDePedido.get(i).calculaCosto();
		return total;
	}
	
}
