package TareaEval;

import java.util.*;

import Boletin1Modelo.TipoAgente;

public class ServicioInteracciones {

	private RepositorioInteracciones repositorio;

	public RepositorioInteracciones getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(RepositorioInteracciones repositorio) {
		this.repositorio = repositorio;
	}

	public ServicioInteracciones(RepositorioInteracciones repositorio) {
		this.repositorio = repositorio;
	}

	// TODO
	public InteraccionAgente obtenerMejorValorada() {
		return null;
	}

	// TODO
	public void modificarValoracion(String id, double nuevaValoracion) {
		// TODO
	}

	// TODO
	public void modificarPorcentajeAcierto(String id, double nuevoPorcentaje) {
		// TODO
	}

	// TODO
	public List<InteraccionAgente> obtenerInteraccionesConAciertoMayorQue(double umbral) {
		return null;
	}

	// TODO
	public void generarResumenEstadisticas(String rutaArchivo) {
		// TODO
	}

	// TODO
	public void exportarInteraccionesOrdenadasPorId(String rutaCSV) {
		// TODO
	}

	// TODO
	public void cargarDesdeJSON(String rutaJSON) {
		// TODO
	}

	// TODO
	public double obtenerTiempoMedioPorTipo(TipoAgente tipo) {
		return 0.0;
	}

	// TODO
	public double obtenerPorcentajeAciertoMedioPorTipo(TipoAgente tipo) {
		return 0.0;
	}

	// TODO
	public Map<TipoAgente, List<InteraccionAgente>> obtenerInteraccionesAgrupadasPorTipo() {
		return null;
	}
}
