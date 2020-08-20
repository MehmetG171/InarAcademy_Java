package PackageChapter06;

import java.util.Scanner;

public class C0621 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string:");
		String s = input.nextLine();

		String a = s.toUpperCase();
		String b = "";

		for (int i = 0; i < a.length(); i++) {

			if (Character.isLetter(a.charAt(i))) {

				int Number = getNumber(a.charAt(i));
				b = b + Number;

			} else {
				b = b + a.charAt(i);
			}
		}

		System.out.println(b);

		input.close();
	}

	public static int getNumber(char uppercaseLetter) {
		if (uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C') {
			return 2;
		} else if (uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F') {
			return 3;
		} else if (uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I') {
			return 4;
		} else if (uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L') {
			return 5;
		} else if (uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O') {
			return 6;
		} else if (uppercaseLetter == 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R'
				|| uppercaseLetter == 'S') {
			return 7;
		} else if (uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V') {
			return 8;
		} else if (uppercaseLetter == 'W' || uppercaseLetter == 'X' || uppercaseLetter == 'Y'
				|| uppercaseLetter == 'Z') {
			return 9;
		}
		return 0;
	}
}