package PackageChapter08;

import java.util.Scanner;

public class C0806 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] a = new double[3][3];
		double[][] b = new double[3][3];

		System.out.println("Enter matrix1:");

		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				a[i][k] = input.nextDouble();
			}
		}

		System.out.println("Enter matrix2:");

		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				b[i][k] = input.nextDouble();
			}
		}

		double[][] c = multiplyMatrix(a, b);

		System.out.println("The multiplication of the matrices is");

		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				System.out.print(a[i][k] + " ");
			}

			if (i == 1) {
				System.out.print("  *  ");
			} else {
				System.out.print("     ");
			}

			for (int k = 0; k < 3; k++) {
				System.out.print(b[i][k] + " ");
			}

			if (i == 1) {
				System.out.print("  =  ");
			} else {
				System.out.print("     ");
			}

			for (int k = 0; k < 3; k++) {
				System.out.printf("%.1f ", c[i][k]);
			}

			System.out.println("");
		}

		input.close();
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}

		return c;
	}

}
