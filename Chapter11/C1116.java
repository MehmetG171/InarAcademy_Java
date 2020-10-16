package PackageChapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class C1116 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();

		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();

		while (number1 + number2 != answer) {
			if (numbers.contains(answer)) {
				System.out.println("You already entered " + answer);
			}
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			numbers.add(answer);
			answer = input.nextInt();
		}

		System.out.println("You got it!");

		input.close();
	}
}
