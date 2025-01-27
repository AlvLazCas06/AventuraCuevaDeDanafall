package controller;

public class ControllerAyudas {
	//Tarea de: Adrián
	//Realizado por: Adrián
	public boolean comprobarRespuesta(String respuesta, String respuestaCorrecta, int dificultad) {
		boolean resultado = false;
		if (respuesta.equalsIgnoreCase(respuestaCorrecta)) {
			resultado = true;
		}
		return resultado;
	}

	//Tarea de: Adrián
	//Realizado por: Adrián
	public int sumarVida(int dificultad) {
		int vidaDadaBase = 0;
		switch (dificultad) {
		case 1:
			vidaDadaBase = 40;
			break;

		case 2:
			vidaDadaBase = 70;
			break;

		case 3:
			vidaDadaBase = 100;
			break;
		}
		return vidaDadaBase;
	}

	//Tarea de: Adrián
	//Realizado por: Adrián
	public int establecerDefensaPocion(int dificultad) {
		int defensa = 0;
		switch (dificultad) {
		case 1:
			defensa = 15;
			break;

		case 2:
			defensa = 30;
			break;

		case 3:
			defensa = 40;
			break;
		} 
		return defensa;
	}

}
