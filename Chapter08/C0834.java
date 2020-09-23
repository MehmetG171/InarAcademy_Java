package PackageChapter08;

import java.util.Scanner;

public class C0834 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 6 points:");

		double[][] points = new double[6][2];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 2; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		double[] rightLowest = getRightmostLowestPoint(points);
		System.out.println("The rightmost lowest point is (" + rightLowest[0] + ", " + rightLowest[1] + ")");

		input.close();
	}

	public static double[] getRightmostLowestPoint(double[][] points) {
		double[] rightLowest = new double[2];
		double rightestx = points[0][0];
		double rightesty = points[0][1];

		for (int i = 0; i < points.length; i++) {
			if (rightesty > points[i][1]) {
				rightesty = points[i][1];
				rightestx = points[i][0];
			} else if (rightesty == points[i][1] && rightestx < points[i][0]) {
				rightesty = points[i][1];
				rightestx = points[i][0];
			}
		}

		rightLowest[0] = rightestx;
		rightLowest[1] = rightesty;
		return rightLowest;
	}
}
