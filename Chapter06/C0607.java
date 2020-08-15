package PackageChapter06;

import java.util.Scanner;

public class C0607 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("The amount invested:");
		double investment = input.nextDouble();

		System.out.println("Annual interest rate:");
		double MonthlyInterestRate = input.nextDouble();

		MonthlyInterestRate = MonthlyInterestRate / 1200;
		int years = 30;
		double FutureValue;
		System.out.println("Years    Future Value");

		for (int i = 1; i <= years; i++) {
			FutureValue = futureInvestmentValue(investment, MonthlyInterestRate, i);
			System.out.printf("%-5d%16.2f\n", i, FutureValue);
		}

		input.close();
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
	}
}
