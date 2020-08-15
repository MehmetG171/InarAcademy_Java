package PackageChapter05;

import java.util.Scanner;

public class C0548 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string:");
		String s = input.nextLine();

		int length = s.length();
		String s1 = "";

		for (int i = 0; i < length; i = i + 2) {
			s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);

		input.close();
	}
}
