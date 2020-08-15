package PackageChapter05;

import java.util.Scanner;

public class C0528 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the year:");
		int year = input.nextInt();
		System.out.println("Enter first day of the year:");
		int day = input.nextInt();

		String Month = "";
		String nameOfDay = "";

		for (int month = 1; month <= 12; month++) {
			nameOfDay = Nameofday(day);

			if (month == 2) {
				Month = monthname(month);
				System.out.println(Month + " 1, " + year + " is " + nameOfDay);

				if (year % 4 == 0) {
					day = day + 29;
				} else {
					day = day + 28;
				}
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				Month = monthname(month);
				System.out.println(Month + " 1, " + year + " is " + nameOfDay);
				day = day + 30;
			} else {
				Month = monthname(month);
				System.out.println(Month + " 1, " + year + " is " + nameOfDay);
				day = day + 31;
			}
		}
		input.close();
	}

	public static String monthname(int month) {
		String name = "";
		switch (month) {
		case 1:
			name = name + "January";
			break;
		case 2:
			name = name + "February";
			break;
		case 3:
			name = name + "March";
			break;
		case 4:
			name = name + "April";
			break;
		case 5:
			name = name + "May";
			break;
		case 6:
			name = name + "June";
			break;
		case 7:
			name = name + "July";
			break;
		case 8:
			name = name + "August";
			break;
		case 9:
			name = name + "September";
			break;
		case 10:
			name = name + "October";
			break;
		case 11:
			name = name + "Novermber";
			break;
		case 12:
			name = name + "December";
			break;
		default:
		}
		return name;
	}

	public static String Nameofday(int day) {
		int remain = day % 7;
		String NameOfDay = "";
		switch (remain) {
		case 0:
			NameOfDay = NameOfDay + "Sunday";
			break;
		case 1:
			NameOfDay = NameOfDay + "Monday";
			break;
		case 2:
			NameOfDay = NameOfDay + "Tuesday";
			break;
		case 3:
			NameOfDay = NameOfDay + "Wednesday";
			break;
		case 4:
			NameOfDay = NameOfDay + "Thursday";
			break;
		case 5:
			NameOfDay = NameOfDay + "Friday";
			break;
		case 6:
			NameOfDay = NameOfDay + "Saturday";
			break;
		default:
		}
		return NameOfDay;
	}
}
