package Mongo;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
public class ConexionMongo {
   public static void main(String[] args) {
       //String uri = "mongodb+srv://usuario:contraseña@cluster0.abcd.mongodb.net/";
       String uri ="mongodb+srv://miUsuario:admin@daniel.wxaacev.mongodb.net/?appName=Daniel";
       try (MongoClient mongoClient = MongoClients.create(uri)) {
           MongoDatabase db = mongoClient.getDatabase("peliculas");
           
           
           MongoCollection<Document> coleccion = db.getCollection("estudiantes");
           /*
           Document libro = new Document("titulo", "1984")
                   .append("autor", "George Orwell")
                   .append("año", 1949);
           coleccion.insertOne(libro);
           */
           System.out.println("Documento insertado correctamente");
       }
   }
}
