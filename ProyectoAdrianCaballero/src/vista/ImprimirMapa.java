package vista;

import datos.DatosMapa;

public class ImprimirMapa {
	
	//Tarea de: Cristina
	//Realizado por: Cristina
	public void imprimirMapa1 (DatosMapa datosMap) {
		for (int i = 0; i < datosMap.getVista1().getVista().length; i++) {
			for (int j = 0; j < datosMap.getVista1().getVista()[i].length; j++) {
				System.out.print(datosMap.getVista1().getVista()[i][j]);
			}
			System.out.println();
		}
	}
	
	//Tarea de: Cristina
	//Realizado por: Cristina
	public void imprimirMapa2 (DatosMapa datosMap) {
		for (int i = 0; i < datosMap.getVista2().getVista().length; i++) {
			for (int j = 0; j < datosMap.getVista2().getVista()[i].length; j++) {
				System.out.print(datosMap.getVista2().getVista()[i][j]);
			}
			System.out.println();
		}
		}
	
}
