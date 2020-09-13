package PackageChapter08;

import java.util.Scanner;

public class C0805 {

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

		double[][] c = addMatrix(a, b);

		System.out.println("The matrices are added as follows");

		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				System.out.print(a[i][k] + " ");
			}

			if (i == 1) {
				System.out.print("  +  ");
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
				System.out.print(c[i][k] + " ");
			}

			System.out.println("");
		}

		input.close();
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				c[i][k] = a[i][k] + b[i][k];
			}
		}
		return c;
	}
}
