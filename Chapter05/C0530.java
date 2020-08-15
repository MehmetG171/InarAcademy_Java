package PackageChapter05;

import java.util.Scanner;

public class C0530 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an amount:");
		double amount = input.nextDouble();
		System.out.println("Enter the annual Interest Rate:");
		double InterestRate = input.nextDouble();
		System.out.println("Enter the number of months:");
		int months = input.nextInt();
		double save = amount;

		double MonthlyInterestRate = InterestRate / 12;
		amount = amount * (1 + MonthlyInterestRate);

		for (int i = 2; i <= months; i++) {
			amount = amount + save;
			amount = amount * (1 + MonthlyInterestRate);
		}
		System.out.printf("The amount in the savings account is %.3f ", amount);

		input.close();
	}
}
