package PackageChapter06;

import java.util.Scanner;

public class C0639 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Geometry: point position");
		System.out.println("Enter the x and y coordinates of point p0:");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		System.out.println("Enter the x and y coordinates of point p1:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter the x and y coordinates of point p2:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
			System.out.printf("(%.2f, %.2f) is on the left side of the line from (%.2f, %.2f) to (%.2f, %.2f)", x2, y2,
					x0, y0, x1, y1);
		}
		if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
			System.out.printf("(%.2f, %.2f) is on the same line from (%.2f, %.2f) to (%.2f, %.2f)", x2, y2, x0, y0, x1,
					y1);
		}
		if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
			System.out.printf("(%.2f, %.2f) is on the line segment from (%.2f, %.2f) to (%.2f, %.2f)", x2, y2, x0, y0,
					x1, y1);
		}
		if (rightOfTheLine(x0, y0, x1, y1, x2, y2)) {
			System.out.printf("(%.2f, %.2f) is on the right side of the line from (%f, %.2f) to (%.2f, %.2f)", x2, y2,
					x0, y0, x1, y1);
		}
		input.close();
	}

	public static boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (0 > position) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (((0 == position) && (x0 <= x2) && (x2 <= x1) && (y0 <= y2) && (y2 <= y1))
				|| ((0 == position) && (x0 <= x2) && (x2 <= x1) && (y1 <= y2) && (y2 <= y0))
				|| ((0 == position) && (x1 <= x2) && (x2 <= x0) && (y0 <= y2) && (y2 <= y1))
				|| ((0 == position) && (x1 <= x2) && (x2 <= x0) && (y1 <= y2) && (y2 <= y0))) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if ((0 == position) && (!onTheLineSegment(x0, y0, x1, y1, x2, y2))) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (0 < position) {
			return true;
		} else {
			return false;
		}
	}
}
