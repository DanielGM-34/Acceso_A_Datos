package servicio;

import java.util.ArrayList;
import java.util.List;

import modelo.Producto;
import repositorio.RepositorioProductos;
import utiles.UtilJSON;
import utiles.XMLDomProductosDani;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServicioProductos {

    private static final Logger logger = LogManager.getLogger(ServicioProductos.class);

    private RepositorioProductos repositorio = new RepositorioProductos();
    private XMLDomProductosDani dom = new XMLDomProductosDani();
    private UtilJSON utilJSON = new UtilJSON();

    public void cargarDesdeXML(String nombreFichero) throws Exception {
        List<Producto> productos = dom.leerProductosDesdeXML(nombreFichero);
        repositorio.setListaProductos(productos);
        logger.info("📥 Productos cargados desde XML: " + nombreFichero);
    }

    public void cargarDesdeJSON(String nombreFichero) {
        List<Producto> productos = utilJSON.leerDesdeJSON(nombreFichero);
        if (productos != null && !productos.isEmpty()) {
            repositorio.setListaProductos(productos);
            logger.info("📥 Productos cargados desde JSON: " + nombreFichero);
        } else {
            logger.info("⚠️ No se cargaron productos desde JSON (nulo o vacío): " + nombreFichero);
        }
    }

    public void retiraDeVentaProductos(List<Producto> productos) {
        productos = repositorio.getTodos();
        for (Producto p : productos) {
            if (p.getStock() < 5) {
                p.setEnVenta(false);
                logger.info("🚫 Producto retirado de venta por bajo stock: " + p.getId());
            }
        }
    }

    public void exportarXML(String nombreFichero) throws Exception {
        List<Producto> productos = repositorio.getTodos();
        dom.escribeProductosXML(productos, nombreFichero);
        logger.info("📤 Productos exportados a XML: " + nombreFichero);
    }

    public void exportarJSON(String ruta) { 
        List<Producto> productos = repositorio.getTodos();
        utilJSON.escribeProductos(productos, ruta);
        logger.info("📤 Productos exportados a JSON: " + ruta);
    }

    public List<Producto> devuelveProductosCuyoStokEsMenorA(int umbral) {
        List<Producto> productosMenorUmbral = new ArrayList<>();
        for (Producto producto : repositorio.getTodos()) {
            if (producto.getStock() < umbral) {
                productosMenorUmbral.add(producto);
            }
        }
        logger.info("🔎 Productos con stock menor a " + umbral + ": " + productosMenorUmbral.size());
        return productosMenorUmbral;
    }

    public List<Producto> getProductos() {
        return repositorio.getTodos();
    }

    public Producto buscarPorId(String id) {
        Producto p = repositorio.buscarProducto(id);
        logger.info(p != null ? "🔍 Producto encontrado: " + id : "❌ Producto no encontrado: " + id);
        return p;
    }

    public boolean eliminarPorId(String id) {
        boolean eliminado = repositorio.eliminarProducto(id);
        logger.info(eliminado ? "🗑️ Producto eliminado: " + id : "❌ No se pudo eliminar: " + id);
        return eliminado;
    }

    public void agregarProducto(Producto p) {
        repositorio.agregarProducto(p);
        logger.info("➕ Producto agregado: " + p.getId());
    }
}
