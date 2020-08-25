package PackageChapter07;

import java.util.Scanner;

public class C0708 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter ten double values:");
		double[] numbers = new double[10];

		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextDouble();
		}

		System.out.println("Average of the numbers is " + average(numbers));

		input.close();
	}

	public static double average(double[] numbers) {
		double total = 0;
		for (int i = 0; i < 10; i++) {
			total = numbers[i] + total;
		}
		return total / numbers.length;
	}

	public static int average(int[] numbers) {
		int total = 0;
		for (int i = 0; i < 10; i++) {
			total = numbers[i] + total;
		}
		return total / numbers.length;
	}
}
