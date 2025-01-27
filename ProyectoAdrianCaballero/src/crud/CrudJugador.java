package crud;

import controller.ControllerAyudas;
import datos.DatosJugador;

public class CrudJugador {
	
	private DatosJugador dt;

	public CrudJugador(DatosJugador dt) {
		this.dt = dt;
	}

	public DatosJugador getDt() {
		return dt;
	}

	public void setDt(DatosJugador dt) {
		this.dt = dt;
	}
	//Tarea de: Álvaro
	//Realizado por: Álvaro
	public void actualizarVida(int vida) {
		dt.getJ().setVida(vida);
	}
	//Tarea de: Álvaro
	//Realizado por: Álvaro y Cristina
	public void activarEstadoArma(int arma) {
		dt.getJ().getArmas()[arma].setStatus(true);
	}
	//Tarea de: Álvaro
	//Realizado por: Álvaro y Cristina
	public void activarEstadoPocion() {
		dt.getJ().getArmas()[3].setStatus(true);
	}
	//Tarea de: Álvaro
	//Realizado por: Álvaro y Cristina
	public void desactivarEstadoPocion() {
		dt.getJ().getArmas()[3].setStatus(false);
	}
	//Tarea de: Álvaro
	//Realizado por: Álvaro y Cristina
	public void establecerPoderPocion(ControllerAyudas a, int dificultad) {
		dt.getJ().getArmas()[3].setMaxDamage(a.establecerDefensaPocion(dificultad));
	}
}
