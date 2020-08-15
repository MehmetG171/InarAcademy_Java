package PackageChapter05;

public class C0533 {

	public static void main(String[] args) {

		int total;
		for (int i = 2; i <= 10000; i++) {
			total = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					total = total + j;
				}
			}
			if (i == total) {
				System.out.println(i);
			}
		}
	}
}
