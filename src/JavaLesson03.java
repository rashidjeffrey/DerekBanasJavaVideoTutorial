
public class JavaLesson03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int randomNumber = (int) (Math.random() * 50);
		
		if (randomNumber < 25) {
			System.out.println("The random number is less than 25");
		}
		else if (randomNumber > 40) {
			System.out.println("The random number is greater than 40");
		} else {
			System.out.println("Nothing worked");
		}
		
		if (!false) {
			System.out.println("not false");
		}
		
		System.out.println("The random number is " + randomNumber);
		
		int valueOne = 1;
		int valueTwo = 2;
		int biggestValue = (valueOne > valueTwo) ? valueOne  : valueTwo;
		System.out.println(biggestValue);
		
		
		char theGrade = 'b';
		
		switch (theGrade) {
		case 'A':
			System.out.println("Great job A");
			break;
		case 'b':
		case 'B':
			System.out.println("Great job B");
			break;
		case 'C':
			System.out.println("Great job C");
			break;

		default:
			System.out.println("default");
			break;
		}
	}

}
