package PackageChapter08;

import java.util.Scanner;

public class C0802 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 4-by-4 matrix row by row:");

		double[][] m = new double[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				m[i][j] = input.nextDouble();
			}
		}

		double sum = sumMajorDiagonal(m);
		System.out.println("Sum of the elements in the major diagonal is " + sum);

		input.close();
	}

	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0; i < 4; i++) {
			sum = sum + m[i][i];
		}
		return sum;
	}

}
