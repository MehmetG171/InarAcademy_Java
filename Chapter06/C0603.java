package PackageChapter06;

import java.util.Scanner;

public class C0603 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int number = input.nextInt();

		int numberReverse = reverse(number);

		if (isPalindrome(number, numberReverse)) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome.");
		}

		input.close();
	}

	public static int reverse(int number) {
		String str = "" + number;
		String strReverse = "";
		for (int i = str.length() - 1; 0 <= i; i--) {
			strReverse = strReverse + str.charAt(i);
		}
		int numberreverse = Integer.valueOf(strReverse);
		return numberreverse;
	}

	public static boolean isPalindrome(int a, int b) {
		boolean ispalindrome = false;
		if (a == b) {
			ispalindrome = true;
		}
		return ispalindrome;
	}
}
