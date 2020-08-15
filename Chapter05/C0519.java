package PackageChapter05;

public class C0519 {

	public static void main(String[] args) {

		for (int m = 0; m < 8; m++) {
			for (int k = 1; k < 8 - m; k++) {
				System.out.print("    ");
			}
			for (int n = 0; n <= m; n++) {
				System.out.printf("%3.0f ", Math.pow(2, n));

			}
			for (int j = m - 1; 0 <= j; j--) {
				System.out.printf("%3.0f ", Math.pow(2, j));
			}
			System.out.println();
		}
	}
}
