import java.util.Arrays;

public class Monster02 {
	
	static char[][] battleBoard = new char[10][10];

	public static void buildBattleBoard() {
		for (char[] row : battleBoard) {
			Arrays.fill(row, '*');

		}
	}

	public static void redrawBoard() {
		int k = 1;
		while (k <= 30 ) {
			System.out.print('_');
			k++;
		}
		System.out.println();
		
		for (int i = 0; i < battleBoard.length; i++) {
			for (int j = 0; j < battleBoard.length; j++) {
				System.out.print("|" + battleBoard[i][j] + "|");
			}
			System.out.println();			
		}
		
		
		k = 1;
		while (k <= 30 ) {
			System.out.print('_');
			k++;
		}
		System.out.println();		
	}
	

	public final String TOMBSTONE = "Here lies a dead monster";
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private boolean alive = true;

	public String name = "Big Monster";
	public char nameChar1 = 'B';	
	public int xPosition = 0;
	public int yPosition = 0;
	public static int numberOfMonsters = 0;


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
	
	public Monster02(int newHealth, int newAttack, int newMovement, String name) {
		this.health = newHealth;
		this.attack = newAttack;
		this.movement = newMovement;
		this.name = name;
		
		// eh? what's the point of the 0 index?
		int maxXBoardSpace = battleBoard.length - 1;
		//int maxYBoardSpace = battleBoard[0].length - 1;
		//int maxYBoardSpace = battleBoard[1].length - 1;
		int maxYBoardSpace = battleBoard.length - 1;
		
		System.out.println("maxXBoardSpace: "+maxXBoardSpace);
		System.out.println("maxYBoardSpace: "+maxYBoardSpace);
		
		System.out.println("battleBoard.length - 1: "+(battleBoard.length - 1));
		System.out.println("battleBoard[0].length - 1: "+(battleBoard[0].length - 1));		
		
		int randNumX, randNumY;
		
		do {
			randNumX =  (int) (Math.random() * maxXBoardSpace);
			randNumY =  (int) (Math.random() * maxYBoardSpace);
		} while (battleBoard[randNumX][randNumY] != '*');
		
		this.xPosition = randNumX;
		this.yPosition = randNumY;
		
		this.nameChar1 = this.name.charAt(0);
		
		//TODO should the x,y coordinates be the other way round?
		//battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
		battleBoard[this.xPosition][this.yPosition] = this.nameChar1;
		
		numberOfMonsters++;
	}
	
	// Default constructor
	public Monster02() {
		// TODO Auto-generated constructor stub
	}
	
	public Monster02(int newHealth) {
		this.health = newHealth;
	}

	public Monster02(int newHealth, int newAttack) {
		this(newHealth);
		this.attack = newAttack;
	}
	
	
	public static void main(String[] args) {

	}
	
}
