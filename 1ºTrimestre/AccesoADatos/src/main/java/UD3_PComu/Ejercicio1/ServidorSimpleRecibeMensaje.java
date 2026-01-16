package UD3_PComu.Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSimpleRecibeMensaje {
    public static void main(String[] args) {

        int puerto = 6000;

        try (ServerSocket servidor = new ServerSocket(puerto)) {

            System.out.println("Servidor escuchando en el puerto " + puerto);

            Socket cliente = servidor.accept();
            System.out.println("Cliente conectado desde: " + cliente.getInetAddress());

            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(cliente.getInputStream()));

            PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);
            
            String mensaje = entrada.readLine();

            while (mensaje != null && !mensaje.equalsIgnoreCase("FIN")) {

                System.out.println("Cliente dice: " + mensaje);

                salida.println("Servidor recibió: " + mensaje.toUpperCase());

                mensaje = entrada.readLine();
            }

            System.out.println("Cliente ha cerrado la comunicación.");
            salida.println("Conexión finalizada por el servidor.");

            cliente.close();

        } catch (IOException e) {
            System.err.println("Error en el servidor: " + e.getMessage());
        }
    }
}
