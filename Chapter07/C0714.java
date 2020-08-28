package PackageChapter07;

import java.util.Scanner;

public class C0714 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 5 numbers:");

		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		int commonDivisor = gcd(numbers);
		System.out.println("The greatest common divisor of the numbers is " + commonDivisor);
		input.close();
	}

	public static int gcd(int... numbers) {
		int small = numbers[0];
		int CommonDivisor = 1;

		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] < small) {
				small = numbers[j];
			}
		}

		for (int i = 1; i <= small; i++) {
			if (numbers[0] % i == 0 && numbers[1] % i == 0 && numbers[2] % i == 0 && numbers[3] % i == 0
					&& numbers[4] % i == 0) {
				CommonDivisor = i;
			}
		}
		return CommonDivisor;
	}
}
