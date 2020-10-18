package PackageChapter12;

import java.util.Scanner;

public class C1203 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] array = new int[100];

		for (int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		}

		System.out.println("Enter the index of the array:");
		int index = input.nextInt();

		try {
			System.out.println("Corresponding value --> " + array[index]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}

		input.close();
	}
}
