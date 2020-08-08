package PackageChapter03;

import java.util.Scanner;

public class C0309 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first 9 digits of an ISBN as integer:");
		int number = input.nextInt();

		int d1 = number / 100000000;

		int remain = number % 100000000;

		int d2 = remain / 10000000;

		remain = remain % 10000000;

		int d3 = remain / 1000000;

		remain = remain % 1000000;

		int d4 = remain / 100000;

		remain = remain % 100000;

		int d5 = remain / 10000;

		remain = remain % 10000;

		int d6 = remain / 1000;

		remain = remain % 1000;

		int d7 = remain / 100;

		remain = remain % 100;

		int d8 = remain / 10;

		remain = remain % 10;

		int d9 = remain / 1;

		remain = remain % 1;

		int checksum = (1 * d1 + 2 * d2 + 3 * d3 + 4 * d4 + 5 * d5 + 6 * d6 + 7 * d7 + 8 * d8 + 9 * d9) % 11;

		if (checksum == 10) {
			System.out.println("The ISBN-10 number is " + number + "X");
		} else {
			System.out.println("The ISBN-10 number is " + number + checksum);
		}

		input.close();
	}
}
