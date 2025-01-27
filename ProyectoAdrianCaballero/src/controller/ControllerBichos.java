package controller;

import datos.DatosJugador;
import model.Bichos;
import utilidades.Aleatorio;

public class ControllerBichos {
	
	//Tarea de: Cristina
	//Realizado por: Cristina
	public int atacarBicho (Bichos b,int vida,DatosJugador j) {
        Aleatorio a=new Aleatorio();
        int dano=0,hasta=100,desde=1;
        int numero=a.generarAleatorio(hasta,desde);

        if(numero>=j.getJ().getDefensa()) {
            dano=a.generarAleatorio(b.getMaxAttack(), b.getMinAttack());
            if(dano==b.getMaxAttack()) {
                dano+=5;
            }
        }
        vida=vida-dano;
        if (vida<0) {
            vida=0;
        }
        return vida;
    }
	
	//Tarea de: Cristina
	//Realizado por: Cristina
	public void verDanoBicho (int vida,int dano) {
		int menos=vida-dano;
		if (vida==dano) {
			System.out.println("¡El enemigo ha fallado el ataque!");
		}else {
			System.out.println("¡El enemigo te ha quitado "+menos+" puntos de vida!");
		}
	}
	
}
