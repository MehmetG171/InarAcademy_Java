package PackageChapter06;

import java.util.Scanner;

public class C0631 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a credit card number:");
		String number = input.nextLine();
		if (isValid(number)) {
			System.out.println(number + " is valid.");
		} else {
			System.out.println(number + " is invalid.");
		}

		input.close();
	}

	public static int getSize(String number) {
		return number.length();
	}

	public static int sumOfDoubleEvenPlace(String number) {
		int sum = 0;
		for (int i = getSize(number) - 2; 0 <= i; i = i - 2) {
			sum = sum + getDigit(Integer.parseInt(number.charAt(i) + "") * 2);
		}
		return sum;
	}

	public static int sumOfOddPlace(String number) {
		int sum = 0;
		for (int i = getSize(number) - 1; 0 < i; i = i - 2) {
			sum = sum + Integer.parseInt(number.charAt(i) + "");
		}
		return sum;
	}

	public static int getDigit(int number) {
		if (number < 10) {
			return number;
		} else {
			return number / 10 + number % 10;
		}
	}

	public static String getPrefix(String number, int k) {
		if (getSize(number) >= k) {
			String number1 = number + "";
			return number1.substring(0, k);
		} else {
			return number;
		}
	}

	public static boolean prefixMatched(String number, int d) {
		boolean prefixmatched = false;
		String a = d + "";
		if (Integer.parseInt(getPrefix(number, getSize(a))) == d) {
			prefixmatched = true;
		}
		return prefixmatched;
	}

	public static boolean isValid(String number) {
		int d = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		if ((d % 10 == 0) && (getSize(number) <= 16 && 13 <= getSize(number)) && (prefixMatched(number, 4)
				|| prefixMatched(number, 37) || prefixMatched(number, 5) || prefixMatched(number, 6))) {
			return true;
		} else {
			return false;
		}
	}
}
