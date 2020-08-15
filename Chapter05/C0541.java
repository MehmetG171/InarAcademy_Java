package PackageChapter05;

import java.util.Scanner;

public class C0541 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter numbers:");
		int max = input.nextInt();
		int number = -1;
		int count = 1;

		while (number != 0) {
			number = input.nextInt();
			if (max < number) {
				max = number;
				count = 1;
			} else if (max == number) {
				count++;
			} else {
				continue;
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);
		input.close();
	}
}
