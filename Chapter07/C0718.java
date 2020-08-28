package PackageChapter07;

import java.util.Scanner;

public class C0718 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Bubble Sort");
		System.out.println("Enter ten numbers:");

		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		int[] sorted = BubbleSort(numbers);
		System.out.println("The sorted numbers are: ");

		for (int j = 0; j < numbers.length; j++) {
			System.out.print(sorted[j] + " ");
		}

		input.close();
	}

	public static int[] BubbleSort(int[] numbers) {
		for (int j = 0; j < numbers.length; j++) {
			for (int k = 1; k < numbers.length; k++) {
				if (numbers[k - 1] > numbers[k]) {
					int temp = numbers[k];
					numbers[k] = numbers[k - 1];
					numbers[k - 1] = temp;
				}
			}
		}
		return numbers;
	}
}
