package PackageChapter08;

import java.util.Scanner;

public class C0813 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of rows and columns of the array: ");
		int row = input.nextInt();
		int column = input.nextInt();

		double[][] a = new double[row][column];

		System.out.println("Enter the array:");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j] = input.nextDouble();
			}
		}

		int[] indices = locateLargest(a);
		System.out.println("The location of the largest element is at (" + indices[0] + ", " + indices[1] + ")");

		input.close();
	}

	public static int[] locateLargest(double[][] a) {
		int[] indices = new int[2];
		double largest = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > largest) {
					indices[0] = i;
					indices[1] = j;
					largest = a[i][j];
				}
			}
		}
		return indices;
	}
}
