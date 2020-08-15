package PackageChapter05;

public class C0525 {
	public static void main(String[] args) {
		double pi = 0;
		double number = 10000;
		for (double i = 1; i <= number; i++) {
			pi = pi + Math.pow(-1, i + 1) / (2 * i - 1);
		}
		pi = 4 * pi;
		System.out.println("The value of pi is " + pi);

		double pi1 = 0;
		double number1 = 20000;
		for (double j = 1; j <= number1; j++) {
			pi1 = pi1 + Math.pow(-1, j + 1) / (2 * j - 1);
		}
		pi1 = 4 * pi1;
		System.out.println("The value of pi is " + pi1);

		double pi2 = 0;
		double number2 = 100000;
		for (double k = 1; k <= number2; k++) {
			pi2 = pi2 + Math.pow(-1, k + 1) / (2 * k - 1);
		}
		pi2 = 4 * pi2;
		System.out.println("The value of pi is " + pi2);
	}
}
