package PackageChapter05;

import java.util.Scanner;

public class C0546 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string:");
		String s = input.nextLine();

		int length = s.length();

		for (int j = length - 1; 0 <= j; j--) {
			System.out.print(s.charAt(j));
		}
		input.close();
	}
}
