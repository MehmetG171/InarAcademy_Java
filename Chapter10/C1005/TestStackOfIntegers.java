package PackageChapter10;

import java.util.Scanner;

public class TestStackOfIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a positive integer: ");
		int number = input.nextInt();

		StackOfIntegers stack = new StackOfIntegers(number);

		smallestFactor(number, stack);

		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}

		input.close();
	}

	public static void smallestFactor(int number, StackOfIntegers stack) {
		for (int i = 2; i < number / 2; i++) {
			while (number % i == 0) {
				stack.push(i);
				number = number / i;
			}
		}
		
		stack.push(number);
	}
}
