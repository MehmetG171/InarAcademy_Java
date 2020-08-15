package PackageChapter05;

import java.util.Scanner;

public class C0537 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int number = input.nextInt();
		String temp = "";

		for (int i = number; 0 < i; i = i / 2) {
			temp = (i % 2) + temp;
		}
		System.out.println("The binary value of " + number + " is " + temp);

		input.close();
	}
}
