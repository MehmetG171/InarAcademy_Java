package PackageChapter06;

import java.util.Scanner;

public class C0606 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int number = input.nextInt();

		displayPattern(number);

		input.close();
	}

	public static void displayPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("    ");
			}
			for (int k = i; 1 <= k; k--) {
				System.out.printf("%-4d", k);
			}
			System.out.println("");
		}
	}
}
