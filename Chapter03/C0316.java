package PackageChapter03;

import java.util.Scanner;

public class C0316 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double x = Math.random() * 100 - 50;
		double y = Math.random() * 200 - 100;

		System.out.println("Random point in a rectangle with width 100 and height 200 is (" + x + ", " + y + ")");

		input.close();
	}
}
