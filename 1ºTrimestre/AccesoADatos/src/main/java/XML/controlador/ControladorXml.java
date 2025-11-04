package XML.controlador;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import XML.DomEmpleado;
import modelo.Empleado; 

public class ControladorXml{
	private static final Logger logger = LogManager.getLogger(DomEmpleado.class);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DomEmpleado xmlEmpl = new DomEmpleado();
		try { 
			Empleado e = xmlEmpl.leerEmpleadoDesdeXML("empleado.xml");
			logger.info(e.toString()); 
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 

}
