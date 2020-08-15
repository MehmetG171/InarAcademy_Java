package PackageChapter05;

import java.util.Scanner;

public class C0536 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first 9 digits of an ISBN as integer:");
		String firstnum = input.nextLine();

		int number = Integer.parseInt(firstnum);

		int checksum = 0;
		for (int i = 8; 0 <= i; i--) {
			checksum = checksum + (int) (number / Math.pow(10, i)) * Math.abs(i - 9);
			number = number % (int) (Math.pow(10, i));
		}
		checksum = checksum % 11;

		if (checksum == 10) {
			System.out.println("The ISBN-10 number is " + firstnum + "X");
		} else {
			System.out.println("The ISBN-10 number is " + firstnum + checksum);
		}

		input.close();
	}
}
