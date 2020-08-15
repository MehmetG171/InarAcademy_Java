package PackageChapter05;

public class C0518 {

	public static void main(String[] args) {

		System.out.println("Pattern A");

		for (int i = 1; i < 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

		System.out.println("");
		System.out.println("Pattern B");

		for (int a = 6; 0 < a; a--) {
			for (int b = 1; b <= a; b++) {
				System.out.print(b + " ");
			}
			System.out.println("");
		}

		System.out.println("");
		System.out.println("Pattern C");

		for (int m = 1; m < 7; m++) {
			for (int k = 1; k < 7 - m; k++) {
				System.out.print("  ");
			}
			for (int n = m; 1 <= n; n--) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		System.out.println("");
		System.out.println("Pattern D");

		for (int x = 6; 0 < x; x--) {
			for (int y = 1; y <= 6 - x; y++) {
				System.out.print("  ");
			}
			for (int z = 1; z <= x; z++) {
				System.out.print(z + " ");
			}
			System.out.println("");
		}
	}
}
