package PackageChapter03;

import java.util.Scanner;

public class C0314 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your guess (0-head and 1-tail):");
		int guess = input.nextInt();

		int number = (int) (Math.random() * 2);

		if (guess == number) {
			System.out.println("The guess is correct !");
		} else {
			System.out.println("The guess is incorrect !");
		}

		input.close();
	}
}
