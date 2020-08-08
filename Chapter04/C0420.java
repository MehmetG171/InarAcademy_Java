package PackageChapter04;

import java.util.Scanner;

public class C0420 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str = input.next();

		char first = str.charAt(0);
		int lenght = str.length();

		System.out.println("The length of a string is " + lenght + " and its first character is " + first);

		input.close();
	}
}
