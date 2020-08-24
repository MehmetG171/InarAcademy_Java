package PackageChapter06;

import java.util.Scanner;

public class C0635 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side:");
		double side = input.nextDouble();

		double area = Area(side);
		System.out.println("The area of the pentagon is " + area);
		input.close();
	}

	public static double Area(double side) {
		double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
		return area;
	}
}
