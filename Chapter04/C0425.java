package PackageChapter04;

import java.util.Scanner;

public class C0425 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = (int) (Math.random() * 10);
		int b = (int) (Math.random() * 10);
		int c = (int) (Math.random() * 10);
		int d = (int) (Math.random() * 10);

		char e = (char) (Math.random() * 26 + 65);
		char f = (char) (Math.random() * 26 + 65);
		char g = (char) (Math.random() * 26 + 65);

		System.out.println("The plate number is " + e + f + g + "-" + a + b + c + d);

		input.close();

	}

}
