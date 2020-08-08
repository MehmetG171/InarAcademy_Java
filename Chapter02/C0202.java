package PackageChapter02;

import java.util.Scanner;

public class C0202 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the radius and length of a cylinder :");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		double area = radius * radius * 3.14159;
		double volume = area * length;

		System.out.printf("Area is %.3f\n", area);
		System.out.printf("Volume is %.3f\n", volume);
		
		input.close();
	}
}
