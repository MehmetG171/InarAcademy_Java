package PackageChapter04;

import java.util.Scanner;

public class C0408 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an ASCII code:");
		int code = input.nextInt();

		if (127 < code) {
			System.out.println("Invalid code.");
		} else {
			System.out.println("The character for ASCII code " + code + " is " + (char) (code));
		}

		input.close();
	}
}
