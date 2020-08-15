package PackageChapter05;

import java.util.Scanner;

public class C0547 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string:");
		String s = input.nextLine();

		int total = 0;

		if (s.length() != 12) {
			System.out.println(s + " is an invalid input.");
			System.exit(0);
		}

		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				total = total + Integer.parseInt(String.valueOf(s.charAt(i)));
			} else {
				total = total + 3 * Integer.parseInt(String.valueOf(s.charAt(i)));
			}
		}
		int checksum = 10 - total % 10;

		if (checksum == 10) {
			System.out.println("The ISBN-13 number is " + s + 0);
		} else {
			System.out.println("The ISBN-13 number is " + s + checksum);
		}
		input.close();
	}

}
