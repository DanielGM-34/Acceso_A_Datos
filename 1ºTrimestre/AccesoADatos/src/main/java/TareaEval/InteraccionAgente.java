package TareaEval;

import java.util.Objects;

import Boletin1Modelo.TipoAgente;

public class InteraccionAgente {
	private String identificador;
	private TipoAgente tipo;
	private String peticion;
	private String respuesta;
	private double tiempoEjecucion;
	private int numValoracionesPositivas;
	private double porcentajeAcierto;

	@Override
	public String toString() {
		return "IntereccionAgente [identificador=" + identificador + ", tipo=" + tipo + ", peticion=" + peticion
				+ ", respuesta=" + respuesta + ", tiempoEjecucion=" + tiempoEjecucion + ", numValoracionesPositivas="
				+ numValoracionesPositivas + ", porcentajeAcierto=" + porcentajeAcierto + "]";
	}

	public InteraccionAgente() {
		super();
	}
 
	public InteraccionAgente(String peticion, String respuesta) {
		super();
		this.peticion = peticion;
		this.respuesta = respuesta;
	}

	public InteraccionAgente(TipoAgente tipo, String peticion, String respuesta, double tiempoEjecucion,
			int numValoracionesPositivas, double porcentajeAcierto) {
		super();
		this.tipo = tipo;
		this.peticion = peticion;
		this.respuesta = respuesta;
		this.tiempoEjecucion = tiempoEjecucion;
		this.numValoracionesPositivas = numValoracionesPositivas;
		this.porcentajeAcierto = porcentajeAcierto;
	}

	public String calculaIdentificador() {
		return null;
	}

	@Override
	public int hashCode() {
		return Objects.hash(identificador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InteraccionAgente other = (InteraccionAgente) obj;
		return Objects.equals(identificador, other.identificador);
	}
	
	

}
