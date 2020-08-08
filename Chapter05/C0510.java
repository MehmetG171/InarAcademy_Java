package PackageChapter05;

public class C0510 {
	public static void main(String[] args) {

		int count = 1;
		for (int i = 100; i < 1000; i++) {

			if (i % 30 == 0) {
				System.out.print(i + " ");

				if (count % 10 == 0) {
					System.out.println("");
				}
				count++;
			}
		}
	}
}
