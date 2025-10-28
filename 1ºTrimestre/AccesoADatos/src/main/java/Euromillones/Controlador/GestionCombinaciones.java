package Euromillones.Controlador;
import java.util.List;

import Euromillones.Utiles.Utiles;
import Euromillones.modelo.Combinaciones;
import Euromillones.repositorio.HistoricoCombinaciones;
import Euromillones.servicio.EuromillonesServicio;

public class GestionCombinaciones {
	public static void main(String[] args) {
		GestionCombinaciones a = new GestionCombinaciones(); 
		Utiles p = new Utiles();
		
		
		List<Combinaciones> pepe = p.leerCombinacionesCSV("src/main/resources/Euromillones.csv");
		
		HistoricoCombinaciones combis = new HistoricoCombinaciones(pepe); 
		
		System.out.println(pepe.getFirst());
		System.out.println(pepe.getLast()); 
		
		EuromillonesServicio o = new EuromillonesServicio();
		System.out.println(o.combinacionMasFrecuente()); 
		
		
		
		
		
		
		
		
	}   

	
}
