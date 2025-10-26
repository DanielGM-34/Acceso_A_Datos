package RepasoContenido;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import FicherosComandos.Persona;

public class RepasoLeerYEscribirFIcheros {
	private static final String ruta = "src\\main\\resources\\prueba.txt.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RepasoLeerYEscribirFIcheros a = new RepasoLeerYEscribirFIcheros();

		try {
			muestraContenidoFich("C:\\Users\\DANI\\Desktop\\prueba.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<Integer> notas = new ArrayList<Integer>();

		// TODO Auto-generated method stub
		RepasoLeerYEscribirFIcheros p = new RepasoLeerYEscribirFIcheros();
		try {  
			p.muestraContenidoFichPersonas(ruta);
			p.devuelvePersona(ruta);
 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void muestraContenidoFich(String rutaYNombre) throws FileNotFoundException {
		Scanner in = null;
		try {
			// abre el fichero
			FileReader fichero = new FileReader(rutaYNombre);
			// Se crea el flujo
			in = new Scanner(fichero);
			// lee el fichero
			while (in.hasNext()) {
				// Aquí se hará la lectura in.nextXXX()
				String palabra = in.nextLine();
				System.out.println(palabra);
			}
		} finally {
			if (in != null) {
				in.close();
			}
		} 
	}

	void muestraContenidoFichPersonas(String rutaYNombre) throws FileNotFoundException { 
		Scanner in = null;
		try {
			// abre el fichero
			FileReader fichero = new FileReader(rutaYNombre);
			// Se crea el flujo
			in = new Scanner(fichero);
			// lee el fichero

			// esto separa por comas
			in.useDelimiter(",");
			while (in.hasNextLine()) { // Lectura palabra a palabra
				// Aquí se hará la lectura in.next()
				String palabra = in.nextLine();
				System.out.println(palabra);
				Persona p = devuelvePersona(palabra);
				System.out.println(p.toString());

			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}

	public Persona devuelvePersona(String linea) {
		Persona personaAdevolver = null;
		List<Integer> listaNotas = new ArrayList<Integer>();
		String[] cadenas = linea.split(",");
		for (int i = 1; i < cadenas.length; i++) {
			String string = cadenas[i];
			personaAdevolver = new Persona(cadenas[0], listaNotas);

			listaNotas.add(Integer.parseInt(string));
		}
		return personaAdevolver;
	}

}
