package datos;

import java.util.Arrays;

import model.Armas;

	//Tarea de: Adrián
	//Realizado por: Adrián
public class DatosArmas {
	
	private  Armas a1 = new Armas("bola de fuego.", true, 20,2);
	private  Armas a2 = new Armas("espada encantada.", false, 36,12);
	private Armas a3 = new Armas("arco encantado.", false, 50,20);
	private  Armas a4 = new Armas("poción arrojadiza quita-defensa.", false, 0,0);

	private  Armas[] lista2 = new Armas[] {a1, a2, a3, a4} ;

	

	public Armas getA4() {
		return a4;
	}

	public void setA4(Armas a4) {
		this.a4 = a4;
	}

	public Armas getA1() {
		return a1;
	}

	public void setA1(Armas a1) {
		this.a1 = a1;
	}

	public Armas getA2() {
		return a2;
	}

	public void setA2(Armas a2) {
		this.a2 = a2;
	}

	public Armas getA3() {
		return a3;
	}

	public void setA3(Armas a3) {
		this.a3 = a3;
	}

	

	public Armas[] getLista2() {
		return lista2;
	}

	public void setLista2(Armas[] lista2) {
		this.lista2 = lista2;
	}

	@Override
	public String toString() {
		return "ArrayArmas [a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + ", lista2=" + Arrays.toString(lista2) + "]";
	}
}
