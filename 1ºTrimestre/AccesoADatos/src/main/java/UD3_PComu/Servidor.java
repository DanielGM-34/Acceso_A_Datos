package UD3_PComu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {

        int puerto = 6000;
        ServerSocket servidor = null;
        Socket clienteConectado = null;

        try {
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor escuchando en el puerto " + puerto);

            clienteConectado = servidor.accept();
            System.out.println("Cliente conectado desde: " + clienteConectado.getInetAddress());

            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(clienteConectado.getInputStream()));

            PrintWriter salida = new PrintWriter(clienteConectado.getOutputStream(), true);

            String mensaje = "";

            while (mensaje != null && !mensaje.equalsIgnoreCase("FIN")) {

                mensaje = entrada.readLine();

                if (mensaje == null || mensaje.equalsIgnoreCase("FIN")) {
                    salida.println("Conexión finalizada por el cliente.");
                } else {
                    System.out.println("Cliente dice: " + mensaje.toLowerCase());
                    salida.println("Servidor recibió: " + mensaje.toUpperCase());
                }
            }

        } catch (IOException e) {
            System.err.println("Error en el servidor: " + e.getMessage());
            e.printStackTrace();

        } finally {
            try {
                if (clienteConectado != null)
                    clienteConectado.close();
                if (servidor != null)
                    servidor.close();

                System.out.println("Recursos cerrados y servidor finalizado.");

            } catch (IOException e) {
                System.err.println("Error al cerrar sockets: " + e.getMessage());
            }
        }
    }
}
