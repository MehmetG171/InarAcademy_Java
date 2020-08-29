package PackageChapter07;

import java.util.Scanner;

public class C0728 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 10 number:");

		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = input.nextInt();
		}

		int[] array1 = eliminateDuplicates(array);
		BubbleSort(array1);

		int count = 0;
		for (int k = 0; k < array1.length - 1; k++) {
			if (array1[k] != 0) {
				for (int j = k + 1; j < array1.length; j++) {
					count++;
					System.out.printf("%2d%3d\t", array1[k], array1[j]);
					if (count % 4 == 0) {
						System.out.println("   ");
					}
				}
			}
		}

		input.close();
	}

	public static int[] BubbleSort(int[] array) {
		for (int j = 0; j < array.length; j++) {
			for (int k = 1; k < array.length; k++) {
				if (array[k - 1] > array[k]) {
					int temp = array[k];
					array[k] = array[k - 1];
					array[k - 1] = temp;
				}
			}
		}
		return array;
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

	public static boolean contains(int[] numbers, int i) {
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] == i) {
				return true;
			}
		}
		return false;
	}
}
