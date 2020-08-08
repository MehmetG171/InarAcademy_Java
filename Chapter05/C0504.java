package PackageChapter05;

public class C0504 {
	public static void main(String[] args) {
		
		int miles = 1;
		System.out.println("Miles    Kilometers");

		while (miles < 11) {
			double kilo = miles * 1.609;
			System.out.printf("%-10d%9.3f\n", miles, kilo);
			miles = miles + 1;
		}
	}
}
