package Utiles;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;

import modelo.Empleado;
import modelo.Pokemon;
import tema1Ficheros.Ejercicio1;

public class ManejoJson {
	private static final String rutaResources = "src/main/resources/";
	private static final Logger logger = LogManager.getLogger(Ejercicio1.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		Empleado empleado = gson.fromJson(rutaResources + "Empleado.json", Empleado.class);
		Pokemon poke = gson.fromJson(rutaResources + "Pokemon.json", Pokemon.class);
		

		System.out.println(poke);
	}

	public void leeEmpleados(String rutaFichero) {
		try {
			Gson gson = new Gson();
			FileReader fichero = new FileReader(rutaFichero);
			// Leer el archivo JSON y convertirlo a un objeto Empleado
			Empleado[] empleadosArray = gson.fromJson(fichero, Empleado[].class);
			List<Empleado> empleados = Arrays.asList(empleadosArray);
			System.out.println(empleados);
		} catch (Exception e) {
		logger.info("Error al leer empleados" + e.getMessage());
		}
	} 
	
	public Pokemon devuelvePokemon(String rutaFichero) {
		Pokemon p= null;
		try {
			Gson gson = new Gson();
			FileReader fichero = new FileReader(rutaFichero);
			// Leer el archivo JSON y convertirlo a un objeto Empleado
			 p = gson.fromJson(fichero,Pokemon.class);
			System.out.println(p);
		} catch (Exception e) { 
		logger.info("Error al leer empleados" + e.getMessage());
		} 
		return p;
	} 

	public void escribeEmpleado(Empleado empleado, String ruta) {// Convertir el objeto a JSON
		Gson gson = new Gson();
		String json = gson.toJson(empleado);
		FileWriter fichero = null;
		try {
			fichero = new FileWriter(ruta);
			fichero.write(json);
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			if (fichero != null) {
				try {
					fichero.close();
				} catch (IOException e) {
					logger.info("Error al escribir empleado");
				}
			}
		}
	}

}
