package controlador;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import modelo.Producto;
import utiles.UtilJSON;
import utiles.XMLDomProductosDani;

public class GestionaProductos2 {
	 
	 private static final Logger logger = LogManager.getLogger(GestionaProductos.class);

	    public static void main(String[] args) {
	    try {
 
       ServicioProducto servicio = new ServicioProducto();
       XMLDomProductosDani xmlDom = new XMLDomProductosDani();
       UtilJSON json = new UtilJSON();
       
       

 
       // Leer productos desde XML
       logger.info("Leyendo productos desde XML..."); 
       List<Producto> lista = xmlDom.leerProductosDesdeXML("Productos.xml");

       // Agregar productos al repositorio
       logger.info("Agregando productos al repositorio...");
       for (Producto p : lista) {
           servicio.agregarProducto(p);
           logger.info("Producto agregado: {}", p.getNombre());
       }

       // Filtrar productos con stock < 5
       logger.info("Filtrando productos con stock < 5...");
       List<Producto> stockBajo = servicio.productosConStockMenorA(5);

       // Retirar de venta productos con stock < 5
       logger.info("Retirando de venta productos con stock < 5...");
       servicio.retiraDeVentaProductos(stockBajo);

       // Generar JSON de productos NO en venta
       logger.info("Generando JSON de productos NO en venta..."); 
       json.escribeProductos(stockBajo,"src/main/resources/productosNOenVenta.json");
    // Generar el mismo archivo pero en formato XML
       logger.info("Generando XML de productos NO en venta...");
       json.escribirEnXML("src/main/resources/productosNOenVenta.xml", stockBajo);

       logger.info("Proceso completado correctamente.");

   } catch (Exception e) {
       logger.error("Ocurrió un error: ", e);
   }
}

       
}
