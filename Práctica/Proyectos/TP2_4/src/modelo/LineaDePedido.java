package modelo;

public class LineaDePedido {
	private Producto producto;
	private int cantidad;
	
	
	public LineaDePedido(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public int getCantidad() {
		return cantidad;
	}


	public double calculaCosto() {
		return this.producto.getPrecio() * cantidad;
	}
}
