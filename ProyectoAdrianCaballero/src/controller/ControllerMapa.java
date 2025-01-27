package controller;

import datos.DatosJugador;
import datos.DatosMapa;
import datos.DatosBichos;
import crud.CrudMapa;

public class ControllerMapa {

	//Tarea de: Cristina y Álvaro
	//Realizado por: Cristina y Álvaro
	public void cambiarPosMapa1(String entrada, DatosMapa m, DatosJugador datJug) {
		CrudMapa crud = new CrudMapa(m);
		int uno = 1, fila, colum;
		fila = datJug.getJ().getPosX();
		colum = datJug.getJ().getPosY();
		String per = "😁", vacio = " ";
		String arriba = "w", abajo = "s", derecha = "d", izquierda = "a";
		m.getVista1().getVista()[fila][colum] = vacio;
		if (entrada.equalsIgnoreCase(arriba)) {
			if (!m.getVista1().getVista()[fila - uno][colum].equals("⛰")
					&& !m.getVista1().getVista()[fila - uno][colum].equals("👿")
					&& !m.getVista1().getVista()[fila - uno][colum].equals("😈")
					&& !m.getVista1().getVista()[fila - uno][colum].equals("💀")
					&& !m.getVista1().getVista()[fila - uno][colum].equals("❤️")
					&& !m.getVista1().getVista()[fila - uno][colum].equals("💎")
					&& !m.getVista1().getVista()[fila - uno][colum].equals("__")) {
				fila--;
				m.getVista1().getVista()[fila + uno][colum] = "⚪";
			}
		} else if (entrada.equalsIgnoreCase(abajo)) {
			if (!m.getVista1().getVista()[fila + uno][colum].equals("⛰")
					&& !m.getVista1().getVista()[fila + uno][colum].equals("👿")
					&& !m.getVista1().getVista()[fila + uno][colum].equals("😈")
					&& !m.getVista1().getVista()[fila + uno][colum].equals("💀")
					&& !m.getVista1().getVista()[fila + uno][colum].equals("❤️")
					&& !m.getVista1().getVista()[fila + uno][colum].equals("💎")
					&& !m.getVista1().getVista()[fila + uno][colum].equals("__")) {
				fila++;
				m.getVista1().getVista()[fila - uno][colum] = "⚪";
			}
		} else if (entrada.equalsIgnoreCase(derecha)) {

			if (!m.getVista1().getVista()[fila][colum + uno].equals("⛰")
					&& !m.getVista1().getVista()[fila][colum + uno].equals("👿")
					&& !m.getVista1().getVista()[fila][colum + uno].equals("😈")
					&& !m.getVista1().getVista()[fila][colum + uno].equals("💀")
					&& !m.getVista1().getVista()[fila][colum + uno].equals("❤️")
					&& !m.getVista1().getVista()[fila][colum + uno].equals("💎")
					&& !m.getVista1().getVista()[fila][colum + uno].equals("__")) {
				colum++;
				m.getVista1().getVista()[fila][colum - uno] = "⚪";
			}
		} else if (entrada.equalsIgnoreCase(izquierda)) {
			if (!m.getVista1().getVista()[fila][colum - uno].equals("⛰")
					&& !m.getVista1().getVista()[fila][colum - uno].equals("👿")
					&& !m.getVista1().getVista()[fila][colum - uno].equals("😈")
					&& !m.getVista1().getVista()[fila][colum - uno].equals("💀")
					&& !m.getVista1().getVista()[fila][colum - uno].equals("❤️")
					&& !m.getVista1().getVista()[fila][colum - uno].equals("💎")
					&& !m.getVista1().getVista()[fila][colum - uno].equals("__")) {
				colum--;
				m.getVista1().getVista()[fila][colum + uno] = "⚪";
			}
		}
		m.getVista1().getVista()[fila][colum] = per;
		crud.actualizarPosicionMapa1(datJug, fila, colum);
	}

	//Tarea de: Álvaro
	//Realizado por: Álvaro
	public void cambiarPosMapa2(String entrada, DatosMapa m, DatosJugador datJug) {
		CrudMapa crud = new CrudMapa(m);
		int uno = 1, fila, colum;
		fila = datJug.getJ().getPosX2();
		colum = datJug.getJ().getPosY2();
		String per = "😁", vacio = " ";
		String arriba = "w", abajo = "s", derecha = "d", izquierda = "a";
		/*
		 * Filas ancho [filas][colum] Columnas alto
		 */
		m.getVista2().getVista()[fila][colum] = vacio;
		if (entrada.equalsIgnoreCase(arriba)) {
			if (!m.getVista2().getVista()[fila - uno][colum].equals("⛰")
					&& !m.getVista2().getVista()[fila - uno][colum].equals("🌋")
					&& !m.getVista2().getVista()[fila - uno][colum].equals("👹")
					&& !m.getVista2().getVista()[fila - uno][colum].equals("__")) {
				fila--;
				m.getVista2().getVista()[fila + uno][colum] = "⚪";
			}
		} else if (entrada.equalsIgnoreCase(abajo)) {
			if (!m.getVista2().getVista()[fila + uno][colum].equals("⛰")
					&& !m.getVista2().getVista()[fila + uno][colum].equals("🌋")
					&& !m.getVista2().getVista()[fila + uno][colum].equals("👹")
					&& !m.getVista2().getVista()[fila + uno][colum].equals("__")) {
				fila++;
				m.getVista2().getVista()[fila - uno][colum] = "⚪";
			}
		} else if (entrada.equalsIgnoreCase(derecha)) {
			if (!m.getVista2().getVista()[fila][colum + uno].equals("⛰")
					&& !m.getVista2().getVista()[fila][colum + uno].equals("🌋")
					&& !m.getVista2().getVista()[fila][colum + uno].equals("👹")
					&& !m.getVista2().getVista()[fila][colum + uno].equals("__")) {
				colum++;
				m.getVista2().getVista()[fila][colum - uno] = "⚪";
			}
		} else if (entrada.equalsIgnoreCase(izquierda)) {
			if (!m.getVista2().getVista()[fila][colum - uno].equals("⛰")
					&& !m.getVista2().getVista()[fila][colum - uno].equals("🌋")
					&& !m.getVista2().getVista()[fila][colum - uno].equals("👹")
					&& !m.getVista2().getVista()[fila][colum - uno].equals("__")) {
				colum--;
				m.getVista2().getVista()[fila][colum + uno] = "⚪";
			}
		}
		m.getVista2().getVista()[fila][colum] = per;
		crud.actualizarPosicionMapa2(datJug, fila, colum);
		// Mostrar psocion
		// Cambiarla si es necesario
	}

	//Tarea de: Álvaro
	//Realizado por: Álvaro
	public void desbloquearMapa(DatosMapa m,DatosBichos dt) {
		if (!dt.getB1().isStatus() && !dt.getB2().isStatus()) {
			for (int i = 0; i < 3; i++) {
				m.getVista1().getVista()[0][9 + i] = "__";
			}

		}
	}

	//Tarea de: Álvaro
	//Realizado por: Álvaro
	public int cambiarDeMapa(String entrada, DatosMapa m, DatosJugador datJug) {
		int mapa2 = 0;
		int fila, colum, fila2, colum2, uno = 1;
		String arriba = "w", abajo = "s";
		fila = datJug.getJ().getPosX();
		colum = datJug.getJ().getPosY();
		fila2 = datJug.getJ().getPosX2();
		colum2 = datJug.getJ().getPosY2();

		if (entrada.equalsIgnoreCase(abajo)) {
			if (m.getVista2().getVista()[fila2 + uno][colum2].equals("__")) {
				mapa2 = 1;
			}
		}

		if (entrada.equalsIgnoreCase(arriba)) {
			if (m.getVista1().getVista()[fila - uno][colum].equals("__")) {
				mapa2 = 2;
			}
		}

		return mapa2;
	}

	//Tarea de: Álvaro
	//Realizado por: Álvaro
	public void pintarBichoMuertoMapa(DatosMapa m, DatosBichos dt) {

		if (!dt.getB1().isStatus()) {
			m.getVista1().getVista()[7][17] = "💀";
		}

		if (!dt.getB2().isStatus()) {
			m.getVista1().getVista()[6][10] = "💀";
		}

		if (!dt.getB3().isStatus()) {
			m.getVista2().getVista()[3][5] = "💀";
		}
	}
}
