package PackageChapter07;

import java.util.Scanner;

public class C0712 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter ten numbers:");
		double[] numbers = new double[10];

		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextDouble();
		}

		double[] reversedOrder = reverse(numbers);
		System.out.println("The reversed order is:");

		for (int j = 0; j < 10; j++) {
			System.out.print(reversedOrder[j] + "  ");
		}
		input.close();
	}

	public static double[] reverse(double[] numbers) {
		double[] list = new double[10];
		for (int i = 0, j = numbers.length - 1; i < numbers.length; j--, i++) {
			list[i] = numbers[j];
		}
		return list;
	}
}
