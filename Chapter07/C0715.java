package PackageChapter07;

import java.util.Scanner;

public class C0715 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter ten numbers:");

		int[] newNumbers = new int[10];
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		newNumbers = eliminateDuplicates(numbers);

		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < numbers.length; i++) {
			if (newNumbers[i] != 0) {
				System.out.print(newNumbers[i] + " ");
			}
		}

		input.close();

	}

	public static boolean contains(int[] numbers, int i) {
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] == i) {
				return true;
			}
		}
		return false;
	}

	public static int[] eliminateDuplicates(int[] numbers) {
		int a = 0;
		int[] newNumbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] == numbers[j] && !contains(newNumbers, numbers[j])) {
					newNumbers[a] = numbers[j];
					a++;
				}
			}
		}

		return newNumbers;
	}
}
