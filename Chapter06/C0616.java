package PackageChapter06;

public class C0616 {
	public static void main(String[] args) {

		System.out.println("Year     Number Of Days");
		System.out.println("-----------------------");
		for (int i = 2000; i <= 2020; i++) {
			int numberOfDays = numberOfDaysInAYear(i);
			System.out.println(i + "          " + numberOfDays);
		}
	}

	public static int numberOfDaysInAYear(int year) {
		int days = 0;
		if ((year % 4) == 0) {
			days += 366;
		} else {
			days += 365;
		}
		return days;
	}
}
