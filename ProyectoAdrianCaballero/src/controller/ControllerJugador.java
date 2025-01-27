package controller;
import model.Armas;
import model.Bichos;
import utilidades.Aleatorio;
import datos.DatosJugador;
import datos.DatosMapa;
public class ControllerJugador {
	
	
	//Tarea de: Álvaro
	//Realizado por: Álvaro
	public int accederPelea(String entrada, DatosMapa m, DatosJugador datJug) {
		int uno = 1,bicho=0,fila,colum, fila2, colum2;
		fila=datJug.getJ().getPosX();
		colum=datJug.getJ().getPosY();
		fila2=datJug.getJ().getPosX2();
		colum2=datJug.getJ().getPosY2();
		String arriba = "w", abajo = "s", derecha = "d", izquierda = "a";
		
		//Primer bicho
		if (entrada.equalsIgnoreCase(arriba)) {
			if (m.getVista1().getVista()[fila - uno][colum].equals("👿")) {
				bicho=1;
			}
		} else if (entrada.equalsIgnoreCase(abajo)) {
			if (m.getVista1().getVista()[fila + uno][colum].equals("👿")) {
				bicho=1;
			}
		} else if (entrada.equalsIgnoreCase(derecha)) {

			if (m.getVista1().getVista()[fila][colum + uno].equals("👿")) {
				bicho=1;
			}
		} else if (entrada.equalsIgnoreCase(izquierda)) {
			if (m.getVista1().getVista()[fila][colum - uno].equals("👿")) {
				bicho=1;
			}
		}
		
		//Segundo bicho
		if (entrada.equalsIgnoreCase(arriba)) {
			if (m.getVista1().getVista()[fila - uno][colum].equals("😈")) {
				bicho=2;
			}
		} else if (entrada.equalsIgnoreCase(abajo)) {
			if (m.getVista1().getVista()[fila + uno][colum].equals("😈")) {
				bicho=2;
			}
		} else if (entrada.equalsIgnoreCase(derecha)) {

			if (m.getVista1().getVista()[fila][colum + uno].equals("😈")) {
				bicho=2;
			}
		} else if (entrada.equalsIgnoreCase(izquierda)) {
			if (m.getVista1().getVista()[fila][colum - uno].equals("😈")) {
				bicho=2;
			}
		}
		
		//Tercer bicho
		if (entrada.equalsIgnoreCase(arriba)) {
			if (m.getVista2().getVista()[fila2 - uno][colum2].equals("👹")) {
				bicho=3;
			}
		} else if (entrada.equalsIgnoreCase(abajo)) {
			if (m.getVista2().getVista()[fila2 + uno][colum2].equals("👹")) {
				bicho=3;
			}
		} else if (entrada.equalsIgnoreCase(derecha)) {

			if (m.getVista2().getVista()[fila2][colum2 + uno].equals("👹")) {
				bicho=3;
			}
		} else if (entrada.equalsIgnoreCase(izquierda)) {
			if (m.getVista2().getVista()[fila2][colum2 - uno].equals("👹")) {
				bicho=3;
			}
		}

		return bicho;
	}
	
	//Tarea de: Cristina
	//Realizado por: Cristina
	public int atacarJugador (Bichos enemigo,int opcion) {
		
		int dano=0,hasta=100,desde=1;
		
		Aleatorio a=new Aleatorio();
		DatosJugador j=new DatosJugador();
		Armas armaMano=new Armas();
		
		int numero=a.generarAleatorio(hasta,desde);
		int vidaEnemigo=enemigo.getHealth();
		
		if (opcion != 0) {
			armaMano=j.getJ().getArmas()[opcion-1];
		}
		
		if(numero>=enemigo.getDefense()) {
			dano=a.generarAleatorio(armaMano.getMaxDamage(),armaMano.getMinDamage());
			if(dano==armaMano.getMaxDamage()) {
				dano+=5;
			}
		}
		vidaEnemigo=vidaEnemigo-dano;
		if (vidaEnemigo<0) {
			vidaEnemigo=0;
		}

		return vidaEnemigo;
	}
	
	//Tarea de: Cristina
	//Realizado por: Cristina
	public void verDanoJug (int vida,int dano) {
		int menos;
		menos=vida-dano;
		if (vida==dano) {
			System.out.println("¡Has fallado el ataque!");
		}else {
			System.out.println("¡Le has quitado "+menos+" puntos de vida al enemigo!");
		}
	}
	
	//Tarea de: Adrián
	//Realizado por: Adrián
		public int accederAyudas(String entrada, DatosMapa m, DatosJugador datJug, int dificultad) {
			int uno = 1, fila, colum, ayuda = 0;
			fila = datJug.getJ().getPosX();
			colum = datJug.getJ().getPosY();
			String arriba = "w", abajo = "s", derecha = "d", izquierda = "a";

			if (entrada.equalsIgnoreCase(arriba)) {
				if (m.getVista1().getVista()[fila - uno][colum].equals("❤️")) {
					ayuda = 1;
				}
			} else if (entrada.equalsIgnoreCase(abajo)) {
				if (m.getVista1().getVista()[fila + uno][colum].equals("❤️")) {
					ayuda = 1;
				}
			} else if (entrada.equalsIgnoreCase(derecha)) {

				if (m.getVista1().getVista()[fila][colum + uno].equals("❤️")) {
					ayuda = 1;
				}
			} else if (entrada.equalsIgnoreCase(izquierda)) {
				if (m.getVista1().getVista()[fila][colum - uno].equals("❤️")) {
					ayuda = 1;
				}

			}

			if (entrada.equalsIgnoreCase(arriba)) {
				if (m.getVista1().getVista()[fila - uno][colum].equals("💎")) {
					ayuda = 2;
				}
			} else if (entrada.equalsIgnoreCase(abajo)) {
				if (m.getVista1().getVista()[fila + uno][colum].equals("💎")) {
					ayuda = 2;
				}
			} else if (entrada.equalsIgnoreCase(derecha)) {

				if (m.getVista1().getVista()[fila][colum + uno].equals("💎")) {
					ayuda = 2;
				}
			} else if (entrada.equalsIgnoreCase(izquierda)) {
				if (m.getVista1().getVista()[fila][colum - uno].equals("💎")) {
					ayuda = 2;
				}
			}
			return ayuda;
		}
	
}
