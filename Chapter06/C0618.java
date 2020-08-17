package PackageChapter06;

import java.util.Scanner;

public class C0618 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a password:");
		String s = input.nextLine();

		if (IsValid(s)) {
			System.out.println("Valid Password.");
		} else {
			System.out.println("Invalid Password!");
		}
		input.close();
	}

	public static boolean IsValid(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))) {
				return false;
			}
			if (Character.isDigit(s.charAt(i))) {
				count++;
			}
		}

		if (count < 2) {
			return false;
		}
		if (s.length() < 8) {
			return false;
		}

		return true;
	}
}
