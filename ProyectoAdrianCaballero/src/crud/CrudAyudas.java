package crud;

import datos.DatosAyudas;

public class CrudAyudas {
	private DatosAyudas dt;

	public CrudAyudas(DatosAyudas dt) {
		this.dt = dt;
	}

	public DatosAyudas getDt() {
		return dt;
	}

	public void setDt(DatosAyudas dt) {
		this.dt = dt;
	}
	//Tarea de: Álvaro
	//Realizado por: Álvaro
	public void acertarPreguntaVida(int dificultad) {
		int uno = 1;
		dt.getListaVida()[dificultad - uno].setAcertada(true);
	}
	
	//Tarea de: Álvaro
	//Realizado por: Álvaro
	public void acertarPreguntaDefensa(int dificultad) {
		int uno = 1;
		dt.getListaDefensa()[dificultad - uno].setAcertada(true);
	}
	
}
