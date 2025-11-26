package Mongo.modelo;

public class Scores {
	private double score;
	private String type;

	public Scores(double score, String type) {
		super();
		this.score = score;
		this.type = type;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Scores [score=" + score + ", type=" + type + "]";
	}

}
