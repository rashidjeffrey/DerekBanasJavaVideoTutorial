import java.util.Scanner;

public class JavaLesson02 {

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter your favourite number: ");

		if (userInput.hasNextInt()) {

			int numberEntered = userInput.nextInt();
			System.out.println("You entered " + numberEntered);
			int numberEntered2 = numberEntered + numberEntered;
			System.out.println("doubled is: " + numberEntered2);

			int numberABS = Math.abs(numberEntered);
			int whichIsBigger = Math.max(5, 5);

			double numSqrt = Math.sqrt(5.23);

			int numCeiling = (int) Math.ceil(5.23);
			int numFloor = (int) Math.floor(5.23);
			int numRound = (int) Math.round(5.23);

			int randomNumber = (int) (Math.random() * 11);
			System.out.println("random " + randomNumber);

		} else {
			System.out.println("Enter an integer");
		}

	}
}
