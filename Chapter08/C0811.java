package PackageChapter08;

import java.util.Scanner;

public class C0811 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number between 0 and 511:");
		int number = input.nextInt();

		int[][] binary = new int[3][3];

		for (int i = 2; 0 <= i; i--) {
			for (int j = 2; 0 <= j; j--) {
				binary[i][j] = (number & 1);
				number >>= 1;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (binary[i][j] == 1) {
					System.out.print("T ");
				} else {
					System.out.print("H ");
				}
			}
			System.out.println("");
		}

		input.close();
	}
}
