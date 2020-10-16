package PackageChapter11;

import java.util.Scanner;

public class C1115 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of the points:");
		double[][] array = new double[input.nextInt()][2];

		System.out.println("Enter the coordinates of the points:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < 2; j++) {
				array[i][j] = input.nextDouble();
			}
		}

		double sum1 = 0;
		double sum2 = 0;
		for (int i = 0; i < array.length - 1; i++) {
			sum1 = sum1 + array[i][0] * array[i + 1][1];
			sum2 = sum2 + array[i][1] * array[i + 1][0];
			if (i + 1 == array.length - 1) {
				sum1 = sum1 + array[i + 1][0] * array[0][1];
				sum2 = sum2 + array[i + 1][1] * array[0][0];
			}
		}

		System.out.println("The total area is " + Math.abs((sum1 - sum2) / 2));

		input.close();
	}
}
