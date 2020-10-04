package PackageChapter10;

import java.util.GregorianCalendar;

public class MyDate {

	GregorianCalendar date = new GregorianCalendar();

	private int year;
	private int month;
	private int day;

	MyDate() {
		year = date.get(GregorianCalendar.YEAR);
		month = date.get(GregorianCalendar.MONTH);
		day = date.get(GregorianCalendar.DAY_OF_MONTH);
	}

	MyDate(long elapsed) {
		setDate(elapsed);
	}

	MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	void setDate(long elapsedTime) {
		date.setTimeInMillis(elapsedTime);
		year = date.get(GregorianCalendar.YEAR);
		month = date.get(GregorianCalendar.MONTH);
		day = date.get(GregorianCalendar.DAY_OF_MONTH);
	}
}
