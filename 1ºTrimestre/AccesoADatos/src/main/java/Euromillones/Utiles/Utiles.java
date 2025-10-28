package Euromillones.Utiles;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Euromillones.modelo.Combinaciones;

public class Utiles {

	public Utiles() {
		super();
	}
	
	public List<Combinaciones> leerCombinacionesCSV(String rutaArchivo) {
		List<Combinaciones> listaCombinaciones = new ArrayList<Combinaciones>();
		try {    
			File archivo = new File(rutaArchivo);
			Scanner lector = new Scanner(archivo); 
			lector.nextLine(); // Saltar encabezado
			while (lector.hasNextLine()) {
				List<Integer> combos = new ArrayList<Integer>(); 

				String linea = lector.nextLine();
				Combinaciones p = new Combinaciones(); 
				
				String[] partes = linea.split(",");
				p.setFecha(partes[0]);
				String num = partes[1];
				String num2 = partes[2];
				String num3= partes[3];
				String num4 = partes[4];
				String num5 = partes[5];
				
				Integer estrella1 = Integer.parseInt(partes[7]);
				Integer estrella2 = Integer.parseInt(partes[8]);
				p.setEstrella1(estrella1);
				p.setEstrella2(estrella2);

				//System.out.println(num);
				Integer numericos1 = Integer.parseInt(num);
				Integer numericos2 = Integer.parseInt(num2);
				Integer numericos3 = Integer.parseInt(num3);
				Integer numericos4 = Integer.parseInt(num4);
				Integer numericos5 = Integer.parseInt(num5);
				combos.add(numericos1); 
				combos.add(numericos2);
				combos.add(numericos3);
				combos.add(numericos4);
				combos.add(numericos5);
				p.setCombinaciones(combos);
				//combos.add(numericos);
				//p.setCombinaciones(combos);
				
				
				listaCombinaciones.add(p);
				//System.out.println(pokedex);
				
			
			} 

			lector.close();
		} catch (Exception e) {
			System.out.println("Error al leer el archivo CSV: " + e.getMessage());
		}

		return listaCombinaciones;
	}
	
}
