package PackageChapter08;

import java.util.Scanner;

public class C0823 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 6-by-6 matrix row by row:");

		int[][] array = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				array[i][j] = input.nextInt();
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}

		int rowIndex = RowIndex(array);
		int columnIndex = columnIndex(array);
		if (rowIndex != -1 && columnIndex != -1) {
			System.out.println("The flipped cell is (" + rowIndex + ", " + columnIndex + ")");
		} else {
			System.out.println("There is not any flipped cell.");
		}

		input.close();
	}

	public static int columnIndex(int[][] array) {
		int ColumnIndex = -1;
		for (int i = 0; i < 6; i++) {
			int total = 0;
			for (int j = 0; j < 6; j++) {
				total = total + array[j][i];
			}
			if (total % 2 != 0 && total != 0) {
				ColumnIndex = i;
				return ColumnIndex;
			}
		}
		return ColumnIndex;
	}

	public static int RowIndex(int[][] array) {
		int RowIndex = -1;
		for (int i = 0; i < 6; i++) {
			int total = 0;
			for (int j = 0; j < 6; j++) {
				total = total + array[i][j];
			}
			if (total % 2 != 0 && total != 0) {
				RowIndex = i;
				return RowIndex;
			}
		}
		return RowIndex;
	}
}
