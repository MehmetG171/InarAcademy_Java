package PackageChapter08;

import java.util.Scanner;

public class C0816 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of rows of the array: ");
		int row = input.nextInt();

		int[][] a = new int[row][2];

		System.out.println("Enter the array:");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = input.nextInt();
			}
		}

		sort(a);

		input.close();
	}

	public static void sort(int m[][]) {
		for (int j = 0; j < m.length; j++) {
			for (int k = 1; k < m.length; k++) {
				if (m[k - 1][0] > m[k][0]) {
					int temp1 = m[k - 1][0];
					int temp2 = m[k - 1][1];
					m[k - 1][0] = m[k][0];
					m[k - 1][1] = m[k][1];
					m[k][0] = temp1;
					m[k][1] = temp2;
				} else if (m[k - 1][0] == m[k][0]) {
					if (m[k - 1][1] > m[k][1]) {
						int temp3 = m[k - 1][1];
						m[k - 1][1] = m[k][1];
						m[k][1] = temp3;
					}
				}
			}
		}

		for (int i = 0; i < m.length; i++) {
			for (int k = 0; k < 2; k++) {
				System.out.print(m[i][k] + " ");
			}
			System.out.println("");
		}
	}
}
