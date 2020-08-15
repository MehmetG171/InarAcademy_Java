package PackageChapter05;

import java.util.Scanner;

public class C0515 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("The ASCII character table");

		for (int i = 33; i <= 126; i++) {

			System.out.print((char) i + " ");

			if ((i - 32) % 10 == 0) {
				System.out.println("");
			}
		}
		input.close();
	}
}
