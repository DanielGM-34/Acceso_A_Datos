package FicherosComandosUtiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import FicherosComandos.Persona;

public class ManejaFicheroPersona {	



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
		listaNotas.add(Integer.parseInt(string));
		a = new Persona(cadenas[0], listaNotas);
	}
	return a;

}}