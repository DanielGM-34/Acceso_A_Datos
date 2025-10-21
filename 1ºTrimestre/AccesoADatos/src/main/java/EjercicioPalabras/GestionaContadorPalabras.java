package EjercicioPalabras;

import java.io.FileNotFoundException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import tema1Ficheros.Ejercicio1;

public class GestionaContadorPalabras {
	private static final String rutaResources = "src/main/resources/";
	private static final Logger logger = LogManager.getLogger(Ejercicio1.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContadorPalabras a = new ContadorPalabras();
		System.out.printf("PI= %4.0f %n", Math.PI);
		System.out.printf("PI= %4.2f %n", Math.PI);
		System.out.printf("PI= %12.8f %n", Math.PI);
		System.out.printf("PI= %8d %n", 18);

		
		try {
			logger.info(a.contarPalabras(rutaResources+"fichero.txt", "su"));
			int contarPalabra = a.contarPalabras(rutaResources+"fichero.txt", "su");
			logger.info(contarPalabra);
			a.escribirFicheroLog2(contarPalabra, rutaResources+"es.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
