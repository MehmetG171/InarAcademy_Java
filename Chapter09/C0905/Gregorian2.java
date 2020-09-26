package PackageChapter09;

import java.util.GregorianCalendar;

public class Gregorian2 {

	public static void main(String[] args) {

		GregorianCalendar Gre = new GregorianCalendar();

		System.out.println("Gregorian Calendar");
		System.out.println("Current Date: " + Gre.get(GregorianCalendar.DAY_OF_MONTH) + "/"
				+ Gre.get(GregorianCalendar.MONTH) + "/" + Gre.get(GregorianCalendar.YEAR));

		Gre.setTimeInMillis(1234567898765L);

		System.out.println("Elapsed time since January 1, 1970: 1234567898765L milliseconds");
		System.out.print("New Date: " + Gre.get(GregorianCalendar.DAY_OF_MONTH) + "/" + Gre.get(GregorianCalendar.MONTH)
				+ "/" + Gre.get(GregorianCalendar.YEAR));
	}
}
