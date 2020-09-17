package PackageChapter08;

import java.util.Scanner;

public class C0830 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Solving 2x2 linear equations (Cramer's rule)");
		System.out.println("ax + by = e  ;  cx + dy = f");
		System.out.println(" x = (ed - bf) / (ad - bc);");
		System.out.println(" y = (af - ec) / (ad - bc);");
		System.out.println("Example :  3.4x + 50.2y = 44.5  ;  2.1x + .55y = 5.9");

		double[][] coefficients = new double[2][2];
		double[] results = new double[2];

		System.out.println("Enter the coefficients a, b, c and d:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				coefficients[i][j] = input.nextDouble();
			}
		}

		System.out.println("Enter the results e and f:");
		for (int i = 0; i < 2; i++) {
			results[i] = input.nextDouble();
		}

		double[] solutions = linearEquation(coefficients, results);

		if (solutions == null) {
			System.out.println("The equation has no solution.");
		} else {
			System.out.println("x = " + solutions[0] + "  " + "y = " + solutions[1]);
		}

		input.close();
	}

	public static double[] linearEquation(double[][] a, double[] b) {
		if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0) {
			return null;
		} else {
			double[] solutions = new double[2];
			solutions[0] = (a[1][1] * b[0] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
			solutions[1] = (a[0][0] * b[1] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

			return solutions;
		}
	}
}
