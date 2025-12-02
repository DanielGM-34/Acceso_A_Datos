package Mongo.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import Mongo.modelo.Address;
import Mongo.modelo.Estudiante;
import Mongo.modelo.Scores;

public class EstudianteRepositorio {
	private static final String NOMBRE_COLECCION = "estudiantes";
	private final MongoCollection<Document> coleccion;
	private List<Estudiante> estudiantes;

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public static String getNombreColeccion() {
		return NOMBRE_COLECCION;
	}

	public MongoCollection<Document> getColeccion() {
		return coleccion;
	}

	public EstudianteRepositorio(MongoDatabase db) {
		this.coleccion = db.getCollection(NOMBRE_COLECCION);
		this.estudiantes=this.read();
	}

	public void save(Estudiante e) {
		Document direccion = new Document("city", e.getAddres().getCity()).append("zip", e.getAddres().getZip())
				.append("street", e.getAddres().getStreet()).append("number", e.getAddres().getNumber());

		List<Document> puntuaciones = new ArrayList<Document>();

		for (Scores record : e.getScores()) {
			Document score = new Document("score", record.getScore()).append("type", record.getType());
			puntuaciones.add(score);
		}

		Document estudiantes = new Document("id", e.getId()).append("name", e.getName())
				.append("notaMedia", e.getNotaMedia()).append("aficiones", e.getAficiones())
				.append("address", direccion).append("scores", puntuaciones);
		coleccion.insertOne(estudiantes);
	}
/*
	public List<Estudiante> read() {
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		Estudiante e = new Estudiante(); 

		FindIterable<Document> documentos = coleccion.find();
		for (Document doc : documentos) {
			Document addresDoc = (Document) doc.get("address");
			if (addresDoc != null) {
				Address dire = new Address(addresDoc.getString("city"), addresDoc.getInteger("zip", 0),
						addresDoc.getString("street"), 
						addresDoc.getInteger("number", 0));

				e.setAddres(dire);

				List<Document> scoresDoc = (List<Document>) doc.get("scores");
				if (scoresDoc != null) {
					List<Scores> scores = new ArrayList<Scores>();
					for (Document document : scoresDoc) {
						scores.add(new Scores(document.getDouble("score"), document.getString("type")));
					}
					e.setScores(scores);
				}

			}
			e.setId(doc.getInteger("id", 0));
			e.setName(doc.getString("name"));
			e.setNotaMedia(doc.getDouble("notaMedia"));
			List<String> aficiones = doc.getList("aficiones", String.class);
			e.setAficiones(aficiones != null ? aficiones : new ArrayList<>());
			estudiantes.add(e);
		}
		return estudiantes;
	}*/
	
	public List<Estudiante> read() {
	    List<Estudiante> estudiantes = new ArrayList<Estudiante>();

	    FindIterable<Document> documentos = coleccion.find();
	    for (Document doc : documentos) {
	        Estudiante e = new Estudiante();

	        Document addresDoc = (Document) doc.get("address");
	        if (addresDoc != null) {
	            Address dire = new Address(
	                addresDoc.getString("city"),
	                addresDoc.getInteger("zip", 0),
	                addresDoc.getString("street"), 
	                addresDoc.getInteger("number", 0) 
	            ); 
	            e.setAddres(dire);
	        }

	        List<Document> scoresDoc = (List<Document>) doc.get("scores");
	        if (scoresDoc != null) {
	            List<Scores> scores = new ArrayList<Scores>();
	            for (Document document : scoresDoc) {
	                Double scoreValue = document.getDouble("score"); 
	                scores.add(new Scores(scoreValue != null ? scoreValue : 0.0,
	                                      document.getString("type")));
	            } 
	            e.setScores(scores);
	        }

	        e.setId(doc.getInteger("id", 0));
	        e.setName(doc.getString("name"));

	        Double notaMedia = doc.getDouble("notaMedia");
	        e.setNotaMedia(notaMedia != null ? notaMedia : 0.0);

	        List<String> aficiones = doc.getList("aficiones", String.class);
	        e.setAficiones(aficiones != null ? aficiones : new ArrayList<>());

	        estudiantes.add(e);
	    }
	    return estudiantes;
	}


	@Override
	public String toString() {
		return "EstudianteRepositorio [coleccion=" + coleccion + "]";
	}



}
