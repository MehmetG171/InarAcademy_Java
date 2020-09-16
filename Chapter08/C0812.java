package PackageChapter08;

import java.util.Scanner;

public class C0812 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] brackets = { { 8350, 33950, 82250, 171550, 372950 }, { 16700, 67900, 137050, 20885, 372950 },
				{ 8350, 33950, 68525, 104425, 186475 }, { 11950, 45500, 117450, 190200, 372950 } };

		double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };

		System.out.println(
				"0-single filer, 1-married jointly or qualifying widow(er), 2-married separately, 3-head of household");
		System.out.println("Enter the filing status: ");
		int status = input.nextInt();

		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();

		double tax = 0;

		if (status < 4) {
			switch (status) {
			case 0:
				if (income <= brackets[0][0]) {
					tax = income * rates[0];
				} else if (income <= brackets[0][1]) {
					tax = brackets[0][0] * rates[0] + (income - brackets[0][0]) * rates[1];
				} else if (income <= brackets[0][2]) {
					tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1]
							+ (income - brackets[0][1]) * rates[2];
				} else if (income <= brackets[0][3]) {
					tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1]
							+ (brackets[0][2] - brackets[0][1]) * rates[2] + (income - brackets[0][2]) * rates[3];
				} else if (income <= brackets[0][4]) {
					tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1]
							+ (brackets[0][2] - brackets[0][1]) * rates[2]
							+ (brackets[0][3] - brackets[0][2]) * rates[3] + (income - brackets[0][3]) * rates[4];
				} else {
					tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1]
							+ (brackets[0][2] - brackets[0][1]) * rates[2]
							+ (brackets[0][3] - brackets[0][2]) * rates[3]
							+ (brackets[0][4] - brackets[0][3]) * rates[4] + (income - brackets[0][4]) * rates[5];
				}
				break;

			case 1:
				if (income <= brackets[1][0]) {
					tax = income * rates[0];
				} else if (income <= brackets[1][1]) {
					tax = brackets[1][0] * rates[0] + (income - brackets[1][0]) * rates[1];
				} else if (income <= brackets[1][2]) {
					tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1]
							+ (income - brackets[0][1]) * rates[2];
				} else if (income <= brackets[1][3]) {
					tax = brackets[1][0] * rates[0] + (brackets[1][1] - brackets[1][0]) * rates[1]
							+ (brackets[1][2] - brackets[1][1]) * rates[2] + (income - brackets[1][2]) * rates[3];
				} else if (income <= brackets[1][4]) {
					tax = brackets[1][0] * rates[0] + (brackets[1][1] - brackets[1][0]) * rates[1]
							+ (brackets[1][2] - brackets[1][1]) * rates[2]
							+ (brackets[1][3] - brackets[1][2]) * rates[3] + (income - brackets[1][3]) * rates[4];
				} else {
					tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1]
							+ (brackets[0][2] - brackets[0][1]) * rates[2]
							+ (brackets[0][3] - brackets[0][2]) * rates[3]
							+ (brackets[0][4] - brackets[0][3]) * rates[4] + (income - brackets[0][4]) * rates[5];

				}
				break;

			case 2:
				if (income <= brackets[2][0]) {
					tax = income * rates[0];
				} else if (income <= brackets[2][1]) {
					tax = brackets[2][0] * rates[0] + (income - brackets[2][0]) * rates[1];
				} else if (income <= brackets[2][2]) {
					tax = brackets[2][0] * rates[0] + (brackets[2][1] - brackets[2][0]) * rates[1]
							+ (income - brackets[2][1]) * rates[2];
				} else if (income <= brackets[2][3]) {
					tax = brackets[2][0] * rates[0] + (brackets[2][1] - brackets[2][0]) * rates[1]
							+ (brackets[2][2] - brackets[2][1]) * rates[2] + (income - brackets[2][2]) * rates[3];
				} else if (income <= brackets[2][4]) {
					tax = brackets[2][0] * rates[0] + (brackets[2][1] - brackets[2][0]) * rates[1]
							+ (brackets[2][2] - brackets[2][1]) * rates[2]
							+ (brackets[2][3] - brackets[2][2]) * rates[3] + (income - brackets[2][3]) * rates[4];
				} else {
					tax = brackets[0][0] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1]
							+ (brackets[0][2] - brackets[0][1]) * rates[2]
							+ (brackets[0][3] - brackets[0][2]) * rates[3]
							+ (brackets[0][4] - brackets[0][3]) * rates[4] + (income - brackets[0][4]) * rates[5];

				}
				break;

			case 3:
				if (income <= brackets[3][0]) {
					tax = income * rates[0];
				} else if (income <= brackets[3][1]) {
					tax = brackets[3][0] * rates[0] + (income - brackets[3][0]) * rates[1];
				} else if (income <= brackets[3][2]) {
					tax = brackets[1][0] * rates[0] + (brackets[1][1] - brackets[1][0]) * rates[1]
							+ (income - brackets[1][1]) * rates[2];
				} else if (income <= brackets[3][3]) {
					tax = brackets[3][0] * rates[0] + (brackets[3][1] - brackets[3][0]) * rates[1]
							+ (brackets[3][2] - brackets[3][1]) * rates[2] + (income - brackets[3][2]) * rates[3];
				} else if (income <= brackets[3][4]) {
					tax = brackets[3][0] * rates[0] + (brackets[3][1] - brackets[3][0]) * rates[1]
							+ (brackets[3][2] - brackets[3][1]) * rates[2]
							+ (brackets[3][3] - brackets[3][2]) * rates[3] + (income - brackets[3][3]) * rates[4];
				} else {
					tax = brackets[3][0] * rates[0] + (brackets[3][1] - brackets[3][0]) * rates[1]
							+ (brackets[3][2] - brackets[3][1]) * rates[2]
							+ (brackets[3][3] - brackets[3][2]) * rates[3]
							+ (brackets[3][4] - brackets[3][3]) * rates[4] + (income - brackets[3][4]) * rates[5];
				}
				break;
			default:
			}
		} else {
			System.out.println("Error: invalid status");
			System.exit(1);
		}

		System.out.println("Tax is " + (int) (tax * 100) / 100.0);

		input.close();
	}
}
