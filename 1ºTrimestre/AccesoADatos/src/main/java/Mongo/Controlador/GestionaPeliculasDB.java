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
        // 1. Conexión
        MongoDBConexion conexion = new MongoDBConexion();
        MongoDatabase db = conexion.getDb();

        // 2. Servicio
        EstudianteService estudiantesS = new EstudianteService(db);

        // 3. CREATE: guardar estudiante
        Estudiante e12 = new Estudiante( 
            0324,
            "Maria Sanchez",
            10,
            List.of("gimnasio", "nadar","karate"),
            new Address("La Algaba", 30001, "Gran Vía", 12),
            List.of( 
                new Scores(8.5, "exam"),
                new Scores(7.0, "quiz")
            )
        ); 
        estudiantesS.save(e12); 
        System.out.println("✅ Estudiante guardado");

        /*
        // 4. READ: mostrar todos
        System.out.println("📋 Lista de estudiantes:");
        List<Estudiante> estudiantes = estudiantesS.read();
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
        */

        // 5. UPDATE: cambiar nombre y nota media
        estudiantesS.updateNombre(450, "MarioCasas");
        estudiantesS.updateNotaMedia(450, 9.5);
        System.out.println("✏️ Estudiante actualizado");

        // Mostrar después de update
        System.out.println("📋 Después de actualizar:");
        for (Estudiante estudiante : estudiantesS.read()) {
            System.out.println(estudiante);
        }

        /*
        // 6. DELETE: eliminar estudiante
        estudiantesS.delete(0324);
        System.out.println("❌ Estudiante eliminado");

        // Mostrar después de delete
        System.out.println("📋 Después de eliminar:");
        for (Estudiante estudiante : estudiantesS.read()) {
            System.out.println(estudiante);
        }
        */
    }
}
