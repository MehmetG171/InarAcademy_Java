package PackageChapter08;

import java.util.Scanner;

public class C0814 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the size for the matrix:");
		int size = input.nextInt();

		int[][] binary = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				binary[i][j] = (int) (Math.random() * 2);
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(binary[i][j]);
			}
			System.out.println("");
		}

		boolean situation = false;
		for (int i = 0; i < size; i++) {
			int total = 0;
			for (int j = 0; j < size; j++) {
				total = total + binary[i][j];
			}
			if (total == size) {
				System.out.println("All 1s on row " + i);
				situation = true;
			}
			if (total == 0) {
				System.out.println("All 0s on row " + i);
				situation = true;
			}
		}

		if (!situation) {
			System.out.println("No same numbers on a row");
		}

		boolean situation1 = false;
		for (int i = 0; i < size; i++) {
			int total1 = 0;
			for (int j = 0; j < size; j++) {
				total1 = total1 + binary[j][i];
			}
			if (total1 == size) {
				System.out.println("All 1s on column " + i);
				situation1 = true;
			}
			if (total1 == 0) {
				System.out.println("All 0s on column " + i);
				situation1 = true;
			}
		}

		if (!situation1) {
			System.out.println("No same numbers on a column");
		}

		boolean situation2 = false;
		int total2 = 0;
		for (int i = 0; i < size; i++) {
			total2 = total2 + binary[i][i];
		}
		if (total2 == size) {
			System.out.println("All 1s on the major diagonal");
			situation2 = true;
		}
		if (total2 == 0) {
			System.out.println("All 0s on the major diagonal");
			situation2 = true;
		}

		boolean situation3 = false;
		int total3 = 0;
		for (int i = size - 1; 0 <= i; i--) {
			total3 = total3 + binary[size - i - 1][i];
		}
		if (total3 == size) {
			System.out.println("All 1s on the major diagonal");
			situation3 = true;
		}
		if (total3 == 0) {
			System.out.println("All 0s on the major diagonal");
			situation3 = true;
		}

		if (!situation3 && !situation2) {
			System.out.println("No same numbers on the major diagonal");
		}

		boolean situation4 = false;
		for (int i = 0; i < size; i++) {
			if (binary[i][size - i - 1] != binary[0][size - 1]) {
				situation4 = true;
			}
		}

		if (!situation4) {
			System.out.println("No same numbers on the sub-diagonal");
		} else {
			System.out.println("All " + binary[0][size - 1] + "s on sub-diagonal");
		}

		input.close();
	}
}
