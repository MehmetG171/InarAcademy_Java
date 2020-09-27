package PackageChapter09;

import java.util.Scanner;

public class TestIntersectingPoint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter x1, y1:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter x2, y2:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.println("Enter x3, y3:");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		System.out.println("Enter x4, y4:");
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double a = y1 - y2;
		double b = (x1 - x2) * (-1);
		double c = y3 - y4;
		double d = (x3 - x4) * (-1);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;

		LinearEquation linear = new LinearEquation(a, b, c, d, e, f);

		if (!linear.isSolvable()) {
			System.out.println("The two lines are parallel.");
		} else {
			System.out.println("The intersecting point is at (" + linear.getX() + ", " + linear.getY() + ")");
		}

		input.close();
	}
}
