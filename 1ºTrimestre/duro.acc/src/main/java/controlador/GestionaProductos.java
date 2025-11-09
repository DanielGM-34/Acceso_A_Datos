package controlador;

import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import modelo.Producto;
import servicio.ServicioProductos;
import utiles.UtilJSON;

public class GestionaProductos {
    private static final Logger logger = LogManager.getLogger(GestionaProductos.class);

    public static void main(String[] args) {
        ServicioProductos servicio = new ServicioProductos();
        Scanner sc = new Scanner(System.in);

        try {
            UtilJSON json = new UtilJSON();

            // 1. Cargar productos desde XML original
            servicio.cargarDesdeXML("Productos.xml");
            List<Producto> productos = servicio.getProductos();

            if (productos.isEmpty()) {
                logger.info("⚠️ XML vacío. Intentando cargar desde JSON...");
                servicio.cargarDesdeJSON("Productos.json");
                productos = servicio.getProductos();
            }

            if (productos.isEmpty()) {
                logger.info("⚠️ JSON también vacío. Se inicializan productos de prueba...");

                Producto p1 = new Producto("1", true, "Producto 1", 10.0, 3);
                Producto p2 = new Producto("2", true, "Producto 2", 15.0, 10);
                Producto p3 = new Producto("3", true, "Producto 3", 25.0, 0);
                Producto p4 = new Producto("4", true, "Producto 4", 5.75, 50);

                servicio.agregarProducto(p1);
                servicio.agregarProducto(p2);
                servicio.agregarProducto(p3);
                servicio.agregarProducto(p4);
            }

            // 2. Actualizar estado de venta según stock
            servicio.retiraDeVentaProductos(productos);

            // 3. Exportar productos modificados a nuevo XML
            servicio.exportarXML("ProductosActualizados.xml");
            logger.info("✅ XML actualizado exportado como ProductosActualizados.xml");

            // 4. Mostrar productos por consola
            logger.info("\n📦 Lista de productos:");
            for (Producto p : servicio.getProductos()) {
                logger.info(p);
            }

            // 5. Buscar producto por ID
            logger.info("\n🔍 Buscar producto por ID: ");
            String idBuscar = sc.nextLine();
            Producto encontrado = servicio.buscarPorId(idBuscar);
            if (encontrado != null) {
                logger.info("✅ Producto encontrado: " + encontrado);
            } else {
                logger.info("❌ No se encontró ningún producto con ID: " + idBuscar);
            }

            // 6. Eliminar producto por ID
            logger.info("\n🗑️ Eliminar producto por ID: ");
            String idEliminar = sc.nextLine();
            boolean eliminado = servicio.eliminarPorId(idEliminar);
            if (eliminado) {
                logger.info("✅ Producto eliminado.");
            } else {
                logger.info("❌ No se pudo eliminar. ID no encontrado.");
            }
 
            // 7. Agregar nuevo producto
            logger.info("\n➕ Agregar nuevo producto:");
            logger.info("ID: ");
            String nuevoId = sc.nextLine();
            logger.info("Nombre: ");
            String nuevoNombre = sc.nextLine();
            logger.info("Precio: ");
            double nuevoPrecio = Double.parseDouble(sc.nextLine());
            logger.info("Stock: ");
            int nuevoStock = Integer.parseInt(sc.nextLine());

            Producto nuevo = new Producto(nuevoId, true, nuevoNombre, nuevoPrecio, nuevoStock);
            servicio.agregarProducto(nuevo);
            logger.info("✅ Producto agregado.");

            // 8. Exportar XML final
            servicio.exportarXML("ProductosFff.xml");
            logger.info("📤 XML final exportado como ProductosFff.xml");

            // 9. Exportar también a JSON
            
            
            servicio.exportarJSON("src/main/resources/ProductosFinal.json");
            logger.info("📤 JSON final exportado como ProductosFinal.json");
            
            // Filtrar productos con stock < 5
            logger.info("Filtrando productos con stock < 5...");
            List<Producto> stockBajo = servicio.devuelveProductosCuyoStokEsMenorA(5);

            servicio.retiraDeVentaProductos(stockBajo);

            // Generar JSON de productos NO en venta
            logger.info("Generando JSON de productos NO en venta..."); 
            json.escribeProductos(stockBajo,"src/main/resources/productosNOenVenta.json");

        } catch (Exception e) {
            logger.info("❌ Error en la gestión de productos: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
