package PackageChapter03;

import java.util.Scanner;

public class C0318 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the weight of the package:");
		double weight = input.nextDouble();

		double Cost;

		if (50 < weight) {
			System.out.println("The package cannot be shipped.");
		} else {
			if (weight <= 1) {
				Cost = weight * 3.5;
			} else if (weight <= 3) {
				Cost = weight * 5.5;
			} else if (weight <= 10) {
				Cost = weight * 8.5;
			} else {
				Cost = weight * 10.5;
			}
			System.out.println("The shipping cost is $" + Cost);
		}

		input.close();
	}
}
