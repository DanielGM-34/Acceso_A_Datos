package TareaEval.controlador;

import java.util.Collections;
import java.util.List;
import java.util.Map;
 
import Boletin1Modelo.TipoAgente;
import TareaEval.modelo.InteraccionAgente;
import TareaEval.modelo.TipoAgenteEval;
import TareaEval.repositorio.RepositorioInteracciones;
import TareaEval.servicio.ServicioInteracciones;

public class MainApp {

    public static void main(String[] args) {
        InteraccionAgente ia1 = new InteraccionAgente(TipoAgente.HUMANO, "¿Qué hora es?", "Son las 19:11.", 0.3, 10, 95.0);
        InteraccionAgente ia2 = new InteraccionAgente(TipoAgente.IA, "Son las 19:11.", "¿Necesitas algo más?", 0.2, 9, 98.0);
        InteraccionAgente ia3 = new InteraccionAgente(TipoAgente.HUMANO, "Define inteligencia artificial", "¿Qué es la IA?", 0.4, 8, 90.0);
        InteraccionAgente ia4 = new InteraccionAgente(TipoAgente.IA, "Es la simulación de procesos humanos por máquinas.", "¿Quieres un ejemplo?", 0.5, 7, 92.0);
        InteraccionAgente ia5 = new InteraccionAgente(TipoAgente.HUMANO, "¿Cuál es la capital de Japón?", "¿Me puedes decir la capital?", 0.3, 6, 85.0);
        InteraccionAgente ia6 = new InteraccionAgente(TipoAgente.IA, "Tokio.", "¿Te interesa saber más sobre Japón?", 0.2, 11, 99.0);
        InteraccionAgente ia7 = new InteraccionAgente(TipoAgente.HUMANO, "Cuéntame un chiste", "¿Sabes algún chiste?", 0.6, 5, 88.0);
        InteraccionAgente ia8 = new InteraccionAgente(TipoAgente.IA, "¿Por qué los pájaros no usan Facebook? Porque ya tienen Twitter.", "¿Te ha gustado?", 0.4, 12, 97.0);
        InteraccionAgente ia9 = new InteraccionAgente(TipoAgente.HUMANO, "¿Qué es Java?", "Explícame qué es Java.", 0.7, 9, 93.0);
        InteraccionAgente ia10 = new InteraccionAgente(TipoAgente.IA, "Es un lenguaje de programación orientado a objetos.", "¿Quieres ver un ejemplo de código?", 0.5, 10, 96.0);
 
        System.out.println(ia1);
        System.out.println(ia2);
        System.out.println(ia3);
        System.out.println(ia4);
        System.out.println(ia5);
        System.out.println(ia6); 
        System.out.println(ia7);
        System.out.println(ia8); 
        System.out.println(ia9);
        System.out.println(ia10);

        RepositorioInteracciones p9 = new RepositorioInteracciones();
        ServicioInteracciones servicio = new ServicioInteracciones(p9);

        p9.agregaInteraccionARegistro(ia1);
        p9.agregaInteraccionARegistro(ia2);
        p9.agregaInteraccionARegistro(ia3);
        p9.agregaInteraccionARegistro(ia4);
        p9.agregaInteraccionARegistro(ia5);
        p9.agregaInteraccionARegistro(ia6);
        p9.agregaInteraccionARegistro(ia7);
        p9.agregaInteraccionARegistro(ia8);
        p9.agregaInteraccionARegistro(ia9);
        p9.agregaInteraccionARegistro(ia10);

        InteraccionAgente mejor = servicio.obtenerMejorValorada();
        System.out.println("===============");
        System.out.println(ia1.getPorcentajeAcierto());

        servicio.modificarPorcentajeAcierto(0, 100);
        System.out.println(ia1.getPorcentajeAcierto());
 
        System.out.println(mejor);

        System.out.println(servicio.obtenerTiempoMedioPorTipo(TipoAgente.HUMANO));
        System.out.println(servicio.obtenerTiempoMedioPorTipo(TipoAgente.IA));

        System.out.println(servicio.obtenerInteraccionesConAciertoMayorQue(70));
        System.out.println("-----------");

        servicio.exportarInteraccionesOrdenadasPorId("src/main/resources/Interacciones.csv");
        p9.escribeInteraccionesLista(p9.getInteracciones(), "src/main/resources/ListaInteracciones.json");

        List<InteraccionAgente> listaJson = p9.devuelveleInteraccionesLista("src/main/resources/ListaInteracciones.json");
        for (InteraccionAgente interaccionAgente : listaJson) {
            System.out.println(interaccionAgente); 
        }

        System.out.println("ooo");
        servicio.generarResumenEstadisticas("src/main/resources/resumenEstadistica.txt");
 
        List<InteraccionAgente> listaRep = p9.getInteracciones();
        Collections.sort(listaRep);
        p9.grabarFicheroCSV("src/main/resources/salidaOrdenada.csv ", listaRep);

        Map<TipoAgente, List<InteraccionAgente>> agrupacionMapa = servicio.obtenerInteraccionesAgrupadasPorTipo();
        for (TipoAgente tipo : agrupacionMapa.keySet()) {
            System.out.println("Clavecilla: " + tipo.name());
            System.out.println("Lista de interacciones:");
            for (InteraccionAgente interaccion : agrupacionMapa.get(tipo)) {
                System.out.println(interaccion); 
            }
            System.out.println();
        }
    }
}
