package FicherosComandos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import tema1Ficheros.Ejercicio1;

public class GestionaPersonas {
	private static final Logger logger = LogManager.getLogger(Ejercicio1.class);
	private static final String ruta = "src\\main\\resources\\prueba.txt.txt";

	public static void main(String[] args) {
		List<Integer> notas = new ArrayList<Integer>();
		
		
		// TODO Auto-generated method stub
		GestionaPersonas p = new GestionaPersonas();
		try {
			p.muestraContenidoFich(ruta);
			p.devuelvePersona(ruta);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void muestraContenidoFich(String rutaYNombre) throws FileNotFoundException {
		Scanner in = null;
		try {
			// abre el fichero
			FileReader fichero = new FileReader(rutaYNombre);
			// Se crea el flujo
			in = new Scanner(fichero);
			// lee el fichero

			in.useDelimiter(",");
			while (in.hasNextLine()) { // Lectura palabra a palabra
				// Aquí se hará la lectura in.next()
				String palabra = in.nextLine();
				logger.info(palabra);

				logger.info(in.next());
				Persona p = devuelvePersona(palabra);
				logger.info(p.toString());

			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}

	public Persona devuelvePersona(String linea) {
		Persona a = null;
		List<Integer> listaNotas = new ArrayList<Integer>();
		String[] cadenas = linea.split(",");
		for (int i = 1; i < cadenas.length; i++) {
			String string = cadenas[i];
			a = new Persona(cadenas[0], listaNotas);

			listaNotas.add(Integer.parseInt(string));
		}
		return a;

	}

}
