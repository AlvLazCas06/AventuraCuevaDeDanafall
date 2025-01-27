package controller;

public class ControllerArmas {
	//Tarea de: Adrián
	//Realizado por: Adrián y Cristina
	public int calcularNuevaDefensa (int defensaEnemigo, int valorPocion) {
	    int resultado;
	    if(valorPocion>defensaEnemigo) {
	        resultado=0;
	    }else{
	        resultado =defensaEnemigo-valorPocion;
	        }
	    return resultado;
	}
	
}
