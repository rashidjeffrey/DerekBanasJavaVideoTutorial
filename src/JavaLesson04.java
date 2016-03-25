import java.util.Scanner;

public class JavaLesson04 {

	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int i = 1;
		//
		// while (i <= 20) {
		// //System.out.println(i);
		// //i++;
		//
		// if (i==3) {
		// i+=2;
		// continue;
		// }
		//
		// System.out.println(i);
		// i++;
		//
		// if (i%2 ==0) {
		// i++;
		// }
		//
		// if (i>10) {
		// break;
		// }

		// double myPi = 4.0;
		// double j = 3.0;
		//
		// // 4 - 4/3 + 4/5 - 4/7
		//
		// while (j < 100001) {
		// myPi = myPi - (4 / j) + (4 / (j + 2));
		// j += 4;
		// System.out.println(myPi);
		// }
		//
		// System.out.println("value of pi:" + Math.PI);

		//
		// String contYorN = "Y";
		// int h =1 ;
		//
		// while (contYorN.equalsIgnoreCase("y")) {
		// System.out.println(h);
		// System.out.print("Continue y or n?");
		// contYorN = userinput.nextLine();
		// h++;
		//
		// }
		// int k =10;
		//
		// do {
		// System.out.println(k);
		// k++;
		// } while (k<10);

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		int m, n;

		for (m = 1, n = 2; m <= 9; m += 2, n += 2) {
			System.out.println(m + "\n" + n);
		}
	}

}
