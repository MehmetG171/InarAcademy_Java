package PackageChapter02;

import java.util.Scanner;

public class C0211 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter speed in m/s and acceleration in m/s^2 :");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();

		double length = (speed * speed) / (2 * acceleration);

		System.out.printf("The minimum runway length for this airplane is %.3f m ", length);

		input.close();
	}
}
