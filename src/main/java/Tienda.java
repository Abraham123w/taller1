import java.util.ArrayList;




public class Tienda {
	private String direccion;
	public ArrayList<Dispositivo> dispositivos = new ArrayList<Dispositivo>();
	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public ArrayList<Compra> compras = new ArrayList<Compra>();

	public Tienda(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String aDireccion) {
		this.direccion = aDireccion;
	}

	public void generarVentaActStock() {
		throw new UnsupportedOperationException();
	}

	public void imprimirTiposDeDispositivosAtribu() {
		throw new UnsupportedOperationException();
	}
	public void agregarDispositivo(Dispositivo dispositivo) {
		dispositivos.add(dispositivo);
	}
	public void agregarVenta(Compra venta) {
		compras.add(venta);
	}



}