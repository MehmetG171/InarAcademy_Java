package PackageChapter02;

import java.util.Scanner;

public class C0219 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first point of triangle x1, y1:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.println("Enter the second point of triangle x2, y2:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		System.out.println("Enter the third point of triangle x3, y3:");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		double side1square = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		double side2square = Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2);
		double side3square = Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2);

		double side1 = Math.pow(side1square, 0.5);
		double side2 = Math.pow(side2square, 0.5);
		double side3 = Math.pow(side3square, 0.5);
		double side = (side1 + side2 + side3) / 2;

		double area = Math.pow(side * (side - side1) * (side - side2) * (side - side3), 0.5);

		System.out.println("The area of the triangle is " + area);
		
		input.close();

	}
}
