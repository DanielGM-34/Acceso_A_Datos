package modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UtilidadPokemonCSV {

	public void escribePokemon(Pokemon p, String ruta) {
		PrintWriter out = null;
		FileWriter fichero = null;
		try {
			fichero = new FileWriter(ruta);
			// fichero.write(null);
			out = new PrintWriter(fichero);
			out.printf(Locale.US, "Id, Nombre, Tipo, Altura, Peso, habilidadPrincipal, evoluciona_a\n" + "%d", "%s",
					"%s", "%f", "%f", "%s", "%s", p.getId(), p.getNombre(), p.getTipo(), p.getAltura_m(),
					p.getAltura_m(), p.getHabilidadPrincipal(), p.getEvoluciona_a());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fichero != null) {
				try {
					fichero.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.close();
			}
		}
	}

	public Pokemon devuelvePokemon(String rutaFichero) {
		Pokemon p = null;
		try { 
			Gson gson = new Gson(); 
			FileReader fichero = new FileReader(rutaFichero);
			// Leer el archivo JSON y convertirlo a un objeto Empleado
			p = gson.fromJson(fichero, Pokemon.class);
		} catch (Exception e) {
			System.out.println("Error al leer empleados" + e.getMessage());
		}
		return p;
	}

	/*
	 * public Pokemon[] devuelveListaPokemon(String rutaCsv) { Pokemon[] p = null;
	 * Gson gson = new Gson(); try { FileReader fichero = new FileReader(rutaCsv); p
	 * = gson.fromJson(fichero, Pokemon[].class); List<Pokemon> pokemons =
	 * Arrays.asList(p); } catch (FileNotFoundException e) { e.printStackTrace(); }
	 * return p; }
	 */
	public List<Pokemon> leerPokemonDesdeCSV(String rutaArchivo) {
		List<Pokemon> pokedex = new ArrayList<Pokemon>();
		try { 
			File archivo = new File(rutaArchivo);
			Scanner lector = new Scanner(archivo);
			lector.nextLine(); // Saltar encabezado

			while (lector.hasNextLine()) {
				String linea = lector.nextLine();
				Pokemon p = new Pokemon();
				
				String[] partes = linea.split(",");
				p.setId(Integer.parseInt(partes[0]));
				p.setNombre(partes[1]);
				//p.setTipo(partes[2].replace("\"", ""));
				String [] tipo = partes[2].split(";");
				for (int i = 0; i < tipo.length; i++) {
					String string = tipo[i].replace("\"", "");
					p.setTipo(string);
				} 
				
				p.setAltura_m(Float.parseFloat(partes[3]));
				p.setPeso_kg(Float.parseFloat(partes[4]));
				//p.setHabilidadPrincipal(partes[5].replace("\"", ""));	
				String [] habilidad = partes[5].split(";");
				for (int i = 0; i < habilidad.length; i++) {
					String string = habilidad[i].replace("\"", "");
					p.setHabilidadPrincipal(string);
					
				} 
				p.setEvoluciona_a(partes[6]);
				pokedex.add(p);
			}

			lector.close();
		} catch (Exception e) {
			System.out.println("Error al leer el archivo CSV: " + e.getMessage());
		}

		return pokedex;
	}

	public void realizaJSOn(List<Pokemon> p, String rutaJson) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		FileWriter fichero = null;
		try {
			fichero = new FileWriter(rutaJson);
			fichero.write(json);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fichero != null) {
				try {
					fichero.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

}

/*
 * public void leeEmpleados(String rutaFichero) { try { Gson gson = new Gson();
 * FileReader fichero = new FileReader(rutaFichero); // Leer el archivo JSON y
 * convertirlo a un objeto Empleado Empleado[] empleadosArray =
 * gson.fromJson(fichero, Empleado[].class); List<Empleado> empleados =
 * Arrays.asList(empleadosArray); System.out.println(empleados); } catch
 * (Exception e) { System.out.println("Error al leer empleados" +
 * e.getMessage()); } }
 */
