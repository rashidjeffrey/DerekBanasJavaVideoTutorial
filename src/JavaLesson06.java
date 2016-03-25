import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class JavaLesson06 {

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// divideByZero(2);

		// System.out.println("age?");
		// int age = checkValidAge();
		//
		// if (age != 0) {
		// System.out.println("you are "+age);
		// }

		getAFile("./stuff.txt");
	}

	private static void divideByZero(int a) {
		try {
			System.out.println(a / 0);
		} catch (ArithmeticException e) {
			System.out.println("Naughty");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}

	private static int checkValidAge() {
		try {
			return userInput.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			userInput.next();
			System.out.println("not a whole number");
			return 0;
		}

	}

	private static void getAFile(String fileName) {
		try {
			FileInputStream file = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file doesn't exist");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("unknown IO error");
		} catch (Exception e) {
			System.out.println("unknown error");
		} finally {
			System.out.println("stuff");
		}
	}

	private static void getAFile2(String fileName) throws FileNotFoundException {
		FileInputStream file = new FileInputStream(fileName);

	}
}
