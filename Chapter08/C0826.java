package PackageChapter08;

import java.util.Scanner;

public class C0826 {

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
		System.out.println("The row-sorted array is");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(sorted[i][j] + " ");
			}
			System.out.println("");
		}

		input.close();
	}

	public static double[][] sortRows(double[][] m) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 1; k < 3; k++) {
					if (m[j][k] < m[j][k - 1]) {
						double temp = m[j][k];
						m[j][k] = m[j][k - 1];
						m[j][k - 1] = temp;
					}
				}
			}
		}
		return m;
	}
}
