package Mongo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
	private int id;
	private String name;
	private double notaMedia;
	private List<String> aficiones;
	private Address addres;
	private List<Scores> scores;

	public Estudiante() {
		super();
	}

	public Estudiante(int id, String name, double notaMedia, List<String> aficiones, Address addres,
			List<Scores> scores) {
		super();
		this.id = id;
		this.name = name;
		this.notaMedia = notaMedia;
		this.aficiones = aficiones;
		this.addres = addres;
		this.scores = scores;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public List<String> getAficiones() {
		return aficiones;
	}

	public void setAficiones(List<String> aficiones) {
		this.aficiones = aficiones;
	}

	public Address getAddres() {
		return addres;
	}

	public void setAddres(Address addres) {
		this.addres = addres;
	}

	public List<Scores> getScores() {
		return scores;
	}

	public void setScores(List<Scores> scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", name=" + name + ", notaMedia=" + notaMedia + ", aficiones=" + aficiones
				+ ", addres=" + addres + ", scores=" + scores + "]";
	}

}
