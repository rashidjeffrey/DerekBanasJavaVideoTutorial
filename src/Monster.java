
public class Monster {

	public final String TOMBSTONE = "Here lies a dead monster";
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	public String name = "Big Monster";

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = this.health - health;
		if (this.health < 0) {
			this.alive = false;
			
		}
	}
	
	public void setHealth(double health) {
		this.health = this.health - (int) health;
		if (this.health < 0) {
			this.alive = false;
			
		}
	}	

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getMovement() {
		return movement;
	}

	public void setMovement(int movement) {
		this.movement = movement;
	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTOMBSTONE() {
		return TOMBSTONE;
	}
	
	public Monster(int newHealth, int newAttack, int newMovement) {
		this.health = newHealth;
		this.attack = newAttack;
		this.movement = newMovement;
	}
	
	// Default constructor
	public Monster() {
		// TODO Auto-generated constructor stub
	}
	
	public Monster(int newHealth) {
		this.health = newHealth;
	}

	public Monster(int newHealth, int newAttack) {
		this(newHealth);
		this.attack = newAttack;
	}
	
	
	public static void main(String[] args) {
		Monster frank = new Monster();
		System.out.println(frank.attack);
	}
	
}
