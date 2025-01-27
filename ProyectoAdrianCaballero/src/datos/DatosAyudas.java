package datos;

	import model.Ayudas;
	//Tarea de: Adrián
	//Realizado por: Adrián
	public class DatosAyudas {

		private static Ayudas vidaP1= new Ayudas(1, "¿Cuál de las siguientes opciones es la forma correcta de declarar un array de enteros en Java?\n"
	            + "\n"
	            + "a) int[] array = new int(5);\n"
	            + "b) int array[] = new int[5];\n"
	            + "c) array int[] = new int[5];\n"
	            + "Introduzca la respuesta.\n", false,"b");//b

	    private static Ayudas vidaP2= new Ayudas(2, "¿Cuál de las siguientes afirmaciones sobre la etiqueta <a> en HTML es correcta?\n"
	            + "\n"
	            + "a) El atributo href de la etiqueta <a> especifica el destino de la acción, ya sea una URL o un archivo.\n"
	            + "b) La etiqueta <a> se utiliza para crear tablas en una página web.\n"
	            + "c) El atributo target=\"_self\" abre el enlace en una nueva ventana o pestaña del navegador.\n"
	            + "Introduzca la respuesta.\n", false,"a"); //a

	    private static Ayudas vidaP3= new Ayudas(3, "¿A qué clase pertenece la dirección IP 192.168.10.5?\n"
	            + "\n"
	            + "a) Clase A\n"
	            + "b) Clase B\n"
	            + "c) Clase C\n"
	            + "Introduzca la respuesta.\n", false,"c"); //c
	    
	    
	    private static Ayudas defensap1= new Ayudas(1, "¿Qué ocurre si intentas acceder a un índice fuera de los límites de un Array en Java?\n"
	    		+ "\n"
	    		+ "a) Se genera una excepción de tipo ArrayIndexOutOfBoundsException.\n"
	    		+ "b) El programa devuelve un valor por defecto, como 0 o null.\n"
	    		+ "c) El programa se detiene sin mostrar ningún mensaje de error.\n"
	            + "Introduzca la respuesta.\n", false,"a");

	    private static Ayudas defensap2= new Ayudas(2, "¿Qué etiqueta HTML se utiliza para crear un enlace en una página web?\n"
	    		+ "\n"
	    		+ "a) <link>\n"
	    		+ "b) <a>\n"
	    		+ "c) <href>", false,"b"); 

	    private static Ayudas defensap3= new Ayudas(3, "¿Qué característica distingue principalmente a los discos HDD de los SSD?\n"
	    		+ "\n"
	    		+ "a) Los HDD son más rápidos que los SSD.\n"
	    		+ "b) Los HDD utilizan partes móviles, mientras que los SSD no.\n"
	    		+ "c) Los HDD son más caros que los SSD.\n"
	            + "Introduzca la respuesta.\n", false,"b"); 
	    
	    
	    private static Ayudas[] listaVida = new Ayudas[] { vidaP1, vidaP2, vidaP3 };
	    private static Ayudas[] listaDefensa = new Ayudas[] {defensap1, defensap2, defensap3};

		public Ayudas[] getListaVida() {
			return listaVida;
		}

		public  void setListaVida(Ayudas[] listaVida) {
			DatosAyudas.listaVida = listaVida;
		}

		public  Ayudas getVidaP1() {
			return vidaP1;
		}

		public  void setVidaP1(Ayudas vidaP1) {
			DatosAyudas.vidaP1 = vidaP1;
		}

		public  Ayudas getVidaP2() {
			return vidaP2;
		}

		public  void setVidaP2(Ayudas vidaP2) {
			DatosAyudas.vidaP2 = vidaP2;
		}

		public  Ayudas getVidaP3() {
			return vidaP3;
		}

		public static void setVidaP3(Ayudas vidaP3) {
			DatosAyudas.vidaP3 = vidaP3;
		}

		public Ayudas[] getListaDefensa() {
			return listaDefensa;
		}

		public static void setListaDefensa(Ayudas[] listaDefensa) {
			DatosAyudas.listaDefensa = listaDefensa;
		}

	}
