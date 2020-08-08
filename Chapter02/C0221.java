package PackageChapter02;

import java.util.Scanner;

public class C0221 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter investment amount:");
		double investment = input.nextDouble();

		System.out.println("Enter annual interest rate in percentage:");
		double MonthlyInterestRate = input.nextDouble();
		MonthlyInterestRate = MonthlyInterestRate / 1200;

		System.out.println("Enter number of years:");
		double years = input.nextDouble();

		double value = investment * Math.pow((1 + MonthlyInterestRate), years * 12);

		System.out.println("Accumulated value is $" + value);
		
		input.close();
	}
}
