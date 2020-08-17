package PackageChapter06;

public class C0614 {

	public static void main(String[] args) {
		double total = 0;
		System.out.println("i         m(i)");
		System.out.println("--------------");
		SumPi(total);
	}

	public static void SumPi(double total) {
		for (double i = 1; i <= 901; i += 100) {
			total = 0;
			for (double j = 1; j <= i; j++) {
				total = total + 4 * (Math.pow(-1, j + 1) / (2 * j - 1));
			}
			System.out.printf("%-4.0f%10.4f\n", i, total);
		}
	}
}
