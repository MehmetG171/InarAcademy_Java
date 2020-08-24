package PackageChapter06;

public class C0633 {

	public static void main(String[] args) {
		long millis = System.currentTimeMillis();

		String a = DisplayTime(millis);
		String b = DisplayDate(millis);

		System.out.println("Current time is " + a);
		System.out.println("Current date is " + b);

	}

	public static String DisplayTime(long millis) {
		long totalseconds = millis / 1000;
		long currentseconds = totalseconds % 60;
		long totalminutes = totalseconds / 60;
		long currentminutes = totalminutes % 60;
		long totalhours = totalminutes / 60;
		long currenthours = totalhours % 24;
		String time = currenthours + ":" + currentminutes + ":" + currentseconds + " GMT";
		return time;
	}

	public static String DisplayDate(long millis) {
		long totalseconds = millis / 1000;
		long totalminutes = totalseconds / 60;
		long totalhours = totalminutes / 60;
		long totaldays = totalhours / 24;
		int year = 1969;
		String b = "";

		while (totaldays > 0) {
			if (isLeapYear(year)) {
				totaldays = totaldays - 366;
				year++;
			} else {
				totaldays = totaldays - 365;
				year++;
			}
		}
		totaldays = totaldays + 365;

		for (int month = 1; month < 13; month++) {
			if (totaldays > 0) {
				if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
					totaldays = totaldays - 31;
				}
				if (month == 4 || month == 6 || month == 9 || month == 11) {
					totaldays = totaldays - 30;
				}
				if (month == 2) {
					if (isLeapYear(year)) {
						totaldays = totaldays - 29;
					} else {
						totaldays = totaldays - 28;
					}
				}
			} else {
				if (month - 1 == 1 || month - 1 == 3 || month - 1 == 5 || month - 1 == 7 || month - 1 == 8
						|| month - 1 == 10 || month - 1 == 12) {
					totaldays = totaldays + 31;
					b = (totaldays + 1) + "." + (month - 1) + "." + year;
					return b;
				}
				if (month - 1 == 4 || month - 1 == 6 || month - 1 == 9 || month - 1 == 11) {
					totaldays = totaldays + 30;
					b = (totaldays + 1) + "." + (month - 1) + "." + year;
					return b;
				}
				if (month - 1 == 2) {
					if (isLeapYear(year)) {
						totaldays = totaldays + 29;
					} else {
						totaldays = totaldays + 28;
					}
					b = (totaldays + 1) + "." + (month - 1) + "." + year;
					return b;
				}
			}
		}
		return null;
	}

	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}
