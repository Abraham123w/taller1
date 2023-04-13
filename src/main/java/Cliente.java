

public class Cliente {
	private String nombre;
	private String correo;
	private int numeroTel;
	private String estadoCivil;
	private String ciudad;

	public Cliente(String nombre, String correo, int numeroTel, String estadoCivil, String ciudad) {
		this.nombre = nombre;
		this.correo = correo;
		this.numeroTel = numeroTel;
		this.estadoCivil = estadoCivil;
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String aNombre) {
		this.nombre = aNombre;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String aCorreo) {
		this.correo = aCorreo;
	}

	public int getNumeroTel() {
		return this.numeroTel;
	}

	public void setNumeroTel(int aNumeroTel) {
		this.numeroTel = aNumeroTel;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String aEstadoCivil) {
		this.estadoCivil = aEstadoCivil;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String aCiudad) {
		this.ciudad = aCiudad;
	}

	public void buscarDispositivoPorMarca() {
		throw new UnsupportedOperationException();
	}

	public void buscarDispositivoPorModelo() {
		throw new UnsupportedOperationException();
	}

	public void buscarDispositivoPorTipo() {
		throw new UnsupportedOperationException();
	}
}