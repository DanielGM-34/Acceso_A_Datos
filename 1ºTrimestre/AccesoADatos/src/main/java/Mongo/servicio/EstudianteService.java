package Mongo.servicio;

import java.util.List;

import com.mongodb.client.MongoDatabase;

import Mongo.modelo.Address;
import Mongo.modelo.Estudiante;
import Mongo.repositorio.EstudianteRepositorio;

public class EstudianteService {
    private final EstudianteRepositorio repo;

    public EstudianteRepositorio getRepo() {
        return repo;
    }

    // El servicio recibe MongoDatabase y construye el repositorio
    public EstudianteService(MongoDatabase db) {
        this.repo = new EstudianteRepositorio(db);
    }

    // ---------------- CREATE ----------------
    public void save(Estudiante e) { 
        // Aquí podrías añadir validaciones, reglas de negocio, etc.
        repo.save(e);
    }

    // ---------------- READ ----------------
    public List<Estudiante> read() {
        return repo.read(); 
    }

    // ---------------- UPDATE ----------------
    public void updateNotaMedia(int id, double nuevaNotaMedia) {
        repo.updateNotaMedia(id, nuevaNotaMedia);
    }

    public void updateNombre(int id, String nuevoNombre) {
        repo.updateNombre(id, nuevoNombre);
    }

    public void updateDireccion(int id, Address nuevaDireccion) {
        repo.updateDireccion(id, nuevaDireccion);
    }

    // ---------------- DELETE ----------------
    public void delete(int id) {
        repo.delete(id);
    }

    @Override
    public String toString() {
        return "EstudianteService [repo=" + repo + "]";
    }
}
