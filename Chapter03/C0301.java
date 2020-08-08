package PackageChapter03;

import java.util.Scanner;

public class C0301 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("The quadratic equation has a form of a^2 + bx + c = 0");
		System.out.println("Enter a, b and c:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double discriminant = Math.pow((b * b - 4 * a * c), 0.5);

		if (discriminant > 0) {
			double r1 = (-1 * b + discriminant) / 2 * a;
			double r2 = (-1 * b - discriminant) / 2 * a;

			System.out.println("The equation has two roots: " + r1 + " and " + r2);
		}

		else if (discriminant == 0) {
			double r3 = (-1 * b + discriminant) / 2 * a;
			System.out.println("The equation has one root: " + r3);
		}

		else {
			System.out.println("The equation has no real roots.");
		}
		
		input.close();
		
	}
}
