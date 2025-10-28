package TareaEval.servicio;

import java.util.*;

import Boletin1Modelo.TipoAgente;
import TareaEval.modelo.InteraccionAgente;
import TareaEval.repositorio.RepositorioInteracciones;

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

    public InteraccionAgente obtenerMejorValorada() {
        return repositorio.obtenerInteraccionConMejorValoracion(); 
    }
 
    public void modificarValoracion(int id, double nuevaValoracion) {
        repositorio.incrementaNumeroValoraciones(id, nuevaValoracion);
    }

    public void modificarPorcentajeAcierto(int id, double nuevoPorcentaje) {
        repositorio.actualizaPorcentajeInteraccion(id, nuevoPorcentaje); 
    }

    public List<InteraccionAgente> obtenerInteraccionesConAciertoMayorQue(double umbral) {
        return repositorio.obtenerInteraccionesAciertoMayorQueOrdenadas(umbral);
    }

    public void generarResumenEstadisticas(String rutaArchivo) {
        repositorio.grabarResumenEstadistica(rutaArchivo, repositorio.getInteracciones());
    }

    public void exportarInteraccionesOrdenadasPorId(String rutaCSV) {
        repositorio.grabarFicheroCSV(rutaCSV, repositorio.getInteracciones());
    }


    public void cargarDesdeJSON(String rutaJSON) {
        List<InteraccionAgente> cargadas = repositorio.devuelveleInteraccionesLista(rutaJSON);
        if (cargadas != null) {
            for (InteraccionAgente interaccion : cargadas) {
                repositorio.agregaInteraccionARegistro(interaccion);
            }
        }
    }

    public double obtenerTiempoMedioPorTipo(TipoAgente tipo) {
        return repositorio.calcularTiempoMedioPorTipo(tipo);  
    } 

    public double obtenerPorcentajeAciertoMedioPorTipo(TipoAgente tipo) {
        return repositorio.calcularPorcentajeAciertoMedioPorTipo(tipo);
    } 

    public Map<TipoAgente, List<InteraccionAgente>> obtenerInteraccionesAgrupadasPorTipo() {
        return repositorio.agruparInteraccionesPorTipo();
    }
}
