package PackageChapter08;

import java.util.Scanner;

public class C0836 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number n:");
		int n = input.nextInt();

		char[][] square = new char[n][n];

		System.out.println("Enter " + n + " rows of letters separated by spaces:");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				String str = input.next();
				char ch = str.charAt(0);
				if (ch >= 'A' && ch < (char) ('A' + square.length))
					square[i][j] = ch;
				else {
					System.out
							.println("Wrong input: the letters must be from A to " + (char) ('A' + square.length - 1));
					System.exit(1);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = j + 1; k < n - 1; k++) {
					if (square[i][j] == square[i][k]) {
						System.out.println("The input array is not a Latin square");
						System.exit(1);
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = j + 1; k < n - 1; k++) {
					if (square[j][i] == square[k][i]) {
						System.out.println("The input array is not a Latin square");
						System.exit(1);
					}
				}
			}
		}

		System.out.println("The input array is a Latin square");

		input.close();
	}
}
