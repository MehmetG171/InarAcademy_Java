package PackageChapter05;

import java.util.Scanner;

public class C0522 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Loan Amount:");
		double loan = input.nextDouble();
		System.out.println("Number of Years:");
		double years = input.nextDouble();
		System.out.println("Annual Interest Rate:");
		double InterestRate = input.nextDouble();

		double MonthlyInterestRate, TotalPayment, MonthlyPayment;
		double balance = loan;
		double principal, interest;

		MonthlyInterestRate = InterestRate / 1200;
		MonthlyPayment = loan * MonthlyInterestRate / (1 - 1 / Math.pow(1 + MonthlyInterestRate, years * 12));
		TotalPayment = MonthlyPayment * years * 12;

		System.out.println();
		System.out.printf("Monthly Payment: %.2f\n", MonthlyPayment);
		System.out.printf("Total Payment: %.2f\n\n", TotalPayment);

		System.out.println("Payment#      Interest      Principal      Balance");

		for (int i = 1; i <= 12; i++) {
			interest = MonthlyInterestRate * balance;
			principal = MonthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%-14d%-14.2f%-14.2f %-14.2f\n", i, interest, principal, balance);
		}
		input.close();
	}
}
