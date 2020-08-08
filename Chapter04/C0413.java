package PackageChapter04;

import java.util.Scanner;

public class C0413 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter:");
		char value = input.next().charAt(0);

		if (!Character.isLetter(value)) {
			System.out.println(value + " is an invalid input");
		} else {
			switch (value) {
			case 'A':
				System.out.println(value + " is a vowel");
				break;
			case 'a':
				System.out.println(value + " is a vowel");
				break;
			case 'E':
				System.out.println(value + " is a vowel");
				break;
			case 'e':
				System.out.println(value + " is a vowel");
				break;
			case 'I':
				System.out.println(value + " is a vowel");
				break;
			case 'i':
				System.out.println(value + " is a vowel");
				break;
			case 'O':
				System.out.println(value + " is a vowel");
				break;
			case 'o':
				System.out.println(value + " is a vowel");
				break;
			case 'U':
				System.out.println(value + " is a vowel");
				break;
			case 'u':
				System.out.println(value + " is a vowel");
				break;
			default:
				System.out.println(value + " is a consonant");

			}
		}

		input.close();
	}

}
