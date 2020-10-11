package PackageChapter11;

import java.util.Scanner;
import java.util.ArrayList;

public class C1109 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> row = new ArrayList<>();
		ArrayList<Integer> column = new ArrayList<>();

		System.out.println("Enter the array size n: ");
		int n = input.nextInt();

		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 2);
			}
		}

		int largestRow = 0;
		for (int i = 0; i < array.length; i++) {
			int totalRow = 0;
			for (int j = 0; j < array.length; j++) {
				totalRow = totalRow + array[i][j];
			}
			if (largestRow < totalRow) {
				largestRow = totalRow;
			}
		}

		int largestColumn = 0;
		for (int i = 0; i < array.length; i++) {
			int totalColumn = 0;
			for (int j = 0; j < array.length; j++) {
				totalColumn = totalColumn + array[j][i];
			}
			if (largestColumn < totalColumn) {
				largestColumn = totalColumn;
			}
		}

		System.out.println("The random array is");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}

		for (int i = 0; i < array.length; i++) {
			int total1 = 0;
			int total2 = 0;
			for (int j = 0; j < array.length; j++) {
				total1 = total1 + array[i][j];
				total2 = total2 + array[j][i];
			}
			if (largestRow == total1) {
				row.add(i);
			}
			if (largestColumn == total2) {
				column.add(i);
			}
		}

		System.out.println("The largest row index: " + row);
		System.out.println("The largest column index: " + column);

		input.close();
	}
}
