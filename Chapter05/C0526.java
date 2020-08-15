package PackageChapter05;

public class C0526 {

	public static void main(String[] args) {
		double e = 1;
		double factorial = 1;
		double number = 10000;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
			e = e + 1.0 / factorial;
		}
		System.out.println("The value of e is " + e);
		
		double e1 = 1;
		double factorial1 = 1;
		double number1 = 20000;
		for (int j = 1; j <= number1; j++) {
			factorial1 = factorial1 * j;
			e1 = e1 + 1.0 / factorial1;
		}
		System.out.println("The value of e is " + e1);
		
		double e2 = 1;
		double factorial2 = 1;
		double number2 = 100000;
		for (int k = 1; k <= number2; k++) {
			factorial2 = factorial2 * k;
			e2 = e2 + 1.0 / factorial2;
		}
		System.out.println("The value of e is " + e2);
	}
}
