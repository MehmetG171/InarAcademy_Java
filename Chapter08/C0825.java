package PackageChapter08;

import java.util.Scanner;

public class C0825 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 3-by-3 matrix row by row:");

		double[][] array = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = input.nextDouble();
			}
		}

		if (isMarkovMatrix(array)) {
			System.out.println("It is a Markov matrix");
		} else {
			System.out.println("It is not a Markov matrix");
		}

		input.close();
	}

	public static boolean isMarkovMatrix(double[][] m) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (m[i][j] < 0) {
					return false;
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			double total = 0;
			for (int j = 0; j < 3; j++) {
				total = total + m[j][i];
			}
			if (total != 1) {
				return false;
			}
		}

		return true;
	}
}
