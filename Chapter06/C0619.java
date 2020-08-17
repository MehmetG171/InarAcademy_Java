package PackageChapter06;

import java.util.Scanner;

public class C0619 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the sides of the triangle:");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		if (isValid(side1, side2, side3)) {
			double area = area(side1, side2, side3);
			System.out.printf("The area of the triangle is %.2f", area);
		} else {
			System.out.println("Invalid input!");
		}

		input.close();
	}

	public static double area(double side1, double side2, double side3) {
		double side = (side1 + side2 + side3) / 2;
		double area = Math.pow(side * (side - side1) * (side - side2) * (side - side3), 0.5);
		return area;
	}

	public static boolean isValid(double side1, double side2, double side3) {
		if ((side1 < side2 + side3) && (side3 < side2 + side1) && (side2 < side1 + side3)) {
			return true;
		}
		return false;
	}
}
