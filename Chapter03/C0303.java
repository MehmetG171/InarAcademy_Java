package PackageChapter03;

import java.util.Scanner;

public class C0303 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Solving 2x2 linear equations (Cramer's rule)");
		System.out.println("ax + by = e  ;  cx + dy = f");
		System.out.println(" x = (ed - bf) / (ad - bc);");
		System.out.println(" y = (af - ec) / (ad - bc);");
		System.out.println("Example :  3.4x + 50.2y = 44.5  ;  2.1x + .55y = 5.9");

		System.out.println("Enter a, b, c, d, e and f:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);

		if (a * d - b * c == 0) {
			System.out.println("The equation has no solution.");
		}

		else {
			System.out.println("x = " + x + "  " + "y = " + y);
		}

		input.close();
	}
}
