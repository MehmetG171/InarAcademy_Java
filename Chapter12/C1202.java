package PackageChapter12;

import java.util.Scanner;
import java.util.InputMismatchException;

public class C1202 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a, b;

		while (true) {
			try {
				System.out.println("Enter two integers:");
				a = input.nextInt();
				b = input.nextInt();
				break;
			} catch (InputMismatchException ex) {
				System.out.println("ERROR! Invalid input.");
				input.next();
			}
		}

		System.out.printf("The sum is " + (a + b));

		input.close();
	}
}
