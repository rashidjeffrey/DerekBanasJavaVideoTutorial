import java.util.Scanner;

public class JavaLesson05 {

	static double myPi = 3.14159; // class variable
	static int randomNumber; // class variable
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		 //addThem(1, 2);
		 //System.out.println("Global "+myPi);
		 //System.out.println(addThem(1, 2));
		 //int d = 5;
		 //tryToChange(d);
		 //System.out.println("main d="+d);
		
		System.out.println(getRandomNum());
		
		int guessResult = 1;
		int randomGuess = 0;
		
		while (guessResult != -1) {
			System.out.println("Guess a number between 0 and 50: ");
			randomGuess =  userInput.nextInt();
			guessResult = checkGuess(randomGuess);
			
		}
		
		System.out.println("It was "+ randomGuess);
	}
	
	
	public static int addThem(int a, int b) {
		
		//double smallPi = 3.140;
		//double myPi = 3.0;
		//myPi = myPi + 3.0;
		
		//System.out.println("Local "+myPi);
		//return 1;
		
		return a+b;
	}
	
	public static void tryToChange(int d){
		d++;
		System.out.println("try to change d = "+d);
	}

	private static int getRandomNum() {
		randomNumber = (int) (Math.random()*51);
		return randomNumber;
	}
	
	public static int checkGuess(int guess) {
		if (guess ==  randomNumber) {
			return -1;
		} else {
			return guess;

		}
	}
}
