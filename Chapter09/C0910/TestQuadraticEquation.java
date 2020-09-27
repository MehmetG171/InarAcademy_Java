package PackageChapter09;

import java.util.Scanner;

public class TestQuadraticEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("The quadratic equation has a form of a^2 + bx + c = 0");
		System.out.println("Enter a, b and c:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		QuadraticEquation equation = new QuadraticEquation(a, b, c);

		if (equation.getDiscriminant() > 0) {
			System.out.println("The equation has two roots " + equation.getRoot1() + " and " + equation.getRoot2());
		} else if (equation.getDiscriminant() == 0) {
			System.out.println("The equation has one root " + equation.getRoot1());
		} else {
			System.out.println("The equation has no real roots.");
		}

		input.close();
	}
}
