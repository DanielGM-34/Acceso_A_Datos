package RepasoContenido;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import modelo.Empleado;

public class RepasitoJSON {
	private static final String rutaResources = "src/main/resources/";

	public static void main(String[] args) {
		// Gson gson = new Gson();

		// Para leer JSON
		// Empleado empleado =
		// gson.fromJson(rutaResources+"Empleado.json",Empleado.class);

		// Para generar JSON
		// String json = gson.toJson(empleado);

		RepasitoJSON json = new RepasitoJSON();
		json.leeEmpleados(rutaResources + "Empleado.json");
		List<Empleado> pepe = json.devuelveleeEmpleados(rutaResources + "Empleado.json");
		for (Empleado empleado : pepe) {
			System.out.println(empleado);
		}

		// TODO Auto-ge nerated method stub

	}

	// LEER FICHERO JSON
	public void leeEmpleados(String rutaFichero) {
		try {
			Gson gson = new Gson();
			FileReader fichero = new FileReader(rutaFichero);
			// Leer el archivo JSON y convertirlo a un objeto Empleado
			Empleado[] empleadosArray = gson.fromJson(fichero, Empleado[].class);

			// Hacer usa lista de empleados
			List<Empleado> empleados = Arrays.asList(empleadosArray);
			System.out.println(empleados);
		} catch (Exception e) {
			System.out.println("Error al leer empleados" + e.getMessage());
		}
	}

	// DEVOLVER LISTA DE UN JSON
	public List<Empleado> devuelveleeEmpleados(String rutaFichero) {
		List<Empleado> empleados = null;
		try {
			Gson gson = new Gson();
			FileReader fichero = new FileReader(rutaFichero);
			// Leer el archivo JSON y convertirlo a un objeto Empleado
			Empleado[] empleadosArray = gson.fromJson(fichero, Empleado[].class);

			// Hacer usa lista de empleados
			empleados = Arrays.asList(empleadosArray);
			System.out.println(empleados);
		} catch (Exception e) {
			System.out.println("Error al leer empleados" + e.getMessage());
		}
		return empleados;
	}

	// ESCRIBIR UN JSON
	public void escribeEmpleados(Empleado emp, String rutaFIchero) {
		Gson gson = new Gson();
		String json = gson.toJson(emp);
		FileWriter ficheroAescribir = null;
		try {
			ficheroAescribir = new FileWriter(json);

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
 
	// ESCRITURA DE EMPLEADOS EN JSON
	public void escribeEmpleadosLista(List<Empleado> lista, String rutaFIchero) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		;
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

}
