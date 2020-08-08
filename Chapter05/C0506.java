package PackageChapter05;

public class C0506 {

	public static void main(String[] args) {
		int miles1 = 1;
		int kilometers2 = 20;

		System.out.println("Miles    Kilometers    |    Kilometers       Miles");

		while (miles1 < 11 && kilometers2 < 70) {

			double kilometers1 = miles1 * 1.609;
			double miles2 = kilometers2 / 1.609;

			System.out.printf("%-10d%9.3f    |    %-4d%18.3f\n", miles1, kilometers1, kilometers2, miles2);
			miles1 = miles1 + 1;
			kilometers2 = kilometers2 + 5;
		}
	}
}
