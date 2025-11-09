package Euromillones.servicio;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
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
	    List<Combinaciones> repo = this.repositorioCombi.getHitorico();

	    List<Integer> combinacionesMasFrecuentes = Collections.emptyList(); // único return
	    int numMasRep = 0;

	    if (repo != null && !repo.isEmpty()) {
	        for (int i = 0; i < repo.size(); i++) {
	            List<Integer> actual = repo.get(i).getCombinaciones();
	            if (actual == null) continue;

	            int repeticion = 0;
	            for (int j = 0; j < repo.size(); j++) {
	                List<Integer> comparada = repo.get(j).getCombinaciones();
	                if (actual.equals(comparada)) {
	                    repeticion++;
	                }
	            }

	            if (repeticion > numMasRep) {
	                numMasRep = repeticion;
	                combinacionesMasFrecuentes = actual;
	            }
	        }
	    }

	    return combinacionesMasFrecuentes;
	}


}