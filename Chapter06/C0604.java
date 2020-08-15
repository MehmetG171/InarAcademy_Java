package PackageChapter06;

import java.util.Scanner;

public class C0604 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer:");
		long number = input.nextLong();

		reverse(number);

		input.close();
	}

	public static void reverse(long number) {
		String s = "" + number;
		String reverse = "";
		for (int i = s.length() - 1; 0 <= i; i--) {
			reverse = reverse + s.charAt(i);
		}
		long reversed = Long.parseLong(reverse);
		System.out.println("The reversal of " + number + " is " + reversed);
	}
}
