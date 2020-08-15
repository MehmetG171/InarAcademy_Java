package PackageChapter05;

import java.util.Scanner;

public class C0538 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int number = input.nextInt();
		String temp = "";

		for (int i = number; 0 < i; i = i / 8) {
			temp = (i % 8) + temp;
		}
		System.out.println("The octal value of " + number + " is " + temp);

		input.close();
	}
}
