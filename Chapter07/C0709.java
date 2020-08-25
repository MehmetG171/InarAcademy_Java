package PackageChapter07;

import java.util.Scanner;

public class C0709 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter ten numbers:");
		double[] numbers = new double[10];

		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextDouble();
		}

		double smallest = numbers[0];
		for (int j = 0; j < 10; j++) {
			if (numbers[j] < smallest) {
				smallest = numbers[j];
			}
		}

		System.out.println("The minimum number is: " + smallest);

		input.close();
	}
}
