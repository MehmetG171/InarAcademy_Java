package PackageChapter05;

import java.util.Scanner;

public class C0544 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer:");
		short number = input.nextShort();

		String binary = "";
		for (int i = 1; i <= 16; i++) {
			binary = (number & 1) + binary;
			number >>= 1;
		}
		System.out.println("The bits are " + binary);

		input.close();
	}
}
