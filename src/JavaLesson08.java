
public class JavaLesson08 {

	public static void main(String[] args) {
		Monster02.buildBattleBoard();
		char[][] tempBattleBoard = new char[10][10];
		
		Monster02[] monsters = new Monster02[4];
		
		//public Monster02(int newHealth, int newAttack, int newMovement, String name) {
		monsters[0] = new Monster02(1000, 20, 1, "Frank");
		monsters[1] = new Monster02(500, 40, 2, "Drac");
		monsters[2] = new Monster02(1000, 20, 1, "Bob");
		monsters[3] = new Monster02(1000, 20, 1, "Jim");
		
		Monster02.redrawBoard();
		
	}

}
