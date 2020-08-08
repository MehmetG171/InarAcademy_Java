package PackageChapter03;

import java.util.Scanner;

public class C0322 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Geometry: point in a circle?");
		System.out.println("A circle with radius = 10 is centered at (0, 0)");
		System.out.println("Enter a point with two coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();

		double distance = Math.pow(x * x + y * y, 0.5);

		if (distance <= 10) {
			System.out.println("Point (" + x + ", " + y + ") is in the circle.");
		} else {
			System.out.println("Point (" + x + ", " + y + ") is not in the circle.");
		}

		input.close();
	}

}
