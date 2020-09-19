package PackageChapter08;

import java.util.Scanner;

public class C0833 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");

		double[][] points = new double[4][2];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		double[] intersectPoint = getIntersectingPoint(points);

		double[][] triangle1 = { { points[0][0], points[0][1] }, { points[1][0], points[1][1] },
				{ intersectPoint[0], intersectPoint[1] } };
		double[][] triangle2 = { { points[1][0], points[1][1] }, { points[2][0], points[2][1] },
				{ intersectPoint[0], intersectPoint[1] } };
		double[][] triangle3 = { { points[2][0], points[2][1] }, { points[3][0], points[3][1] },
				{ intersectPoint[0], intersectPoint[1] } };
		double[][] triangle4 = { { points[3][0], points[3][1] }, { points[0][0], points[0][1] },
				{ intersectPoint[0], intersectPoint[1] } };

		double[] areas = new double[4];
		areas[0] = getTriangleArea(triangle1);
		areas[1] = getTriangleArea(triangle2);
		areas[2] = getTriangleArea(triangle3);
		areas[3] = getTriangleArea(triangle4);

		for (int j = 0; j < areas.length; j++) {
			for (int k = 1; k < areas.length; k++) {
				if (areas[k - 1] > areas[k]) {
					double temp = areas[k];
					areas[k] = areas[k - 1];
					areas[k - 1] = temp;
				}
			}
		}

		System.out.print("The areas are ");
		for (int i = 0; i < 4; i++) {
			System.out.printf("%.2f  ", areas[i]);
		}

		input.close();
	}

	public static double[] getIntersectingPoint(double[][] points) {
		double[] Point = new double[2];

		double a = points[0][1] - points[2][1];
		double b = points[2][0] - points[0][0];
		double c = points[1][1] - points[3][1];
		double d = points[3][0] - points[1][0];
		double e = a * points[0][0] + b * points[0][1];
		double f = c * points[1][0] + d * points[1][1];
		if (a * d - b * c == 0) {
			return null;
		}
		Point[0] = (e * d - b * f) / (a * d - b * c);
		Point[1] = (a * f - e * c) / (a * d - b * c);

		return Point;
	}

	public static double getTriangleArea(double[][] points) {

		double side1square = Math.pow((points[1][0] - points[0][0]), 2) + Math.pow((points[1][1] - points[0][1]), 2);
		double side2square = Math.pow((points[2][0] - points[1][0]), 2) + Math.pow((points[2][1] - points[1][1]), 2);
		double side3square = Math.pow((points[0][0] - points[2][0]), 2) + Math.pow((points[0][1] - points[2][1]), 2);

		double side1 = Math.pow(side1square, 0.5);
		double side2 = Math.pow(side2square, 0.5);
		double side3 = Math.pow(side3square, 0.5);
		double side = (side1 + side2 + side3) / 2;

		double area = Math.pow(side * (side - side1) * (side - side2) * (side - side3), 0.5);

		return area;
	}
}
