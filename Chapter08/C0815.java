package PackageChapter08;

import java.util.Scanner;

public class C0815 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter five points:");

		double[][] points = new double[5][2];

		for (int i = 0; i < 5; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}

		if (sameLine(points)) {
			System.out.println("The five points are on the same line");
		} else {
			System.out.println("The five points are not on the same line");
		}

		input.close();
	}

	public static boolean sameLine(double[][] points) {
		for (int i = 2; i < points.length; i++) {
			double position = (points[1][0] - points[0][0]) * (points[i][1] - points[0][1])
					- (points[i][0] - points[0][0]) * (points[1][1] - points[0][1]);
			if (position != 0) {
				return false;
			}
		}

		return true;
	}
}
