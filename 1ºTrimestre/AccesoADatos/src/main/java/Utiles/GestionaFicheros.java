package Utiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import PaisesEjercicio.Pais;

public class GestionaFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionaFicheros pepe = new GestionaFicheros();
		try {
			List<Pais> paises = pepe.devuelveListaPaises("src/main/resources/paises.csv");
			for (Pais pais : paises) {
				System.out.println(pais);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Pais devuelvePais(String linea) { 
		String[] cadenas = linea.split(",");
		Pais pais = null;
		pais = new Pais(cadenas[0], cadenas[1], Integer.parseInt(cadenas[2]), cadenas[3], cadenas[4]);
		return pais;
	} 

	List<Pais> devuelveListaPaises(String rutaYNombre) throws FileNotFoundException {
		Scanner in = null; 
		List<Pais> listaPaises = new ArrayList<Pais>();  
		Pais pais = null; 
		try {
			// abre el fichero
			FileReader ficheroALeer = new FileReader(rutaYNombre);
			// Se crea el flujo 
			in = new Scanner(ficheroALeer);
			// lee el fichero
			in.nextLine();

			in.useDelimiter(",");
			while (in.hasNextLine()) { // Lectura palabra a palabra
				// Aquí se hará la lectura in.next()
				String lineaDelCsv = in.nextLine();
				//System.out.println(palabra); 
				pais = devuelvePais(lineaDelCsv);
				listaPaises.add(pais);
				// System.out.println(p.toString());
			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
		return listaPaises;
	}

}
