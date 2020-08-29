package PackageChapter07;

import java.util.Scanner;

public class C0725 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("The quadratic equation has a form of a^2 + bx + c = 0");
		System.out.println("Enter a, b and c:");

		double[] coefficients = new double[3];

		for (int i = 0; i < coefficients.length; i++) {
			coefficients[i] = input.nextDouble();
		}

		double a = coefficients[0];
		double b = coefficients[1];
		double c = coefficients[2];
		double discriminant = Math.pow((b * b - 4 * a * c), 0.5);

		if (discriminant > 0) {
			double[] roots = new double[2];
			solveQuadratic(coefficients, roots);
			System.out.printf("The roots are %.3f and %.3f", roots[0], roots[1]);
		} else if (discriminant == 0) {
			double[] roots = new double[1];
			solveQuadratic(coefficients, roots);
			System.out.printf("The roots are %.3f", roots[0]);
		} else {
			double[] roots = new double[0];
			solveQuadratic(coefficients, roots);
			System.out.println("The equation has no real roots.");
		}

		input.close();
	}

	public static double[] solveQuadratic(double[] coefficients, double[] roots) {
		if (roots.length == 2) {
			double discriminant = Math.sqrt(coefficients[1] * coefficients[1] - 4 * coefficients[0] * coefficients[2]);
			roots[0] = (-coefficients[1] - discriminant) / (2 * coefficients[0]);
			roots[1] = (-coefficients[1] + discriminant) / (2 * coefficients[0]);
		} else if (roots.length == 1) {
			double discriminant = Math.sqrt(coefficients[1] * coefficients[1] - 4 * coefficients[0] * coefficients[2]);
			roots[0] = (-coefficients[1] - discriminant) / (2 * coefficients[0]);
		} else {
			return null;
		}
		return roots;
	}
}
