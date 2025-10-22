package modelo;

import java.util.List;

import Utiles.ManejoJson;

public class GestionaPokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManejoJson m = new ManejoJson();
		UtilidadPokemonCSV a = new UtilidadPokemonCSV();
		String rutaCsv = "src/main/resources/Pokemon.csv";
		String rutaJson = "src/main/resources/Pokemon.json";
		//System.out.println(a.devuelvePokemon(rutaJson));
		//a.escribePokemon(null, rutaJson); 

		List<Pokemon> pw = a.leerPokemonDesdeCSV(rutaCsv);
		for (Pokemon pokemon : pw) {
			System.out.println(pokemon);
		}
		
		a.realizaJSOn(pw, rutaJson);

		
	}

}
