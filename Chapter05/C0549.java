package PackageChapter05;

import java.util.Scanner;

public class C0549 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string:");
		String s = input.nextLine();

		String s1 = s.toLowerCase();
		int length = s1.length();
		int vowels = 0;
		int consonants = 0;
		char temp;

		for (int i = 0; i < length; i++) {
			temp = s1.charAt(i);
			if (Character.isLetter(temp)) {
				if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			} else {
				continue;
			}
		}
		System.out.println("The number of vowels is " + vowels);
		System.out.println("The number of consonants is " + consonants);

		input.close();
	}
}
