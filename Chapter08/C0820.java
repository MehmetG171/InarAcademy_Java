package PackageChapter08;

import java.util.Scanner;

public class C0820 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char[][] board = new char[6][7];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				board[i][j] = ' ';
			}
		}

		int a = 5;
		int b = 5;
		int c = 5;
		int d = 5;
		int e = 5;
		int f = 5;
		int g = 5;
		int turn = 0;

		while (!checkSituation(board)) {
			printBoard(board);

			int drop = -1;
			if (turn % 2 == 0) {
				while (!(0 <= drop && drop < 7) || isValid(drop, a, b, c, d, e, f, g)) {
					System.out.println("Drop a red disk at column (0–6):");
					drop = input.nextInt();
				}
			} else {
				while (!(0 <= drop && drop < 7) || isValid(drop, a, b, c, d, e, f, g)) {
					System.out.println("Drop a yellow disk at column (0–6):");
					drop = input.nextInt();
				}
			}

			if (turn % 2 == 0) {
				switch (drop) {
				case 0:
					board[a][drop] = 'R';
					a--;
					break;
				case 1:
					board[b][drop] = 'R';
					b--;
					break;
				case 2:
					board[c][drop] = 'R';
					c--;
					break;
				case 3:
					board[d][drop] = 'R';
					d--;
					break;
				case 4:
					board[e][drop] = 'R';
					e--;
					break;
				case 5:
					board[f][drop] = 'R';
					f--;
					break;
				case 6:
					board[g][drop] = 'R';
					g--;
					break;
				default:
					break;
				}
			} else {
				switch (drop) {
				case 0:
					board[a][drop] = 'Y';
					a--;
					break;
				case 1:
					board[b][drop] = 'Y';
					b--;
					break;
				case 2:
					board[c][drop] = 'Y';
					c--;
					break;
				case 3:
					board[d][drop] = 'Y';
					d--;
					break;
				case 4:
					board[e][drop] = 'Y';
					e--;
					break;
				case 5:
					board[f][drop] = 'Y';
					f--;
					break;
				case 6:
					board[g][drop] = 'Y';
					g--;
					break;
				default:
					break;
				}
			}

			if (checkSituation(board)) {
				if (turn % 2 == 0) {
					printBoard(board);
					System.out.println("The red player won");
					System.exit(0);
				} else {
					printBoard(board);
					System.out.println("The yellow player won");
					System.exit(0);
				}
			}

			turn++;

			if (turn == 36) {
				printBoard(board);
				System.out.println("Draw");
				System.exit(0);
			}
		}

		input.close();
	}

	public static boolean isValid(int drop, int a, int b, int c, int d, int e, int f, int g) {
		if (a == -1 && drop == 0) {
			System.out.print("The column is full. ");
			return true;
		}
		if (b == -1 && drop == 1) {
			System.out.print("The column is full. ");
			return true;
		}
		if (c == -1 && drop == 2) {
			System.out.print("The column is full. ");
			return true;
		}
		if (d == -1 && drop == 3) {
			System.out.print("The column is full. ");
			return true;
		}
		if (e == -1 && drop == 4) {
			System.out.print("The column is full. ");
			return true;
		}
		if (f == -1 && drop == 5) {
			System.out.print("The column is full. ");
			return true;
		}
		if (g == -1 && drop == 6) {
			System.out.print("The column is full. ");
			return true;
		}
		return false;
	}

	public static void printBoard(char[][] board) {
		System.out.println("-----------------------------");

		for (int i = 0; i < 6; i++) {
			System.out.print("| ");
			for (int j = 0; j < 7; j++) {
				System.out.print(board[i][j] != ' ' ? board[i][j] + " | " : "  | ");
			}
			System.out.println("");
		}

		System.out.println("-----------------------------");
	}

	public static boolean checkSituation(char[][] values) {
		boolean situation = false;

		for (int i = 0; i < values.length; i++) {
			for (int j = 2; j < values[i].length - 1; j++) {
				if (values[i][j - 2] == values[i][j - 1] && values[i][j - 1] == values[i][j]
						&& values[i][j] == values[i][j + 1] && values[i][j - 2] != ' ') {
					situation = true;
				}
			}
		}

		for (int j = 0; j < values[0].length; j++) {
			for (int i = 0; i < values.length - 3; i++) {
				if (values[i][j] == values[i + 1][j] && values[i + 1][j] == values[i + 2][j]
						&& values[i + 2][j] == values[i + 3][j] && values[i][j] != ' ') {
					situation = true;
				}
			}
		}

		for (int i = 0; i < values.length - 3; i++) {
			for (int j = 2; j < values[i].length - 1; j++) {
				if (values[i][j - 2] == values[i + 1][j - 1] && values[i + 1][j - 1] == values[i + 2][j]
						&& values[i + 2][j] == values[i + 3][j + 1] && values[i][j - 2] != ' ') {
					situation = true;
				}
			}
		}

		for (int i = 0; i < values.length - 3; i++) {
			for (int j = values[i].length - 1; 2 < j; j--) {
				if (values[i][j] == values[i + 1][j - 1] && values[i + 1][j - 1] == values[i + 2][j - 2]
						&& values[i + 2][j - 2] == values[i + 3][j - 3] && values[i][j] != ' ') {
					situation = true;
				}
			}
		}

		return situation;
	}
}
