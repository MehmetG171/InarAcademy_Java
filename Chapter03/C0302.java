package PackageChapter03;

import java.util.Scanner;

public class C0302 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() / 7 % 10);

		System.out.println("What is " + number1 + " + " + number2 + " ? ");

		int number = input.nextInt();

		if (number1 + number2 == number) {
			System.out.println(number1 + " + " + number2 + " = " + number + " is true. ");
		}

		else {
			System.out.println(number1 + " + " + number2 + " = " + number + " is false. ");
		}

		input.close();
	}
}
