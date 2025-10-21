package FicherosComandosUtiles;

public class Pais {
	private String nombre, Continente, Poblacion, Idioma;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContinente() {
		return Continente;
	}

	public void setContinente(String continente) {
		Continente = continente;
	}

	public String getPoblacion() {
		return Poblacion;
	}
 
	public void setPoblacion(String poblacion) {
		Poblacion = poblacion;
	}

	public String getIdioma() {
		return Idioma;
	}

	public void setIdioma(String idioma) {
		Idioma = idioma;
	}

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", Continente=" + Continente + ", Poblacion=" + Poblacion + ", Idioma="
				+ Idioma + "]";
	}
	
	
	
}
