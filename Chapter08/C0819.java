package PackageChapter08;

import java.util.Scanner;

public class C0819 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of rows and columns of the array: ");
		int row = input.nextInt();
		int column = input.nextInt();

		if (row < 4 && column < 4) {
			System.out.println("The array does not contain four consecutive numbers with same value.");
			System.exit(1);
		}

		int[][] a = new int[row][column];

		System.out.println("Enter the array:");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j] = input.nextInt();
			}
		}

		if (isConsecutiveFour(a)) {
			System.out.println("The array contains four consecutive numbers with same value.");
		} else {
			System.out.println("The array does not contain four consecutive numbers with same value.");
		}

		input.close();
	}

	public static boolean isConsecutiveFour(int[][] values) {
		boolean situation = false;

		for (int i = 0; i < values.length; i++) {
			for (int j = 2; j < values[i].length + 1; j++) {
				if (values[i][j - 2] == values[i][j - 1] && values[i][j - 1] == values[i][j]
						&& values[i][j] == values[i][j + 1]) {
					situation = true;
				}
			}
		}

		for (int j = 0; j < values[0].length; j++) {
			for (int i = 0; i < values.length - 3; i++) {
				if (values[i][j] == values[i + 1][j] && values[i + 1][j] == values[i + 2][j]
						&& values[i + 2][j] == values[i + 3][j]) {
					situation = true;
				}
			}
		}

		for (int i = 0; i < values.length - 3; i++) {
			for (int j = 2; j < values[i].length - 1; j++) {
				if (values[i][j - 2] == values[i + 1][j - 1] && values[i + 1][j - 1] == values[i + 2][j]
						&& values[i + 2][j] == values[i + 3][j + 1]) {
					situation = true;
				}
			}
		}

		for (int i = 0; i < values.length - 3; i++) {
			for (int j = values[i].length - 1; 2 < j; j--) {
				if (values[i][j] == values[i + 1][j - 1] && values[i + 1][j - 1] == values[i + 2][j - 2]
						&& values[i + 2][j - 2] == values[i + 3][j - 3]) {
					situation = true;
				}
			}
		}

		return situation;
	}
}
