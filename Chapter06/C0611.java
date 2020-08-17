package PackageChapter06;

import java.util.Scanner;

public class C0611 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salesAmount = 10000;
		System.out.println("Sales Amount      Commision");
		System.out.println("---------------------------");

		while (salesAmount <= 100000) {
			System.out.printf("%-8.0f%17.1f\n", salesAmount, computeCommission(salesAmount));
			salesAmount += 5000;
		}
		input.close();
	}

	public static double computeCommission(double salesAmount) {
		double commision = 0;
		double salary = 5000;
		if (salesAmount <= 5000) {
			commision = salary * 0.08;
		}
		if (5000 < salesAmount && salesAmount <= 10000) {
			commision = salary * 0.10 + salary * 0.08;
		}
		if (10000 < salesAmount) {
			commision = (salesAmount - 2 * salary) * 0.12 + salary * 0.10 + salary * 0.08;
		}
		return commision;
	}
}
