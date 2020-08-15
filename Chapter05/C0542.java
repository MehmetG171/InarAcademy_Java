package PackageChapter05;

import java.util.Scanner;

public class C0542 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the commision sought:");
		final double COMMISSION_SOUGHT = input.nextDouble();
		input.close();

		double salary = 5000;
		double commision = 0;
		double sales;

		for (sales = 0; commision < COMMISSION_SOUGHT; sales = sales + 0.01) {
			if (sales <= 5000) {
				commision = salary * 0.08;
			}
			if (5000 < sales && sales <= 10000) {
				commision = salary * 0.10 + salary * 0.08;
			}
			if (10000 < sales) {
				commision = (sales - 2 * salary) * 0.12 + salary * 0.10 + salary * 0.08;
			}
		}
		System.out.printf("The minimum sales amount to earn $%.2f commision in a year is $%.2f", COMMISSION_SOUGHT,
				sales - 0.01);
	}
}
