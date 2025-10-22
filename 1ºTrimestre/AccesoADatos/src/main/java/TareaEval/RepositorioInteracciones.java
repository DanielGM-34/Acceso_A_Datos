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
        // TODO: implementar
    }

    // TODO
    public void actualizaPorcentajeInteraccion(String id, double nuevoPorcentaje) {
        // TODO: implementar
    }

    // TODO
    public void incrementaNumeroValoraciones(String id, double nuevaValoracion) {
        // TODO: implementar
    }

    // TODO
    public InteraccionAgente obtenerInteraccionConMejorValoracion() {
        return null;
    }

    // TODO
    public double calcularTiempoMedioPorTipo(TipoAgente tipo) {
        return 0.0;
    }

    // TODO
    public double calcularPorcentajeAciertoMedioPorTipo(TipoAgente tipo) {
        return 0.0;
    } 

    // TODO
    public List<InteraccionAgente> obtenerInteraccionesAciertoMayorQueOrdenadas(double umbral) {
        return null;
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
