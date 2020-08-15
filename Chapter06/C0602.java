package PackageChapter06;

import java.util.Scanner;

public class C0602 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer:");
		long integer = input.nextLong();

		long sum = sumDigits(integer);

		System.out.println("The sum of digits is " + sum);

		input.close();
	}

	public static long sumDigits(long n) {
		long total = 0;
		while (0 < n) {
			total = total + n % 10;
			n = n / 10;
		}
		return total;
	}
}
