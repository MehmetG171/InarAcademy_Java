package PackageChapter05;

import java.util.Scanner;

public class C0531 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the initial deposit amount:");
		double amount = input.nextDouble();
		System.out.println("Enter annual percentage yield:");
		double percentage = input.nextDouble();
		System.out.println("Enter maturity period (number of months):");
		int months = input.nextInt();

		int i = 1;
		System.out.println("Month   CD Value");

		while (i <= months) {
			amount = amount + amount * percentage / 1200;
			System.out.printf("%-4d%12.2f\n", i, amount);
			i++;
		}
		input.close();
	}
}
