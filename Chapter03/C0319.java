package PackageChapter03;

import java.util.Scanner;

public class C0319 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the three edges of triangle:");
		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();

		if ((edge2 < (edge3 + edge1)) && (edge3 < (edge1 + edge2)) && (edge1 < (edge3 + edge2))) {
			System.out.println("The triangle is valid.");
		} else {
			System.out.println("The triangle is invalid.");
		}

		input.close();
	}
}
