package Boletin2FicherosFoldes;

import java.io.File;
import java.util.Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GestionaFicheros {
    private static final Logger logger = LogManager.getLogger(GestionaFicheros.class);

    public static void main(String[] args) {
        try {
            // Ruta base relativa al escritorio del usuario
            String escritorio = System.getProperty("user.home") + "/Desktop";

            // Carpetas a comparar dentro del escritorio
            File carpeta1 = new File(escritorio + "/TRELLO");
            File carpeta2 = new File(escritorio + "/LM");

            // Crear instancia de DiffFolder y asignar carpetas
            DiffFolder comparador = new DiffFolder(carpeta1, carpeta2);
            comparador.setFolders(carpeta1, carpeta2);

            // Ejecutar comparación
            Collection<ResultadoComparacion> resultados = comparador.compare();
            // Aquí podrías procesar los resultados si lo necesitas, pero no se imprimen ni se loguean
            for (ResultadoComparacion resultadoComparacion : resultados) {
				logger.info(resultadoComparacion);
			}

        } catch (GestionFicherosException e) {
            logger.warn("Error al validar carpetas: " + e.getMessage());
        } catch (Exception e) {
            logger.error("Error inesperado: " + e.getMessage(), e);
        }
    }
}
