package PackageChapter02;

import java.util.Scanner;

public class C0220 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter balance and interest rate (e.g., 3 for 3%):");
		double balance = input.nextDouble();
		double AnnualInterestRate = input.nextDouble();

		double Interest = balance * (AnnualInterestRate / 1200);

		System.out.println("The interest is " + Interest);
		
		input.close();
	}
}
