package PackageChapter06;

import java.util.Scanner;

public class C0623 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string:");
		String s = input.nextLine();
		System.out.println("Enter a character:");
		char ch = input.nextLine().charAt(0);

		char ch2 = ch;
		if (Character.isUpperCase(ch)) {
			ch = Character.toLowerCase(ch);
		}

		int frequency = count(s, ch);
		System.out.println("The number of occurrences of '" + ch2 + "' in the string is " + frequency);

		input.close();
	}

	public static int count(String str, char a) {
		int count = 0;
		String b = str.toLowerCase();
		for (int i = 0; i < b.length(); i++) {
			if (a == b.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
