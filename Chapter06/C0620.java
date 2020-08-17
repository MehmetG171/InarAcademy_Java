package PackageChapter06;

import java.util.Scanner;

public class C0620 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string:");
		String s = input.nextLine();

		int NumberOfLetters = countLetters(s);
		System.out.println("The number of letters in a string is " + NumberOfLetters);

		input.close();
	}

	public static int countLetters(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}
}
