package PackageChapter08;

import java.util.Scanner;

public class C0809 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int turns = 0;

		char[][] array = new char[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = ' ';
			}
		}
		while (turns < 9 || !checkSituation(array)) {
			System.out.println("\n-------------");

			for (int i = 0; i < 3; i++) {
				System.out.print("| ");
				for (int j = 0; j < 3; j++) {
					System.out.print(array[i][j] != ' ' ? array[i][j] + " | " : "  | ");
				}
				System.out.println("");
				System.out.println("-------------");
			}

			int row;
			int column;

			if (turns % 2 == 0) {

				System.out.print("Enter a row (0, 1, or 2) for player X:");
				row = input.nextInt();
				System.out.print("Enter a column (0, 1, or 2) for player X: ");
				column = input.nextInt();

				while (!(array[row][column] == ' ')) {
					System.out.println("This cell is already full. Enter again:");

					System.out.print("Enter a row (0, 1, or 2) for player X:");
					row = input.nextInt();
					System.out.print("Enter a column (0, 1, or 2) for player X: ");
					column = input.nextInt();
				}
				array[row][column] = 'X';
			} else {

				System.out.print("Enter a row (0, 1, or 2) for player O:");
				row = input.nextInt();
				System.out.print("Enter a column (0, 1, or 2) for player O: ");
				column = input.nextInt();

				while (!(array[row][column] == ' ')) {
					System.out.println("This cell is already full. Enter again:");

					System.out.print("Enter a row (0, 1, or 2) for player O:");
					row = input.nextInt();
					System.out.print("Enter a column (0, 1, or 2) for player O: ");
					column = input.nextInt();
				}
				array[row][column] = 'O';
			}

			if (checkSituation(array)) {
				System.out.println("\n-------------");

				for (int i = 0; i < 3; i++) {
					System.out.print("| ");
					for (int j = 0; j < 3; j++) {
						System.out.print(array[i][j] != ' ' ? array[i][j] + " | " : "  | ");
					}
					System.out.println("");
					System.out.println("-------------");
				}

				if (turns % 2 == 0) {
					System.out.println("X player won");
					System.exit(0);
				} else {
					System.out.println("O player won");
					System.exit(0);
				}
			}

			turns++;

			if (turns == 9) {
				System.out.println("\n-------------");

				for (int i = 0; i < 3; i++) {
					System.out.print("| ");
					for (int j = 0; j < 3; j++) {
						System.out.print(array[i][j] != ' ' ? array[i][j] + " | " : "  | ");
					}
					System.out.println("");
					System.out.println("-------------");
				}

				System.out.println("Draw");
				System.exit(0);
			}
		}

		input.close();
	}

	public static boolean checkSituation(char[][] array) {
		for (int i = 0; i < 3; i++) {
			if (array[i][1] == array[i][0] && array[i][1] == array[i][2] && (array[i][1] != ' ')) {
				return true;
			}
		}

		for (int j = 0; j < 3; j++) {
			if (array[1][j] == array[0][j] && array[2][j] == array[1][j] && (array[1][j] != ' ')) {
				return true;
			}
		}

		if (array[1][1] == array[0][0] && array[2][2] == array[1][1] && array[1][1] != ' ') {
			return true;
		}

		if (array[1][1] == array[0][2] && array[1][1] == array[2][0] && array[1][1] != ' ') {
			return true;
		}

		return false;
	}
}
