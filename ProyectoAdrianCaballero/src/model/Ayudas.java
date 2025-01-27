package model;

public class Ayudas {
	
	//Tarea de: Adrián
	//Realizado por: Adrián
	private int dificultad;
    private String contenido;
    private boolean acertada;
    private String resultado;

    public Ayudas(int dificultad, String contenido, boolean acertada, String resultado) {
        super();
        this.dificultad = dificultad;
        this.contenido = contenido;
        this.acertada = acertada;
        this.resultado = resultado;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isAcertada() {
        return acertada;
    }

    public void setAcertada(boolean acertada) {
        this.acertada = acertada;
    }
    
    public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

    @Override
    public String toString() {
        return "Ayudas [dificultad=" + dificultad + ", contenido=" + contenido + ", respondida="
                + ", acertada=" + acertada + "]";
    }


}
