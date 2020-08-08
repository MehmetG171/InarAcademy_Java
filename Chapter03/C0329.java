package PackageChapter03;

import java.util.Scanner;

public class C0329 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter circle1's center x-, y-coordinates, and radius:");
		double c1Centerx = input.nextDouble();
		double c1Centery = input.nextDouble();
		double r1 = input.nextDouble();
		System.out.println("Enter circle2's center x-, y-coordinates, and radius:");
		double c2Centerx = input.nextDouble();
		double c2Centery = input.nextDouble();
		double r2 = input.nextDouble();

		if ((Math.pow(Math.pow(c2Centerx - c1Centerx, 2) + Math.pow(c2Centery - c1Centery, 2), 0.5)) <= Math
				.abs(r2 - r1)) {
			System.out.println("circle2 is inside circle1.");
		} else if ((Math.pow(Math.pow(c2Centerx - c1Centerx, 2) + Math.pow(c2Centery - c1Centery, 2), 0.5)) <= (r1
				+ r2)) {
			System.out.println("circle2 overlaps circle1.");
		} else {
			System.out.println("circle2 does not overlap circle1.");
		}

		input.close();
	}
}
