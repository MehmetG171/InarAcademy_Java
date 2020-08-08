package PackageChapter02;

import java.util.Scanner;

public class C0223 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the driving distance:");
		double distance = input.nextDouble();
		System.out.println("Enter miles per gallon:");
		double MilesPerGallon = input.nextDouble();
		System.out.println("Enter price per gallon:");
		double PricePerGallon = input.nextDouble();

		double cost = (distance / MilesPerGallon) * PricePerGallon;

		System.out.println("The cost of driving is $" + cost);
		
		input.close();
	}
}
