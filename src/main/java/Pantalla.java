

public class Pantalla extends Dispositivo {
	private String marca;
	private String modelo;
	private String ano;

	public Pantalla(String marca, int memoriaRam, int memoriaAlmacenamiento, String procesador, String modelo, String anoFabricacion, double precio, int cantidad, String marca1, String modelo1, String ano) {
		super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, anoFabricacion, precio, cantidad);
		this.marca = marca1;
		this.modelo = modelo1;
		this.ano = ano;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String aMarca) {
		this.marca = aMarca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String aModelo) {
		this.modelo = aModelo;
	}

	public String getAno() {
		return this.ano;
	}

	public void setAno(String aAno) {
		this.ano = aAno;
	}
}