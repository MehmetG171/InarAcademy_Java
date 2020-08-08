package PackageChapter02;

import java.util.Scanner;

public class C0204 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Pounds into kilograms conversion.");
		System.out.println("Enter a number in pounds :");
		double pounds = input.nextDouble();
		double kilograms = pounds * 0.454;

		System.out.println(pounds + " pounds is " + kilograms + " kilograms ");
		
		input.close();
	}
}
