package PackageChapter10;

import java.util.Scanner;

public class TestStackOfIntegers2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a positive integer: ");
		int number = input.nextInt();

		StackOfIntegers stack = new StackOfIntegers(number);

		System.out.println("Prime numbers less than " + number + ": ");
		primeNumbers(number, stack);

		int count = 1;
		while (!stack.empty()) {
			System.out.print(stack.pop() + "  ");
			if (count % 10 == 0) {
				System.out.println();
			}
			count++;
		}

		input.close();
	}

	private static void primeNumbers(int number, StackOfIntegers stack) {
		for (int i = 2; i < number; i++) {
			if (isPrime(i)) {
				stack.push(i);
			}
		}
	}

	private static boolean isPrime(int i) {
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
