package PackageChapter05;

import java.util.Scanner;

public class C0551 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first string:");
		String s1 = input.nextLine();
		System.out.println("Enter the second string:");
		String s2 = input.nextLine();

		int s1length = s1.length();
		int s2length = s2.length();
		int length;
		String common = "";

		if (s1.charAt(0) != s2.charAt(0)) {
			System.out.println(s1 + " and " + s2 + " have no common prefix");
			System.exit(0);
		}

		if (s1length < s2length) {
			length = s1length;
		} else {
			length = s2length;
		}

		for (int i = 0; i < length; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				common = common + s1.charAt(i);
			} else {
				System.out.println("The common prefix is " + common);
				System.exit(0);
			}
		}

		input.close();
	}
}
