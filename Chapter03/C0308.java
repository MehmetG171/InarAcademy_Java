package PackageChapter03;

import java.util.Scanner;

public class C0308 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three integers:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (c < b) {
			int temp1 = b;
			b = c;
			c = temp1;
		}

		if (c < a) {
			int temp2 = a;
			a = c;
			c = temp2;
		}

		if (b < a) {
			int temp3 = a;
			a = b;
			b = temp3;
		}

		System.out.println("Numbers in increasing order: " + a + " " + b + " " + c);

		input.close();
	}
}
