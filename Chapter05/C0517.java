package PackageChapter05;

import java.util.Scanner;

public class C0517 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of lines between 1 and 15:");
		int number = input.nextInt();

		if (number < 1 || 15 < number) {
			System.out.println("Out of range!");
		} else {
			for (int m = 0; m < number + 1; m++) {
				for (int k = 1; k < number + 1 - m; k++) {
					System.out.print("    ");
				}
				for (int n = 1; n <= m; n++) {
					System.out.printf("%3d ", n);
				}
				for (int j = m - 1; 1 <= j; j--) {
					System.out.printf("%3d ", j);
				}
				System.out.println();
			}
		}

		input.close();
	}
}
