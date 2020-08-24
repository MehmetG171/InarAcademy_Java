package PackageChapter06;

import java.util.Scanner;

public class C0637 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number:");
		int number = input.nextInt();
		System.out.println("Enter a width:");
		int width = input.nextInt();

		String a = format(number, width);
		System.out.println(a);

		input.close();
	}

	public static String format(int number, int width) {
		String a = number + "";
		String b = "";
		if (a.length() < width) {
			for (int i = 1; i <= width - a.length(); i++) {
				b = b + '0';
			}
			return b + a;
		} else {
			return a;
		}
	}
}
