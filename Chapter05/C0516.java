package PackageChapter05;

import java.util.Scanner;

public class C0516 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int number = input.nextInt();

		for (int i = 2; i <= number; i++) {

			while (number % i == 0) {
				number = number / i;
				System.out.println(i + "\t");
			}
		}
		input.close();
	}
}
