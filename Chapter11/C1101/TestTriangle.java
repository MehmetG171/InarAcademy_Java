package PackageChapter11;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the sides of the triangle:");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		Triangle triangle = new Triangle(side1, side2, side3);

		System.out.println("Enter the color of the triangle:");
		String color = input.next();

		System.out.println("Is triangle filled? true or false");
		boolean filled = input.nextBoolean();

		triangle.setFilled(filled);
		triangle.setColor(color);

		System.out.println(triangle.toString());
		System.out.println("Area --> " + triangle.getArea() + "  Perimeter --> " + triangle.getPerimeter());
		System.out.println("Color --> " + triangle.getColor() + "  isFilled --> " + triangle.isFilled());

		input.close();
	}
}
