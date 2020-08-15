package PackageChapter05;

import java.util.Scanner;

public class C0545 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter ten numbers:");

		double number = 1;
		double mean, deviation;
		double total = 0;
		double integerSquare = 0;

		while (number < 11) {
			double integer = input.nextDouble();
			total = total + integer;
			integerSquare = integerSquare + integer * integer;
			number++;
		}
		number--;

		mean = total / number;
		deviation = Math.sqrt((integerSquare - total * total / number) / (number - 1));

		System.out.printf("The mean is %.2f\n", mean);
		System.out.printf("The standard deviation is %.5f", deviation);

		input.close();
	}
}
