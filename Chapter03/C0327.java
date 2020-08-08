package PackageChapter03;

import java.util.Scanner;

public class C0327 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Geometry: points in triangle?");
		System.out.println(
				"The right-angle point is placed at (0, 0); the other two points are placed at (200, 0) and (0, 100).");
		System.out.println("Enter a point's x- and y-coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();

		if ((x <= 200) && (0 <= x) && (y <= 100) && (0 <= y)) {
			System.out.println("The point is in the triangle.");
		} else {
			System.out.println("The point is not in the triangle.");
		}

		input.close();
	}
}
