package PackageChapter03;

import java.util.Scanner;

public class C0323 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Geometry: point in a rectangle?");
		System.out.println("A rectangle with width 10 and height 5 is centered at (0, 0).");
		System.out.println("Enter a point with two coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();

		if ((x <= 5) && (-5 <= x) && (y <= 2.5) && (-2.5 <= y)) {
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle.");
		} else {
			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle.");
		}

		input.close();
	}

}
