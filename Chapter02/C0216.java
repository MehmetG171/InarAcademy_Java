package PackageChapter02;

import java.util.Scanner;

public class C0216 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the the side of hexagon:");
		double side = input.nextDouble();

		double area = Math.pow(3, 1.5) * Math.pow(side, 2) / 2;

		System.out.println("The area of the hexagon is " + area);
		
		input.close();
	}
}
