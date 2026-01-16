package UD3_PComu.Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket; 
import java.util.Scanner;

public class ClienteSimpleMens {
    public static void main(String[] args) {

        String host = "localhost";
        int puerto = 6000;
        Scanner  sc = new Scanner(System.in);
        Socket socket = null;


        try {
            // 1. Conectar con el servidor
             socket = new Socket(host, puerto);
            System.out.println("Conectado al servidor.");

            // 2. Flujos de entrada y salida 
            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
            String mensaje = ""; 

            while ( mensaje!=null && !mensaje.equalsIgnoreCase("fin")) {
                System.out.print("Escribe mensaje: ");
                mensaje = sc.nextLine();

                salida.println(mensaje);  

            }

            System.out.println("Cliente finalizado.");

            socket.close();

        } catch (IOException e) {
            System.err.println("Error en el cliente: " + e.getMessage());
        }
    }
}
