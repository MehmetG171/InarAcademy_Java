package PackageChapter04;

import java.util.Scanner;

public class C0415 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter:");
		char letter = input.next().charAt(0);
		char c;

		if (!Character.isLetter(letter)) {
			System.out.println(letter + " is an invalid input");
		} else {
			c = Character.toUpperCase(letter);

			if (c == 'A' || c == 'B' || c == 'C') {
				System.out.println("The corresponding number is 2");
			} else if (c == 'D' || c == 'E' || c == 'F') {
				System.out.println("The corresponding number is 3");
			} else if (c == 'G' || c == 'H' || c == 'I') {
				System.out.println("The corresponding number is 4");
			} else if (c == 'J' || c == 'K' || c == 'L') {
				System.out.println("The corresponding number is 5");
			} else if (c == 'M' || c == 'N' || c == 'O') {
				System.out.println("The corresponding number is 6");
			} else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
				System.out.println("The corresponding number is 7");
			} else if (c == 'T' || c == 'U' || c == 'V') {
				System.out.println("The corresponding number is 8");
			} else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {
				System.out.println("The corresponding number is 9");
			}
		}

		input.close();
	}
}
