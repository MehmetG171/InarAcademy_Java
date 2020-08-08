package PackageChapter04;

import java.util.Scanner;

public class C0409 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a character:");
		char code = input.next().charAt(0);

		System.out.println("The Unicode for the character " + code + " is " + (int) (code));

		input.close();
	}

}
