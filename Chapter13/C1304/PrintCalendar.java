package PackageChapter13;

import java.util.Scanner;

public class PrintCalendar {
	/** Main method */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter full year (e.g., 2012): ");
		int year = input.nextInt();

		System.out.print("Enter month as a number between 1 and 12: ");
		int month = input.nextInt();

		printMonth(year, month);

		input.close();
	}

	public static void printMonth(int year, int month) {

		printMonthTitle(year, month);

	}

	public static void printMonthTitle(int year, int month) {
		String[] months = getMonthName();
		System.out.println(" " + months[month - 1] + " " + year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}

	public static String[] getMonthName() {
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		return monthName;
	}

}
