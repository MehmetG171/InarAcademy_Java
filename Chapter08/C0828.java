package PackageChapter08;

import java.util.Scanner;

public class C0828 {

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
			System.out.println("The two arrays are strictly identical");
		} else {
			System.out.println("The two arrays are not strictly identical");
		}

		input.close();
	}

	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
