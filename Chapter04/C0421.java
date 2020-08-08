package PackageChapter04;

import java.util.Scanner;

public class C0421 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a SSN:");
		String SSN = input.next();

		if (SSN.length() == 11) {

			char a = SSN.charAt(0);
			char b = SSN.charAt(1);
			char c = SSN.charAt(2);
			char d = SSN.charAt(4);
			char e = SSN.charAt(5);
			char f = SSN.charAt(7);
			char g = SSN.charAt(8);
			char h = SSN.charAt(9);
			char j = SSN.charAt(10);

			if (SSN.contains("[a-zA-Z]+") == true) {
				System.out.println(SSN + " is an invalid social security number");
			}
			if ((Character.isDigit(a) == false) || (Character.isDigit(b) == false) || (Character.isDigit(c) == false)
					|| (Character.isDigit(d) == false) || (Character.isDigit(e) == false)
					|| (Character.isDigit(f) == false) || (Character.isDigit(g) == false)
					|| (Character.isDigit(h) == false) || (Character.isDigit(j) == false)) {
				System.out.println(SSN + " is an invalid social security number");

			} else {
				System.out.println(SSN + " is a valid social security number");
			}
		} else {
			System.out.println(SSN + " is an invalid social security number");
		}

		input.close();
	}
}
