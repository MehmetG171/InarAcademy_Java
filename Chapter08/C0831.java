package PackageChapter08;

import java.util.Scanner;

public class C0831 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");

		double[][] points = new double[4][2];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		double[] Point = getIntersectingPoint(points);
		if (Point == null) {
			System.out.println("The two lines are parallel.");
		} else {
			System.out.println("The intersecting point is at (" + Point[0] + ", " + Point[1] + ")");
		}

		input.close();
	}

	public static double[] getIntersectingPoint(double[][] points) {
		double[] Point = new double[2];
		
		double a = points[0][1] - points[1][1];
		double b = (points[0][0] - points[1][0]) * (-1);
		double c = points[2][1] - points[3][1];
		double d = (points[2][0] - points[3][0]) * (-1);
		double e = a * points[0][0] - (-b) * points[0][1];
		double f = c * points[2][0] - (-d) * points[2][1];
		if (a * d - b * c == 0) {
			return null;
		}
		Point[0] = (e * d - b * f) / (a * d - b * c);
		Point[1] = (a * f - e * c) / (a * d - b * c);
		return Point;
	}
}
