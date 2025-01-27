package utilidades;

import java.util.Random;

public class Aleatorio {
	
	//Alvaro
	public int generarAleatorio(int hasta,int desde) {
		Random rnd = new Random(System.nanoTime());
		return rnd.nextInt(hasta - desde + 1) + desde;
	}
	
}
