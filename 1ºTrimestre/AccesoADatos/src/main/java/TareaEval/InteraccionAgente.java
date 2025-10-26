package TareaEval;

import java.util.Objects;

import Boletin1Modelo.TipoAgente;

public class InteraccionAgente implements Comparable<InteraccionAgente> {
	private static int contador;
	private int identificador;
	private TipoAgente tipo;
	private String peticion;
	private String respuesta;
	private double tiempoEjecucion; 
	private double numValoracionesPositivas;
	private double porcentajeAcierto;

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		InteraccionAgente.contador = contador;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public TipoAgente getTipo() {
		return tipo;
	}

	public void setTipo(TipoAgente tipo) {
		this.tipo = tipo;
	}

	public String getPeticion() {
		return peticion;
	}

	public void setPeticion(String peticion) {
		this.peticion = peticion;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public double getTiempoEjecucion() {
		return tiempoEjecucion;
	}

	public void setTiempoEjecucion(double tiempoEjecucion) {
		this.tiempoEjecucion = tiempoEjecucion;
	}

	public double getNumValoracionesPositivas() {
		return numValoracionesPositivas;
	} 

	public void setNumValoracionesPositivas(double nuevaValoracion) {
		this.numValoracionesPositivas = nuevaValoracion;
	}

	public double getPorcentajeAcierto() {
		return porcentajeAcierto;
	}

	public void setPorcentajeAcierto(double porcentajeAcierto) {
		this.porcentajeAcierto = porcentajeAcierto;
	}

	public InteraccionAgente() {

		super();
		this.identificador = calculaIdentificador();

	}

	public InteraccionAgente(String peticion, String respuesta) {
		super();
		this.identificador = calculaIdentificador();
		this.peticion = peticion;
		this.respuesta = respuesta;
	}

	public InteraccionAgente(TipoAgente tipo, String peticion, String respuesta, double tiempoEjecucion,
			int numValoracionesPositivas, double porcentajeAcierto) {
		super();
		this.identificador = calculaIdentificador();
		this.tipo = tipo;
		this.peticion = peticion;
		this.respuesta = respuesta;
		this.tiempoEjecucion = tiempoEjecucion;
		this.numValoracionesPositivas = numValoracionesPositivas;
		this.porcentajeAcierto = porcentajeAcierto;
	}

	public int calculaIdentificador() {
		return contador++;
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

	@Override
	public String toString() {
		return "InteraccionAgente [identificador=" + identificador + ", tipo=" + tipo + ", peticion=" + peticion
				+ ", respuesta=" + respuesta + ", tiempoEjecucion=" + tiempoEjecucion + ", numValoracionesPositivas="
				+ numValoracionesPositivas + ", porcentajeAcierto=" + porcentajeAcierto + "]";
	}

	@Override
	public int compareTo(InteraccionAgente o) {
	    return Double.compare(this.porcentajeAcierto, o.porcentajeAcierto);
	}

	
	

}
