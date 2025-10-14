package Boletin2FicherosFoldes;

import java.io.File;
import java.util.Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import tema1Ficheros.Ejercicio1;

public class GestionaFicheros {
	private static final Logger logger = LogManager.getLogger(Ejercicio1.class);

	public static void main(String[] args) {

		try {
			// Ruta relativa al escritorio del usuario
			String escritorio = System.getProperty("user.home") + "/Desktop";

			// Carpetas a comparar dentro del escritorio
			File carpeta1 = new File(escritorio + "/2DAM");
			File carpeta2 = new File(escritorio + "/Acceso_A_Datos-master");
			
			DiffFolder comparador = new DiffFolder(carpeta1, carpeta2);
			comparador.setFolders(carpeta1, carpeta2);

			Collection<ResultadoComparacion> resultados = comparador.compare();

			for (ResultadoComparacion resultado : resultados) {
				logger.debug(resultado);
			}

		} catch (GestionFicherosException e) {
			logger.warn("Error al validar carpetas: " + e.getMessage());
		}
	}
}
