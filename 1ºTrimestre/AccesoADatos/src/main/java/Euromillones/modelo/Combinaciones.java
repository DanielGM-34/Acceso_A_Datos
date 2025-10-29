package Euromillones.modelo;

import java.time.LocalDate;
import java.util.List;

public class Combinaciones {
	private String fecha;
	private List<Integer> combinaciones;
	private int estrella1;
	private int estrella2;

	public Combinaciones(String fecha, List<Integer> combinaciones, int estrella1, int estrella2) {
		super();
		this.fecha = fecha;
		this.combinaciones = combinaciones;
		this.estrella1 = estrella1;
		this.estrella2 = estrella2;
	}
	
	

	public Combinaciones() {
		super();
	}



	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public List<Integer> getCombinaciones() {
		return combinaciones;
	}

	public void setCombinaciones(List<Integer> combinaciones) {
		this.combinaciones = combinaciones;
	}

	public int getEstrella1() {
		return estrella1;
	}

	public void setEstrella1(int estrella1) {
		this.estrella1 = estrella1;
	}

	public int getEstrella2() {
		return estrella2;
	}

	public void setEstrella2(int estrella2) {
		this.estrella2 = estrella2;
	}

	@Override
	public String toString() {
		return "Combinaciones [fecha=" + fecha + ", combinaciones=" + combinaciones + ", estrella1=" + estrella1
				+ ", estrella2=" + estrella2 + "]";
	}

}
