package PackageChapter07;

import java.util.Scanner;

public class C0730 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of values:");
		int length = input.nextInt();

		if (length < 4) {
			System.out.println("Inadequate number.");
			System.exit(0);
		}

		System.out.println("Enter the values:");

		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = input.nextInt();
		}

		if (isConsecutiveFour(array)) {
			System.out.println("The list has consecutive fours.");
		} else {
			System.out.println("The list has no consecutive fours.");
		}

		input.close();
	}

	public static boolean isConsecutiveFour(int[] array) {
		for (int i = 2; i < array.length + 1; i++) {
			if (array[i - 2] == array[i - 1] && array[i - 1] == array[i] && array[i] == array[i + 1]) {
				return true;
			}
		}
		return false;
	}
}
