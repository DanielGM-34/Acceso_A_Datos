package RepasoContenido;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class RepasoFiles {

	public static void main(String[] args) {
		String ruta = "src/main/java/RepasoContenido";
		RepasoFiles o = new RepasoFiles(); 
		
		//Crea un archivo
		System.out.println(o.crearArchivo(ruta, "archivoRepaso.txt"));
		
		
		//Elimina el archivo
		System.out.println(o.eliminaArchivo(ruta, "archivoRepaso.txt"));
		
		File directorio = new File("C:/Users/DANI/Desktop/2 DAM");
		File [] archivosDirectorio  = o.devuelveListaArchivos(directorio);
		o.recorreArchivos(archivosDirectorio);
		  
		// TODO Auto-generated method stub
 
	} 
	
	public boolean crearArchivo(String rutaDirectorio, String nombreArchivo) {
		File directorio = new File(rutaDirectorio,nombreArchivo);
		//Devuelve false si este ya está creado.
		boolean creado = false; 
		try { 
			creado=directorio.createNewFile();
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return creado;
	}
	
	public boolean eliminaArchivo(String ruta, String directorio) {
		File directorioAEliminar = new File(ruta,directorio);
		boolean eliminado=directorioAEliminar.delete();	
		
		return eliminado;
	}
	
	  
	public File [] devuelveListaArchivos(File directorio) { 
		File[] listaFicheros = null;
		if (directorio.isDirectory()) {
			listaFicheros = directorio.listFiles();
		}
		
		return listaFicheros; 
		 
	}
	
	public void recorreArchivos(File [] listaArchivosArecorrer) {
		for (int i = 0; i < listaArchivosArecorrer.length; i++) {
			File file = listaArchivosArecorrer[i];
			System.out.println(file.getName());
		}		 
		
	}
	
	
	



}
