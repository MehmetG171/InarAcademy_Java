package PackageChapter08;

import java.util.Scanner;

public class C0832 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter x1, y1, x2, y2, x3, y3:");

		double[][] points = new double[3][2];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		double area = getTriangleArea(points);

		if (area == 0) {
			System.out.println("The three points are on the same line");
		} else {
			System.out.printf("The area of the triangle is %.2f", area);
		}

		input.close();
	}

	public static double getTriangleArea(double[][] points) {

		if ((points[0][1] - points[1][1]) * (points[0][0] - points[2][0]) == (points[0][1] - points[2][1])
				* (points[0][0] - points[1][0])) {
			return 0;
		}

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
