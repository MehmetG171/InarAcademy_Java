package PackageChapter06;

public class C0601 {
	public static void main(String[] args) {

		System.out.println("Math: pentagonal numbers");

		for (int i = 1; i < 101; i++) {
			int pentagonalValue = getPentagonalNumber(i);
			System.out.printf("%7d ", pentagonalValue);
			if (i % 10 == 0) {
				System.out.println("");
			}
		}
	}

	public static int getPentagonalNumber(int n) {
		return n * (3 * n - 1) / 2;
	}
}
