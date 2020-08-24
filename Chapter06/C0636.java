package PackageChapter06;

import java.util.Scanner;

public class C0636 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of sides:");
		int n = input.nextInt();
		System.out.println("Enter the side:");
		double side = input.nextDouble();

		double area = Area(n, side);
		System.out.println("The area is " + area);

		input.close();
	}

	public static double Area(int n, double side) {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}
}
