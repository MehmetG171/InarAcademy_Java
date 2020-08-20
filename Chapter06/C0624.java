package PackageChapter06;

public class C0624 {

	public static void main(String[] args) {
		long totalMilliseconds = System.currentTimeMillis();

		String time = CurrentTime(totalMilliseconds);
		System.out.println(time);

		String date = CurrentDate(totalMilliseconds);
		System.out.println(date);

	}

	public static String CurrentDate(long totalMilliseconds) {
		long totalseconds = totalMilliseconds / 1000;
		long totalminutes = totalseconds / 60;
		long totalhours = totalminutes / 60;
		long totaldays = totalhours / 24;
		long currentday = totaldays % 30;
		long totalmonths = (int) (totaldays / (365.0 / 12));
		long currentmonth = totalmonths % 12;
		long totalyears = totalmonths / 12;
		long currentyear = 1970 + totalyears;
		String a = currentday + "." + currentmonth + "." + currentyear;
		return a;
	}

	public static String CurrentTime(long totalMilliseconds) {
		long totalseconds = totalMilliseconds / 1000;
		long currentseconds = totalseconds % 60;
		long totalminutes = totalseconds / 60;
		long currentminutes = totalminutes % 60;
		long totalhours = totalminutes / 60;
		long currenthours = totalhours % 24;
		String a = currenthours + ":" + currentminutes + ":" + currentseconds + " GMT";
		return a;
	}
}
