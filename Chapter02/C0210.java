package PackageChapter02;

import java.util.Scanner;

public class C0210 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the amount of water in kilograms :");
		double WaterWeight = input.nextDouble();
		System.out.println("Enter the initial temperature in Celsius :");
		double tFirst = input.nextDouble();
		System.out.println("Enter the final temperature in Celsius :");
		double tLast = input.nextDouble();

		double energy = WaterWeight * (tLast - tFirst) * 4184;

		System.out.printf("The energy needed is : %.2f joules ", energy);
		
		input.close();
	}
}
