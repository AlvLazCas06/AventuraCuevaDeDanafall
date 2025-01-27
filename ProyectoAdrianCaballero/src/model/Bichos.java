package model;

public class Bichos {
	
	//Tarea de: Adrián
	//Realizado por: Adrián
	private String name;
	private int health;
	private int defense;
	private boolean status; // death or alive
	//Tarea de: Cristina
	//Realizado por: Cristina
	private int maxAttack;
	private int minAttack;
	private boolean enLucha;
	
	public Bichos(String name, int health, int defense, int maxAttack, int minAttack,boolean status, boolean enLucha) {
		super();
		this.name = name;
		this.health = health;
		this.defense = defense;
		this.status = status;
		this.maxAttack = maxAttack;
		this.minAttack = minAttack;
		this.enLucha = enLucha;
	}

	public Bichos() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMaxAttack() {
		return maxAttack;
	}

	public void setMaxAttack(int maxAttack) {
		this.maxAttack = maxAttack;
	}

	public int getMinAttack() {
		return minAttack;
	}

	public void setMinAttack(int minAttack) {
		this.minAttack = minAttack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public boolean isStatus() {
		return status;
	}

	public boolean isEnLucha() {
		return enLucha;
	}

	public void setEnLucha(boolean enLucha) {
		this.enLucha = enLucha;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bichos [name=" + name + ", health=" + health + ", defense=" + defense + ", status=" + status
				+ ", maxAttack=" + maxAttack + ", minAttack=" + minAttack + ", enLucha=" + enLucha + "]";
	}

	public void bicho_2() {
		System.out.println("""
									.S :tX  8@%8.
								  S@.8;@@   %;SS 88 .  .  . .  .  . .  .
								 ;X@.  . .  ...:t.8 8    .      .
								 88   88       8@..%8% .    . .    . .
								 88  .:%888888S8X   :.    S:@:   .     .
								 @  t..;;8888.8t .S888. .@8S:. .8t@  .
								t88X%             %S:;. .:; SX.:@8%
								8@ %@S  .       . @:%tt %8; t@;.t@8  .
								   .X .:  .;S:;t  .  88:@@  X;@  t;.  .
								 @8  .88.  t:.X8@   .tSX@  8@t . .::
								 .8%. 8:   t:%8X%  .8S tS%:88     @8. .
								88    .   . %%X:  :%8;8 ;X:  .  . 8@t
								:@S .    .       t%X   :ttX.     .;t   .
								 X%8   .    . :8%8X   .  :@8;; .t;.. .
								  ;%:%   ;8:::X8.   .S8  8Xt8%S88t
								    %S:.;;8@   .     S8X ... ;%8S  .  .
								     ;8888XS  .   . . SX@ ;SX  %.;
								 . .   . % 8    .      S8@ ;t.. :Xt:. .
								          88       .  . S%. :tt  .:;
								  .  .  %8@8  .  .       t:. %@8  ;:..
								      . X@@8   .   . . .  .@.8t@8. :;S:
								  . .  @S. S .              :SX;:    @@
								       8Xt%8    . .  .  . .  X:@t  . %@8
								  .  .    .. .         .    .  :.     .X
								    .   . XX   .  . .     .       .%88::
								  .   .  S%: .   .    .  . .;t%% 8 ;t%.
								       .;S.    ..t%%8:;.8...88S%88S
								  . . :8 %St%tS%X.88.t%%:   SX   X%  .
								       X@88;;8.@8t  ;;:    %.; .:XS.   .
								  .  .    .   X@    88; .  ;8t..:@:
								    .   .    ..@::.: @.   ..%t       .
																""");
	}
}