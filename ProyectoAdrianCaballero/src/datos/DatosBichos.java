package datos;

import java.util.Arrays;
import model.Bichos;

	//Tarea de: Adrián
	//Realizado por: Adrián
public class DatosBichos {
	
		private Bichos b1=new Bichos ("Debiano", 130, 30, 30, 7, true,false);
		private Bichos b2=new Bichos ("Flexus", 150, 40, 45,15, true,false);
		private Bichos b3=new Bichos ("Ángle", 200, 60, 60,25, true,false);
		private Bichos [] lista1 = {b1, b2, b3};

		
		public Bichos getB1() {
			return b1;
		}

		public void setB1(Bichos b1) {
			this.b1 = b1;
		}

		public Bichos[] getLista1() {
			return lista1;
		}

		public void setLista1(Bichos[] lista1) {
			this.lista1 = lista1;
		}

		public Bichos getB2() {
			return b2;
		}

		public void setB2(Bichos b2) {
			this.b2 = b2;
		}

		public Bichos getB3() {
			return b3;
		}

		public void setB3(Bichos b3) {
			this.b3 = b3;
		}

		@Override
		public String toString() {
			return "ArrayBichos [b1=" + b1 + ", b2=" + b2 + ", b3=" + b3 + ", lista1=" + Arrays.toString(lista1) + "]";
		}
		
		
}
