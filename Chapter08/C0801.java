package PackageChapter08;

import java.util.Scanner;

public class C0801 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 3-by-4 matrix row by row:");

		double[][] m = new double[3][4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				m[i][j] = input.nextDouble();
			}
		}

		for (int column = 0; column < 4; column++) {
			double total = sumColumn(m, column);
			System.out.println("Sum of the elements at column " + column + " is " + total);
		}

		input.close();
	}

	public static double sumColumn(double[][] m, int column) {
		double total = 0;
		for (int i = 0; i < 3; i++) {
			total = total + m[i][column];
		}
		return total;
	}
}
