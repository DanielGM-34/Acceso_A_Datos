package PaisesEjercicio;

public class Pais {
	private String nombre, continente;
	private int población;
	private String idioma, moneda;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public int getPoblación() {
		return población;
	}

	public void setPoblación(int población) {
		this.población = población;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public Pais(String nombre, String continente, int población, String idioma, String moneda) {
		super();
		this.nombre = nombre;
		this.continente = continente;
		this.población = población;
		this.idioma = idioma;
		this.moneda = moneda;
	}

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", continente=" + continente + ", población=" + población + ", idioma="
				+ idioma + ", moneda=" + moneda + "]";
	}

}
