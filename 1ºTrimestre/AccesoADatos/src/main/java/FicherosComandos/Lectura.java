package FicherosComandos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import tema1Ficheros.Ejercicio1;

public class Lectura {
	private static final Logger logger = LogManager.getLogger(Ejercicio1.class);
	private static final String ruta = "src\\main\\resources\\prueba.txt.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lectura a = new Lectura();
		try {
			a.muestraContenidoFich(ruta);
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
			while (in.hasNext()) { // Lectura palabra a palabra
				// Aquí se hará la lectura in.next()
				logger.info(in.next());

			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}

}
