package Boletin1Servicio;

import java.time.LocalDate;

import Boletin1Excepcion.ConversacionException;
import Boletin1Modelo.Conversacion;
import Boletin1Modelo.TipoAgente;
import Boletin1Repositorio.RepositorioConversaciones;

public class ServicioConversacionesImpl implements IServicioConversaciones {
	RepositorioConversaciones repoConvers = new RepositorioConversaciones();

	@Override
	public void registraNuevaConveracion(TipoAgente tipo, String pregunta, String respuesta) {
		repoConvers.agregaConversacion(tipo, pregunta, respuesta);
		// TODO Auto-generated method stub
	}

	@Override
	public Conversacion getRecuperaConversacion(TipoAgente tipo, String pregunta, LocalDate fecha) {
		// TODO Auto-generated method stub
		Conversacion p = null;
		try {
			p = repoConvers.getConversacion(fecha, tipo, pregunta);
		} catch (ConversacionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} 
		return p;
	}

	@Override
	public boolean eliminaConversacion(LocalDate fecha, TipoAgente tipo) throws ConversacionException {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean incrementaNumeroValoraciones(LocalDate fecha, TipoAgente tipo, String pregunta) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getValoracionMediaParaHumanos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getValoracionMedidaParaBots() {
		// TODO Auto-generated method stub
		return 0;
	}

}
