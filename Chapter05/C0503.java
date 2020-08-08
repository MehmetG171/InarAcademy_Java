package PackageChapter05;

public class C0503 {
	public static void main(String[] args) {

		int kilo = 1;
		System.out.println("Kilograms    Pounds");

		while (kilo < 200) {
			double pounds = kilo * 2.2;
			System.out.printf("%-10d%9.1f\n", kilo, pounds);
			kilo = kilo + 2;
		}
	}
}
