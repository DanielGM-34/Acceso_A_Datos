package Euromillones.servicio;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Euromillones.modelo.Combinaciones;
import Euromillones.repositorio.HistoricoCombinaciones;

public class EuromillonesServicio {

	public EuromillonesServicio() {
		super();
	}

	HistoricoCombinaciones repositorioCombi = new HistoricoCombinaciones();

	public int calculaNumeroEstrellaMasRepetido() {
		List<Combinaciones> repo = this.repositorioCombi.getHitorico();
		int numMasRep = 0;
		for (Combinaciones combinaciones : repo) {

		}

		return numMasRep;
	}

	public List<Integer> combinacionMasFrecuente() {
		List<Integer> combinacionesMasFrecuentes = null;
		List<Combinaciones> repo = this.repositorioCombi.getHitorico();
		int numMasRep = 0;

		for (Combinaciones combinaciones : repo) {
			int repeticion = 0;
			for (Combinaciones combinaciones2 : repo) {
				if (combinaciones.getCombinaciones().equals(combinaciones2.getCombinaciones())) {
					repeticion += 1;
					if (repeticion > numMasRep) {
						numMasRep = repeticion;
						combinacionesMasFrecuentes = combinaciones.getCombinaciones();
					} 

				} 
			}
		}

		return combinacionesMasFrecuentes;
	}

}