package PackageChapter07;

import java.util.Scanner;

public class C0702 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter ten integers:");

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			int score = input.nextInt();
			numbers[i] = score;
		}
		System.out.println("Reverse order:");

		for (int j = numbers.length - 1; 0 <= j; j--) {
			System.out.print(numbers[j] + " ");
		}
		input.close();
	}
}
