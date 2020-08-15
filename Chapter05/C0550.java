package PackageChapter05;

import java.util.Scanner;

public class C0550 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string:");
		String s = input.nextLine();

		int length = s.length();
		int count = 0;

		for (int i = 0; i < length; i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				count++;
			} else {
				continue;
			}
		}
		System.out.println("The number of uppercase letters is " + count);
		input.close();
	}
}
