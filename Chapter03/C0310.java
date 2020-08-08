package PackageChapter03;

import java.util.Scanner;

public class C0310 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);

		System.out.println("What is " + number1 + " + " + number2 + " ? ");
		int answer = input.nextInt();

		int result = number1 + number2;

		if (result == answer) {
			System.out.println("You are correct!");
		} else {
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " + " + number2 + " should be " + result);
		}

		input.close();
	}
}
