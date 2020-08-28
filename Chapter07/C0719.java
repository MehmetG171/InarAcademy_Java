package PackageChapter07;

import java.util.Scanner;

public class C0719 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of integers:");
		int length = input.nextInt();

		System.out.println("Enter the integers:");

		int[] numbers = new int[length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		if (isSorted(numbers)) {
			System.out.println("The integers are already sorted.");
		} else {
			System.out.println("The integers are not sorted.");
		}

		input.close();
	}

	public static boolean isSorted(int[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < numbers[i - 1]) {
				return false;
			}
		}
		return true;
	}
}
