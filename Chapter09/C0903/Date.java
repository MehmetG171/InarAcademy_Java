package PackageChapter09;

public class Date {

	public static void main(String[] args) {

		java.util.Date date = new java.util.Date();

		for (long i = 10000; i <= (long) Math.pow(10, 11); i = i * 10) {
			date.setTime(i);
			System.out.println("Date: " + date.toString());
			System.out.println("Elapsed time: " + i + " milliseconds");
		}
	}
}
