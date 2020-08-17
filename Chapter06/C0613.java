package PackageChapter06;

public class C0613 {
	public static void main(String[] args) {
		double total = 0;
		System.out.println("i         m(i)");
		System.out.println("--------------");
		Sum(total);
	}

	public static void Sum(double total) {
		for (double i = 1; i <= 20; i++) {
			total += i / (i + 1);
			System.out.printf("%-4.0f%10.4f\n", i, total);
		}
	}
}
