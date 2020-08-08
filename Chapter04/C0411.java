package PackageChapter04;

import java.util.Scanner;

public class C0411 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a decimal value (0 to 15):");
		int value = input.nextInt();

		if (15 < value) {
			System.out.println(value + " is an invalid input");
		} else {
			String c = Integer.toHexString(value);
			c.toUpperCase();
			System.out.println("The hex value is " + c.toUpperCase());
		}

		input.close();
	}

}
