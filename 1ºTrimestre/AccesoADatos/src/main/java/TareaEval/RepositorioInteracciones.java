package TareaEval;

import java.util.*;

import Boletin1Modelo.TipoAgente;

public class RepositorioInteracciones {
	private List<InteraccionAgente> interacciones;

	public RepositorioInteracciones() {
		this.interacciones = new ArrayList<InteraccionAgente>();
	}

	// TODO
	public void agregaInteraccionARegistro(InteraccionAgente interaccion) {
		this.getInteracciones().add(interaccion);
		// TODO: implementar
	}

	// TODO
	public void actualizaPorcentajeInteraccion(int id, double nuevoPorcentaje) {
		boolean actualiza = false;
		Iterator<InteraccionAgente> it = this.getInteracciones().iterator();
		while (it.hasNext() && !actualiza) {
			InteraccionAgente interaccionActual = (InteraccionAgente) it.next();
			if (interaccionActual.getIdentificador() == id) {
				actualiza = true;
				interaccionActual.setPorcentajeAcierto(nuevoPorcentaje);
			}

		}
		if (actualiza) {
			System.out.println();
		}

		// TODO: implementar
	}

	// TODO
	public void incrementaNumeroValoraciones(int id, double nuevaValoracion) {
		// TODO: implementar
		boolean incrementa = false;
		Iterator<InteraccionAgente> it = this.getInteracciones().iterator();
		while (it.hasNext() && !incrementa) {
			InteraccionAgente interaccionActual = (InteraccionAgente) it.next();
			if (interaccionActual.getIdentificador() == id) {
				incrementa = true;
				double valoracionActual = interaccionActual.getNumValoracionesPositivas() + nuevaValoracion;
				interaccionActual.setNumValoracionesPositivas(nuevaValoracion);
			}

		}
		if (incrementa) {
			System.out.println();
		}

	}

	// TODO
	public InteraccionAgente obtenerInteraccionConMejorValoracion() {
		InteraccionAgente mejorInteraccion = null;
		List<InteraccionAgente> listaInt = this.getInteracciones();
		for (int i = 0; i < listaInt.size(); i++) {
			InteraccionAgente actual = listaInt.get(i);
			if (mejorInteraccion == null
					|| actual.getNumValoracionesPositivas() > mejorInteraccion.getNumValoracionesPositivas()) {
				mejorInteraccion = actual;
			}

		}

		return mejorInteraccion;
	}

	// TODO
	public double calcularTiempoMedioPorTipo(TipoAgente tipo) {
		List<InteraccionAgente> listaTipoAgenteFiltrada = new ArrayList<InteraccionAgente>();
		Iterator<InteraccionAgente> it = this.getInteracciones().iterator();
		double sumaDeTiempo = 0;
		while (it.hasNext()) {
			InteraccionAgente interaccionAgente = (InteraccionAgente) it.next();
			if (interaccionAgente.getTipo().equals(tipo)) {
				listaTipoAgenteFiltrada.add(interaccionAgente);
				sumaDeTiempo += interaccionAgente.getTiempoEjecucion();
			}

		}
		return sumaDeTiempo / (listaTipoAgenteFiltrada.size());
	}

	// TODO
	public double calcularPorcentajeAciertoMedioPorTipo(TipoAgente tipo) {
		List<InteraccionAgente> listaTipoAgenteFiltrada = new ArrayList<InteraccionAgente>();
		Iterator<InteraccionAgente> it = this.getInteracciones().iterator();
		double sumaPorcentaje = 0;

		while (it.hasNext()) {
			InteraccionAgente interaccionAgente = (InteraccionAgente) it.next();
			if (interaccionAgente.getTipo().equals(tipo)) {
				listaTipoAgenteFiltrada.add(interaccionAgente);
				sumaPorcentaje += interaccionAgente.getPorcentajeAcierto();
			}

		}

		return sumaPorcentaje / (listaTipoAgenteFiltrada.size());
	}

	// TODO
	public List<InteraccionAgente> obtenerInteraccionesAciertoMayorQueOrdenadas(double umbral) {
		List<InteraccionAgente> listaMayorUmbral = new ArrayList<InteraccionAgente>();
		Iterator<InteraccionAgente> it = this.getInteracciones().iterator();
		double sumaDeTiempo = 0;
		while (it.hasNext()) {
			InteraccionAgente interaccionAgente = (InteraccionAgente) it.next();
			if (interaccionAgente.getPorcentajeAcierto() > umbral) {
				listaMayorUmbral.add(interaccionAgente);
			}

		}
		Collections.sort(listaMayorUmbral);
		return listaMayorUmbral;
	}

	// TODO
	public Map<TipoAgente, List<InteraccionAgente>> agruparInteraccionesPorTipo() {

		return null;
	}

	// TODO
	public void cargarRegistrosDesdeJSON(String rutaArchivo) {
		// TODO: implementar
	}

	// TODO
	public void grabarFicheroCSV(String rutaArchivo, Collection<InteraccionAgente> registros) {
		// TODO: implementar
	}

	// TODO
	public void grabarResumenEstadistica(String rutaArchivo, Collection<InteraccionAgente> registros) {
		// TODO: implementar
	}

	public List<InteraccionAgente> getInteracciones() {
		return interacciones;
	}
}
