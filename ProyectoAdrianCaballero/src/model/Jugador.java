package model;

import java.util.Arrays;

	//Tarea de: Álvaro
	//Realizado por: Álvaro
public class Jugador {
	private String nombre;
	private int vida;
	private int defensa;
	private Armas armas[];
	private boolean status;
	private int posX;
	private int posY;
	private int posX2;
	private int posY2;

	public Jugador(String nombre, int vida, int defensa, Armas[] armas, boolean status, int posX, int posY, int posX2,
			int posY2) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.defensa = defensa;
		this.armas = armas;
		this.status = status;
		this.posX = posX;
		this.posY = posY;
		this.posX2 = posX2;
		this.posY2 = posY2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	public Armas[] getArmas() {
		return armas;
	}

	public void setArmas(Armas[] armas) {
		this.armas = armas;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public int getPosX2() {
		return posX2;
	}

	public void setPosX2(int posX2) {
		this.posX2 = posX2;
	}

	public int getPosY2() {
		return posY2;
	}

	public void setPosY2(int posY2) {
		this.posY2 = posY2;
	}

	public String toString() {
		return "Jugador [nombre=" + nombre + ", vida=" + vida + ", defensa=" + defensa + ", armas="
				+ Arrays.toString(armas) + ", status=" + status + ", posX=" + posX + ", posY=" + posY + ", posX2="
				+ posX2 + ", posY2=" + posY2 + "]";
	}
	
}
