package PackageChapter08;

import java.util.Scanner;

public class C0829 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 3-by-3 list1:");

		int[][] array1 = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array1[i][j] = input.nextInt();
			}
		}

		System.out.println("Enter a 3-by-3 list2:");

		int[][] array2 = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array2[i][j] = input.nextInt();
			}
		}

		if (equals(array1, array2)) {
			System.out.println("The two arrays are identical");
		} else {
			System.out.println("The two arrays are not identical");
		}

		input.close();
	}

	public static boolean equals(int[][] array1, int[][] array2) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!contains(array2, array1[i][j]) || !contains(array1, array2[i][j])) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean contains(int[][] array, int number) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array[i][j] == number) {
					return true;
				}
			}
		}
		return false;
	}
}
