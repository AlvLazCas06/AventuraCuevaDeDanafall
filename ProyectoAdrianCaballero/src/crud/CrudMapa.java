package crud;

import datos.DatosMapa;
import datos.DatosJugador;

public class CrudMapa {
	
	private DatosMapa dt;
	
	public CrudMapa(DatosMapa dt) {
		this.dt = dt;
	}

	public DatosMapa getDt() {
		return dt;
	}

	public void setDt(DatosMapa dt) {
		this.dt = dt;
	}
	//Tarea de: Álvaro
	//Realizado por: Álvaro
	public void actualizarPosicionMapa1(DatosJugador dtJ, int fila, int colum) {
		dtJ.getJ().setPosX(fila);
		dtJ.getJ().setPosY(colum);
	}
	//Tarea de: Álvaro
	//Realizado por: Álvaro
	public void actualizarPosicionMapa2(DatosJugador dtJ, int fila, int colum) {
		dtJ.getJ().setPosX2(fila);
		dtJ.getJ().setPosY2(colum);
	}
	
}
