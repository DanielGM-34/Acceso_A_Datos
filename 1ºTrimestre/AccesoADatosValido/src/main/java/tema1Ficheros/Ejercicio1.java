package tema1Ficheros;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Boletin1.PorbandoLog;

public class Ejercicio1 {
	private static final Logger logger = LogManager.getLogger(PorbandoLog.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File rutaFicheros = new File("C:\\Users\\Alumno");
		boolean existe = rutaFicheros.exists();
		String[] archivosTotales = rutaFicheros.list();

		if (existe) {
			for (String string : archivosTotales) {
				logger.debug(string);

			}
			logger.debug("archivos totales: " + archivosTotales.length);


		}

	}
	
	

}
