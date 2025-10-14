package FicherosComandos;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String nombre;
	private List notas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List getNotas() {
		return notas;
	}

	public void setNotas(List notas) {
		this.notas = notas;
	}

	public Persona(String nombre, List notas) {
		super();
		this.nombre = nombre;
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", notas=" + notas + "]";
	}

}
