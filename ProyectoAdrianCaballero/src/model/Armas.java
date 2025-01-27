package model;

public class Armas {
	
	//Tarea de: Adrián
	//Realizado por: Adrián
	private String name;
	private boolean status;
	
	//Tarea de: Cristina
	//Realizado por: Cristina
	private int MaxDamage;
	private int minDamage;// base


	public Armas(String name, boolean status, int maxDamage, int minDamage) {
		super();
		this.name = name;
		this.status = status;
		MaxDamage = maxDamage;
		this.minDamage = minDamage;
	}

	public Armas() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	public int getMaxDamage() {
		return MaxDamage;
	}

	public void setMaxDamage(int maxDamage) {
		MaxDamage = maxDamage;
	}

	public int getMinDamage() {
		return minDamage;
	}

	public void setMinDamage(int minDamage) {
		this.minDamage = minDamage;
	}

	@Override
	public String toString() {
		return "Armas [name=" + name + ", status=" + status + ", MaxDamage=" + MaxDamage + ", minDamage=" + minDamage
				+ "]";
	}



//	
}
