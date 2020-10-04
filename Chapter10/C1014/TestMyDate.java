package PackageChapter10;

public class TestMyDate {

	public static void main(String[] args) {

		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate(34355555133101L);
		
		System.out.println("Current Date:");
		System.out.println(date1.getDay() + "/" + date1.getMonth() + "/" + date1.getYear());
		System.out.println("Date with respect to 34355555133101L ms:");
		System.out.println(date2.getDay() + "/" + date2.getMonth() + "/" + date2.getYear());
	}
}
