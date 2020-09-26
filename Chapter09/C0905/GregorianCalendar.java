package PackageChapter09;

import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

public class GregorianCalendar {

	public static void main(String[] args) {

		java.util.GregorianCalendar Gregorian = new java.util.GregorianCalendar();

		System.out.println("Gregorian Calendar");
		System.out.println("Current date: " + Gregorian.get(DAY_OF_MONTH) + "." + Gregorian.get(MONTH) + "."
				+ Gregorian.get(YEAR));

		Gregorian.setTimeInMillis(1234567898765L);

		System.out.println("Elapsed time since January 1, 1970: 1234567898765L milliseconds");
		System.out.println(
				"New date: " + Gregorian.get(DAY_OF_MONTH) + "." + Gregorian.get(MONTH) + "." + Gregorian.get(YEAR));
	}
}
