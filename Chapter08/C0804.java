package PackageChapter08;

import java.util.Scanner;

public class C0804 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of employees:");

		int NumberOfEmployees = input.nextInt();
		int[][] m = new int[NumberOfEmployees][7];

		for (int i = 0; i < m.length; i++) {
			System.out.println("Enter the working hours of employee " + (i + 1));
			System.out.println("Su M T W Th F Sa");
			for (int j = 0; j < 7; j++) {
				m[i][j] = input.nextInt();
			}
		}

		int[] totals = new int[NumberOfEmployees];
		String[] names = new String[NumberOfEmployees];

		for (int k = 0; k < NumberOfEmployees; k++) {
			for (int a = 0; a < 7; a++) {
				totals[k] = m[k][a] + totals[k];
			}

			names[k] = "Employee " + (k + 1);
		}

		for (int j = 0; j < totals.length; j++) {
			for (int k = 1; k < totals.length; k++) {
				if (totals[k - 1] > totals[k]) {
					int temp = totals[k];
					totals[k] = totals[k - 1];
					totals[k - 1] = temp;
					String temp1 = names[k];
					names[k] = names[k - 1];
					names[k - 1] = temp1;
				}
			}
		}

		for (int b = totals.length - 1; 0 <= b; b--) {
			System.out.println(names[b] + " with total " + totals[b] + " hours.");
		}

		input.close();
	}
}
