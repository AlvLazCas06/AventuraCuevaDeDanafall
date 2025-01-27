package model;

import java.util.Arrays;

public class Mapa {

	//Tarea de: Cristina
	//Realizado por: Cristina
	private String vista[][];
	
	public Mapa(String[][] vista) {
		super();
		this.vista = vista;
	}

	@Override
	public String toString() {
		return "Mapa [vista=" + Arrays.toString(vista) + "]";
	}

	public String[][] getVista() {
		return vista;
	}

	public void setVista(String[][] vista) {
		this.vista = vista;
	}

	}