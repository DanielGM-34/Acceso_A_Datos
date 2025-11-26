package Mongo.Controlador;

import java.util.List;

import com.mongodb.client.MongoDatabase;

import Mongo.config.MongoDBConexion;
import Mongo.modelo.Address;
import Mongo.modelo.Estudiante;
import Mongo.modelo.Scores;
import Mongo.servicio.EstudianteService;

public class GestionaPeliculasDB {
	public static void main(String[] args) {
		MongoDBConexion conexion = new MongoDBConexion();
		MongoDatabase db = conexion.getDb();
		EstudianteService esudiantesS = new EstudianteService(db);
		Estudiante e1 = new Estudiante(
			    23,
			    "Maria Peláez",
			    7.78,
			    List.of("leer", "nadar"),
			    new Address("Murcia", 30001, "Gran Vía", 12),
			    List.of(
			        new Scores(8.5, "exam"),
			        new Scores(7.0, "quiz")
			    )
			);
		esudiantesS.save(e1); 
		List<Estudiante> estudiantes = esudiantesS.getRepo().getEstudiantes();
		 
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante);
		}
	
		
//TODO Aquí creamos los diferentes servicios a partir del objeto db	
	}

}
