package PackageChapter04;

import java.util.Scanner;

public class C0405 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Geometry: area of a regular polygon");
		System.out.println("Enter the number of sides:");
		double numberOfSides = input.nextDouble();
		System.out.println("Enter the side:");
		double side = input.nextDouble();

		double area = (numberOfSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / numberOfSides));

		System.out.println("The area of the polygon is " + area);
		
		input.close();
	}
}
