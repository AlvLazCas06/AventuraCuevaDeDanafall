package datos;

import model.Jugador;

	//Tarea de: Álvaro
	//Realizado por: Álvaro
public class DatosJugador {
	DatosArmas d=new DatosArmas();
	
	private Jugador j = new Jugador("Moepi", 120, 65, d.getLista2(), true, 13, 3, 12, 5);
	
	public DatosJugador() {
		super();
	}
	public Jugador getJ() {
		return j;
	}
	public void setJ(Jugador j) {
		this.j = j;
	}
	@Override
	public String toString() {
		return "DatosJugador [j=" + j + "]";
	}
}
