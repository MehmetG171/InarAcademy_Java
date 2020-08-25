package PackageChapter07;

import java.util.Scanner;

public class C0705 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter ten numbers:");

		int[] numbers = new int[10];
		int[] distinct = new int[10];
		int a = 0;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		for (int j = 0; j < numbers.length; j++) {
			for (int k = 0; k < numbers.length; k++) {
				if (numbers[k] == numbers[j] && !contains(distinct, numbers[k])) {
					distinct[a] = numbers[j];
					a++;
				}
			}
		}

		System.out.println("The number of distinct number is " + a);
		System.out.print("The distinct numbers are: ");
		for (int b = 0; b < a; b++) {
			System.out.print(distinct[b] + " ");
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
}
