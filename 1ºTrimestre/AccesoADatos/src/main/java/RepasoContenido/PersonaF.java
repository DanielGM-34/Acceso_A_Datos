package RepasoContenido;

import java.util.List;

public class PersonaF {
	private String nombre;
	private List<Integer> notas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Integer> getNotas() {
		return notas;
	}

	public void setNotas(List<Integer> notas) {
		this.notas = notas;
	}

	public PersonaF(String nombre, List<Integer> notas) {
		super();
		this.nombre = nombre;
		this.notas = notas;
	}

}
