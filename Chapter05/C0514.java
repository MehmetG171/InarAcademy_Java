package PackageChapter05;

import java.util.Scanner;

public class C0514 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the integer n1:");
		int n1 = input.nextInt();
		System.out.println("Enter the integer n2:");
		int n2 = input.nextInt();

		int d = Math.min(n1, n2);

		for (; 0 < d; d--) {
			if ((n1 % d == 0) && (n2 % d == 0)) {
				System.out.println("The greatest common divisor of " + n1 + " and " + n2 + " is " + d);
				System.exit(0);
				input.close();
			}
		}
	}
}
