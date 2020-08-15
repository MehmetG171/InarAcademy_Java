package PackageChapter05;

public class C0535 {

	public static void main(String[] args) {
		System.out.println("Summation");
		double total = 0;
		for (double i = 1; i <= 624; i++) {
			total = total + 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
		}
		System.out.println(total);
	}
}
