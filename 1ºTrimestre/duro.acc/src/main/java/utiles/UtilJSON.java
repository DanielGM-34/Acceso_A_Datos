package utiles;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import modelo.Producto;

public class UtilJSON {

    private static final Logger logger = LogManager.getLogger(UtilJSON.class);

    public List<Producto> leerDesdeJSON(String archivo) {
        List<Producto> lista = null;
        String rutaCompleta = "src/main/resources/" + archivo;

        if (!archivoExiste(rutaCompleta)) {
            return lista;
        }

        try (FileReader fr = new FileReader(rutaCompleta)) {
            Gson gson = new Gson();
            Producto[] productosArray = gson.fromJson(fr, Producto[].class);
            lista = Arrays.asList(productosArray);
            logger.info("✅ Productos leídos desde JSON: " + archivo);
        } catch (Exception e) {
            logger.info("❌ Error al leer productos desde JSON: " + e.getMessage());
        }

        return lista;
    }

    public void escribeProductos(List<Producto> productos, String ruta) {
        if (productos == null || productos.isEmpty()) {
            logger.info("⚠️ Lista de productos vacía. No se escribe JSON.");
        }

        try (FileWriter fw = new FileWriter(ruta)) {
            Gson gson =  new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(productos);
            fw.write(json);
            logger.info("✅ Productos escritos en JSON: " + ruta);
        } catch (IOException e) {
            logger.info("❌ Error al escribir los productos: " + e.getMessage());
        }
    }
 
    public void escribirEnXML(String ruta, List<Producto> productos) {
        try (FileWriter fw = new FileWriter(ruta)) {
            fw.write("<ListaProductos>\n");
            for (Producto p : productos) {
                fw.write("  <Producto id=\"" + p.getId() + "\" enVenta=\"" + p.isEnVenta() + "\">\n");
                fw.write("    <Nombre>" + p.getNombre() + "</Nombre>\n");
                fw.write("    <Stock>" + p.getStock() + "</Stock>\n");
                fw.write("  </Producto>\n");
            }
            fw.write("</ListaProductos>");
            logger.info("✅ Productos escritos en XML: " + ruta);
        } catch (Exception e) {
            logger.info("❌ Error al escribir en XML: " + e.getMessage());
        }
    }

    private boolean archivoExiste(String ruta) {
        File archivo = new File(ruta);
        boolean existe = archivo.exists() && archivo.isFile();
        if (!existe) {
            logger.info("⚠️ Archivo no encontrado: " + ruta);
        }
        return existe;
    }
}
