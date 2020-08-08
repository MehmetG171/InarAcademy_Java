package PackageChapter03;

import java.util.Scanner;

public class C0321 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: (e.g., 2012):");
		int year = input.nextInt();
		System.out.println("Enter month: 1-12:");
		int month = input.nextInt();
		System.out.println("Enter the day of the month: 1-31:");
		int day = input.nextInt();

		int dayOfTheWeek;

		if (month == 1 || month == 2) {
			month = month + 12;
			year = year - 1;

			dayOfTheWeek = (int) ((day + (26 * (month + 1)) / 10 + (year % 100) + (year % 100) / 4 + (year / 100) / 4
					+ 5 * (year / 100)) % 7);
		} else {
			dayOfTheWeek = (int) ((day + (26 * (month + 1)) / 10 + (year % 100) + (year % 100) / 4 + (year / 100) / 4
					+ 5 * (year / 100)) % 7);
		}

		switch (dayOfTheWeek) {
		case 0:
			System.out.println("The day of the week is Saturday.");
			break;
		case 1:
			System.out.println("The day of the week is Sunday.");
			break;
		case 2:
			System.out.println("The day of the week is Monday.");
			break;
		case 3:
			System.out.println("The day of the week is Tuesday.");
			break;
		case 4:
			System.out.println("The day of the week is Wednesday.");
			break;
		case 5:
			System.out.println("The day of the week is Thursday.");
			break;
		case 6:
			System.out.println("The day of the week is Friday.");
			break;

		default:

		}

		input.close();

	}

}
