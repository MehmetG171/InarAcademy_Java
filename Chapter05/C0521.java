package PackageChapter05;

import java.util.Scanner;

public class C0521 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Loan Amount:");
		double loan = input.nextDouble();
		System.out.println("Number of Years:");
		double years = input.nextDouble();
		double MonthlyInterestRate, TotalPayment, MonthlyPayment;

		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		System.out.println("");

		for (double InterestRate = 5; InterestRate <= 8; InterestRate += 0.125) {

			MonthlyInterestRate = InterestRate / 1200;
			MonthlyPayment = loan * MonthlyInterestRate / (1 - 1 / Math.pow(1 + MonthlyInterestRate, years * 12));
			TotalPayment = MonthlyPayment * years * 12;

			System.out.printf("%5.3f%%%17.2f%21.2f\n", InterestRate, MonthlyPayment, TotalPayment);
		}
		input.close();
	}
}
