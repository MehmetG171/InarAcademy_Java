package PackageChapter05;

public class C0523 {
	public static void main(String[] args) {
		double number = 50000;
		double total = 0;
		for (double i = 1; i <= number; i++) {
			total = total + 1 / i;
		}
		System.out.println(total);

		double number1 = 50000;
		double total1 = 0;
		for (double j = number1; 1 <= j; j--) {
			total1 = total1 + 1 / j;
		}
		System.out.println(total1);
	}
}
