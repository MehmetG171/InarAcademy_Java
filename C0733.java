package PackageChapter07;

import java.util.Scanner;

public class C0733 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a year:");
		int year = input.nextInt();

		String[] months = { "monkey", "rooste", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake",
				"horse", "sheep" };

		System.out.println(months[year % 12]);

		input.close();
	}
}
