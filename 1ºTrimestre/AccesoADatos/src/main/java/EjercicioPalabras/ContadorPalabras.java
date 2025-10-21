package EjercicioPalabras;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import tema1Ficheros.Ejercicio1;

public class ContadorPalabras {
	private static final Logger logger = LogManager.getLogger(Ejercicio1.class);

	public int contarPalabras(String ficheroYRuta, String palabra) throws FileNotFoundException {
		int numPalabras = 0;
		File ficheroS = new File(ficheroYRuta);
		FileReader fichero = new FileReader(ficheroYRuta);
		Scanner in = new Scanner(fichero);
		while (in.hasNext()) {
			String palFichero = in.next();
			if (palFichero.equalsIgnoreCase(palabra)) {
				numPalabras += 1;
			}
		}
		in.close();

		return numPalabras;
	}

	public void escribirFicheroLog(int nume, String rutaFichero) {
		PrintWriter out = null;
		FileWriter ficheroSalida; 
		File archivoTxt = new File(rutaFichero);

		try {
			ficheroSalida = new FileWriter(rutaFichero);
			out = new PrintWriter(ficheroSalida);
			out.printf("El número de veces que aparece es %d %n", nume);
			ficheroSalida.write(nume);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}
	
	public void escribirFicheroLog2(int nume, String rutaFichero) {
	    try (PrintWriter out = new PrintWriter(new FileWriter(rutaFichero))) {
	        out.printf("El número de veces que aparece es %d%n", nume);
	    } catch (IOException e) {
	        System.err.println("Error al escribir en el fichero: " + e.getMessage());
	        e.printStackTrace();
	    }
	}

}
