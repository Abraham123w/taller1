

public class Notebook extends Dispositivo {
	private String resolucionPantalla;
	private String accesorios;

	public Notebook(String marca, int memoriaRam, int memoriaAlmacenamiento, String procesador, String modelo, String anoFabricacion, double precio, int cantidad, String resolucionPantalla, String accesorios) {
		super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, anoFabricacion, precio, cantidad);
		this.resolucionPantalla = resolucionPantalla;
		this.accesorios = accesorios;
	}

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String aResolucionPantalla) {
		this.resolucionPantalla = aResolucionPantalla;
	}

	public String getAccesorios() {
		return this.accesorios;
	}

	public void setAccesorios(String aAccesorios) {
		this.accesorios = aAccesorios;
	}
}