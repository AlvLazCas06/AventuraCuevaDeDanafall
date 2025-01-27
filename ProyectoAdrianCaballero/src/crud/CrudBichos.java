package crud;

import datos.DatosBichos;

public class CrudBichos {
	
	private DatosBichos dt;

	public DatosBichos getDt() {
		return dt;
	}

	public void setDt(DatosBichos dt) {
		this.dt = dt;
	}

	public CrudBichos(DatosBichos dt) {
		this.dt = dt;
	}
	//Tarea de: Álvaro
	//Realizado por: Álvaro
	public void actualizarVida(int bicho, int danoAEnemigo) {
		int uno = 1;
		dt.getLista1()[bicho - uno].setHealth(danoAEnemigo);
	}
	//Tarea de: Álvaro
	//Realizado por: Álvaro
	public void actualizarDefensa(int bicho, int nuevaDefensa) {
		int uno = 1;
		dt.getLista1()[bicho - uno].setDefense(nuevaDefensa);
	}
	//Tarea de: Álvaro
	//Realizado por: Álvaro
	public void actualizarBatalla(int bicho, boolean batalla) {
		int uno = 1;
		dt.getLista1()[bicho - uno].setEnLucha(batalla);
	}
	//Tarea de: Álvaro
	//Realizado por: Álvaro
	public void actualizarVivo(int bicho, boolean vivo) {
		int uno = 1;
		dt.getLista1()[bicho - uno].setStatus(vivo);
	}
}
