

public class ComEscritorio extends Dispositivo {
	private String targetaDevideo;
	private String fuente;
	private String chasis;
	private String clasePantalla;

	public ComEscritorio(String marca, int memoriaRam, int memoriaAlmacenamiento, String procesador, String modelo, String anoFabricacion, double precio, int cantidad, String targetaDevideo, String fuente, String chasis, String clasePantalla) {
		super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, anoFabricacion, precio, cantidad);
		this.targetaDevideo = targetaDevideo;
		this.fuente = fuente;
		this.chasis = chasis;
		this.clasePantalla = clasePantalla;
		//super.(marca,memoriaRam, int memoriaAlmacenamiento, String procesador, String modelo, String anoFabricacion, double precio, int cantidad);
	}

	public String getTargetaDevideo() {
		return this.targetaDevideo;
	}

	public void setTargetaDevideo(String aTargetaDevideo) {
		this.targetaDevideo = aTargetaDevideo;
	}

	public String getFuente() {
		return this.fuente;
	}

	public void setFuente(String aFuente) {
		this.fuente = aFuente;
	}

	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String aChasis) {
		this.chasis = aChasis;
	}

	public String getClasePantalla() {
		return this.clasePantalla;
	}

	public void setClasePantalla(String aClasePantalla) {
		this.clasePantalla = aClasePantalla;
	}

	@Override
	public String toString() {
		return "ComEscritorio{" +
				"targetaDevideo='" + targetaDevideo + '\'' +
				", fuente='" + fuente + '\'' +
				", chasis='" + chasis + '\'' +
				", clasePantalla='" + clasePantalla + '\'' +
				'}';
	}
}