package PackageChapter04;

import java.util.Scanner;

public class C0419 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first 9 digits of an ISBN as integer:");
		String number = input.next();

		char c1 = number.charAt(0);
		char c2 = number.charAt(1);
		char c3 = number.charAt(2);
		char c4 = number.charAt(3);
		char c5 = number.charAt(4);
		char c6 = number.charAt(5);
		char c7 = number.charAt(6);
		char c8 = number.charAt(7);
		char c9 = number.charAt(8);
		int d1 = (int) c1 - 48;
		int d2 = (int) c2 - 48;
		int d3 = (int) c3 - 48;
		int d4 = (int) c4 - 48;
		int d5 = (int) c5 - 48;
		int d6 = (int) c6 - 48;
		int d7 = (int) c7 - 48;
		int d8 = (int) c8 - 48;
		int d9 = (int) c9 - 48;

		int checksum = (1 * d1 + 2 * d2 + 3 * d3 + 4 * d4 + 5 * d5 + 6 * d6 + 7 * d7 + 8 * d8 + 9 * d9) % 11;

		if (checksum == 10) {
			System.out.println("The ISBN-10 number is " + number + "X");
		} else {
			System.out.println("The ISBN-10 number is " + number + checksum);
		}

		input.close();
	}
}
