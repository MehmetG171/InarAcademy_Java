package PackageChapter08;

import java.util.Scanner;

public class C0827 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 3-by-3 matrix row by row:");

		double[][] array = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = input.nextDouble();
			}
		}

		double[][] sorted = sortRows(array);
		System.out.println("The column-sorted array is");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf(sorted[i][j] + " ");
			}
			System.out.println("");
		}

		input.close();
	}

	public static double[][] sortRows(double[][] m) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 1; k < 3; k++) {
					if (m[k][j] < m[k - 1][j]) {
						double temp = m[k][j];
						m[k][j] = m[k - 1][j];
						m[k - 1][j] = temp;
					}
				}
			}
		}
		return m;
	}
}
