package TareaEval.repositorio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Boletin1Modelo.TipoAgente;
import TareaEval.modelo.InteraccionAgente;
import modelo.Empleado; 

public class RepositorioInteracciones {
	private List<InteraccionAgente> interacciones;

	public RepositorioInteracciones() {
		this.interacciones = new ArrayList<InteraccionAgente>();
	}

	public void agregaInteraccionARegistro(InteraccionAgente interaccion) {
		this.getInteracciones().add(interaccion);
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

	}

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
	
	
	
public List<InteraccionAgente> obtenerListaFiltrada(TipoAgente tipo){
	List<InteraccionAgente> listaTipoAgenteFiltrada = new ArrayList<InteraccionAgente>();
	Iterator<InteraccionAgente> it = this.getInteracciones().iterator();
	while (it.hasNext()) {
		InteraccionAgente interaccionAgente = (InteraccionAgente) it.next();
		if (interaccionAgente.getTipo().equals(tipo)) {
			listaTipoAgenteFiltrada.add(interaccionAgente);
		}
	
}
	return listaTipoAgenteFiltrada;
	} 



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
	
	
	public double calcularValoracionMediaPorTipo(TipoAgente tipo) { 
	    List<InteraccionAgente> listaTipoAgenteFiltrada = new ArrayList<InteraccionAgente>();
	    Iterator<InteraccionAgente> it = this.getInteracciones().iterator();
	    double sumaValoraciones = 0;
	    boolean hayCoincidencias = false;
	    double mediaVal = 0;

	    while (it.hasNext()) {
	        InteraccionAgente interaccionAgente = (InteraccionAgente) it.next();
	        if (interaccionAgente.getTipo().equals(tipo)) {
	            hayCoincidencias = true;
	            listaTipoAgenteFiltrada.add(interaccionAgente);
	            sumaValoraciones += interaccionAgente.getNumValoracionesPositivas();
	        }
	    } 

	    if (hayCoincidencias) { 
	    	mediaVal = sumaValoraciones / listaTipoAgenteFiltrada.size();
	    }
	        return mediaVal;
	    
	}


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

	
	public Map<TipoAgente, List<InteraccionAgente>> agruparInteraccionesPorTipo() {
	    Map<TipoAgente, List<InteraccionAgente>> mapaAgrupado = new HashMap<TipoAgente, List<InteraccionAgente>>();
 
	    for (TipoAgente tipo : TipoAgente.values()) {
	        List<InteraccionAgente> listaFiltrada = obtenerListaFiltrada(tipo);
	        mapaAgrupado.put(tipo, listaFiltrada);
	    }

	    return mapaAgrupado;
	}


	// ESCRITURA DE EMPLEADOS EN JSON
	public void escribeInteraccionesLista(List<InteraccionAgente> lista, String rutaFIchero) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String json = gson.toJson(lista);
		FileWriter ficheroAescribir = null;
		try {
			ficheroAescribir = new FileWriter(rutaFIchero);
			ficheroAescribir.write(json);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (ficheroAescribir != null) {
				try {
					ficheroAescribir.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}  

	public List<InteraccionAgente> devuelveleInteraccionesLista(String rutaFichero) {
		List<InteraccionAgente> interaccionesArray = null; 
		try {
			Gson gson = new Gson();
			FileReader fichero = new FileReader(rutaFichero);
			// Leer el archivo JSON y convertirlo a un objeto Empleado
			InteraccionAgente[] listaInteracciones = gson.fromJson(fichero, InteraccionAgente[].class);

			// Hacer usa lista de empleados
			interaccionesArray = Arrays.asList(listaInteracciones);
			System.out.println(interaccionesArray);
		} catch (Exception e) {
			System.out.println("Error al leer la lista e interacciones" + e.getMessage());
		}
		return interaccionesArray;
	}



	public void grabarFicheroCSV(String rutaArchivo, Collection<InteraccionAgente> registros) {
		FileWriter escribe = null;
		try {
			escribe = new FileWriter(rutaArchivo);
			String cabeceraInteracciones = "Identificador,Tipo,Peticion,Respuesta,TiempoEjecucion,Valoracion,PorcentajeAcierto\n";
			escribe.write(cabeceraInteracciones);

			for (InteraccionAgente interaccionAgente : registros) {
				String linea = interaccionAgente.getIdentificador() + "," + interaccionAgente.getTipo() + ","
						+ interaccionAgente.getPeticion() + "," + interaccionAgente.getRespuesta() + ","
						+ interaccionAgente.getTiempoEjecucion() + "," + interaccionAgente.getNumValoracionesPositivas()
						+ "," + interaccionAgente.getPorcentajeAcierto() + "\n";
				escribe.write(linea);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (escribe != null) {
				try {
					escribe.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} 

	}
	

	public void grabarResumenEstadistica(String rutaArchivo, List<InteraccionAgente> registros) {
		FileWriter resumenEstadistica = null;
		try {
			resumenEstadistica = new FileWriter(rutaArchivo);
			
			List<InteraccionAgente> listaHum = obtenerListaFiltrada(TipoAgente.HUMANO);
			List<InteraccionAgente> listaIa = obtenerListaFiltrada(TipoAgente.IA);

			String ficheroCabecera = "RESUMEN DE INTERACCIONES\n";
			String raya = "---------------------------------------------------------------------\n";
			String totalInteracciones = "Se han efectuado un total de "  + registros.size()+ " interacciones:\n";
			String interaccionesHumanas ="Las interacciones que han tomado más tiempo han sido las efectuadas por Humanos con un tiempo medio " +  calcularTiempoMedioPorTipo(TipoAgente.HUMANO) + " segundos.\n";
			String resto= "De todas las interacciones:\n";
			String guionHumano = "- " + listaHum.size()+ /*metodo a implementar*/" han sido efectuadas por Humanos con una valoración media de " + calcularValoracionMediaPorTipo(TipoAgente.HUMANO) + " y una tasa de acierto de " + calcularPorcentajeAciertoMedioPorTipo(TipoAgente.HUMANO) + "%\n" ;
			String guionIa = "- " + listaIa.size()+ /*metodo a implementar*/" han sido efectuadas por Humanos con una valoración media de " + calcularValoracionMediaPorTipo(TipoAgente.IA) + " y una tasa de acierto de " + calcularPorcentajeAciertoMedioPorTipo(TipoAgente.IA) + "%\n" ;
			resumenEstadistica.write(ficheroCabecera);
			resumenEstadistica.write(raya);
			resumenEstadistica.write(totalInteracciones);
			resumenEstadistica.write(interaccionesHumanas);
			resumenEstadistica.write(resto); 
			resumenEstadistica.write(guionHumano); 
			resumenEstadistica.write(guionIa); 

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (resumenEstadistica != null) {
				try {
					resumenEstadistica.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		// TODO: implementar
	}

	public List<InteraccionAgente> getInteracciones() {
		return interacciones;
	}
}
