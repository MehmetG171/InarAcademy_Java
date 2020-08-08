package PackageChapter03;

import java.util.Scanner;

public class C0331 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the exchange rate from dollars to RMB:");
		double rate = input.nextDouble();
		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
		double operation = input.nextDouble();

		if (operation == 0) {

			System.out.println("Enter the dollar amount:");
			double dollars = input.nextDouble();

			double rmb = rate * dollars;

			System.out.println("$" + dollars + " is " + rmb + " yuan.");

		} else if (operation == 1) {

			System.out.println("Enter the RMB amount:");
			double rmb = input.nextDouble();

			double dollars = rmb / rate;

			System.out.println(rmb + " yuan is $" + dollars);
		} else {
			System.out.println("Incorrect input");
		}
		
		input.close();
	}

}
