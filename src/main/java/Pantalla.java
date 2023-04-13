

public class Pantalla extends Dispositivo {
	private String marca;
	private String modelo;
	private String ano;

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