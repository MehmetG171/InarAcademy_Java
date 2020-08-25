package PackageChapter07;

import java.util.Scanner;

public class C0703 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the integers between 1 and 100:");
		System.out.println("(If the score is out of range, the process will be terminated.)");
		int[] numbers = new int[100];
		int i = 0;
		int score = 0;

		while (0 <= score && score <= 100) {
			score = input.nextInt();
			numbers[i] = score;
			i++;
		}
		i = i - 1;

		for (int j = 0; j < i; j++) {
			for (int k = 1; k < i; k++) {
				if (numbers[k - 1] > numbers[k]) {
					int temp = numbers[k];
					numbers[k] = numbers[k - 1];
					numbers[k - 1] = temp;
				}
			}
		}

		int z = 0;
		int[] test = new int[i];
		for (int a = 0; a < i; a++) {
			if (!contains(test, numbers[a])) {
				int count = occurence(numbers, numbers[a]);
				if (count == 1) {
					System.out.println("'" + numbers[a] + "' occurs " + count + " time");
				} else {
					System.out.println("'" + numbers[a] + "' occurs " + count + " times");
				}
			}
			test[z] = numbers[a];
			z++;
		}

		input.close();
	}

	public static int occurence(int[] numbers, int i) {
		int count = 0;
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] == i) {
				count++;
			}
		}
		return count;
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
