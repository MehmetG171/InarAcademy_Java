package PackageChapter09;

public class Random {

	public static void main(String[] args) {

		java.util.Random random = new java.util.Random(1000);
		int i = 0;

		while (i < 50) {
			System.out.print(random.nextInt(100) + " ");
			if ((i + 1) % 10 == 0) {
				System.out.println("");
			}
			i++;
		}

	}
}
