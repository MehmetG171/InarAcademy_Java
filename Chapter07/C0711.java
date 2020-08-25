package PackageChapter07;

import java.util.Scanner;

public class C0711 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter ten numbers:");
		double[] numbers = new double[10];

		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextDouble();
		}
		double meanValue = mean(numbers);
		double deviationValue = deviation(numbers);

		System.out.printf("The mean is %.2f\n", meanValue);
		System.out.printf("The standard deviation is %.5f", deviationValue);
		input.close();
	}

	public static double deviation(double[] numbers) {
		double IntegerSquare = 0;
		double total = 0;
		for (int i = 0; i < 10; i++) {
			IntegerSquare = numbers[i] * numbers[i] + IntegerSquare;
			total = numbers[i] + total;
		}
		return Math.sqrt((IntegerSquare - total * total / numbers.length) / (numbers.length - 1));
	}

	public static double mean(double[] numbers) {
		double total = 0;
		for (int i = 0; i < 10; i++) {
			total = numbers[i] + total;
		}
		return total / numbers.length;
	}
}
