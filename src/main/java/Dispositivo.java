

public abstract class Dispositivo {
	private String marca;
	private int memoriaRam;
	private int memoriaAlmacenamiento;
	private String procesador;
	private String modelo;
	private String anoFabricacion;
	private double precio;
	private int cantidad;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String aMarca) {
		this.marca = aMarca;
	}

	public int getMemoriaRam() {
		return this.memoriaRam;
	}

	public void setMemoriaRam(int aMemoriaRam) {
		this.memoriaRam = aMemoriaRam;
	}

	public int getMemoriaAlmacenamiento() {
		return this.memoriaAlmacenamiento;
	}

	public void setMemoriaAlmacenamiento(int aMemoriaAlmacenamiento) {
		this.memoriaAlmacenamiento = aMemoriaAlmacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public void setProcesador(String aProcesador) {
		this.procesador = aProcesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String aModelo) {
		this.modelo = aModelo;
	}

	public String getAnoFabricacion() {
		return this.anoFabricacion;
	}

	public void setAnoFabricacion(String aAnoFabricacion) {
		this.anoFabricacion = aAnoFabricacion;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double aPrecio) {
		this.precio = aPrecio;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int aCantidad) {
		this.cantidad = aCantidad;
	}
}