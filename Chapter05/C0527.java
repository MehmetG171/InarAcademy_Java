package PackageChapter05;

public class C0527 {
	public static void main(String[] args) {
		System.out.println("Leap years between 101 and 2100:");
		int count = 0;
		for (int i = 101; i <= 2100; i++) {
			if (i % 4 == 0) {
				count++;
				System.out.printf("%4d ", i);
				if (count % 10 == 0) {
					System.out.println("");
				}
			}
		}
		System.out.println("The number of leap year between 101 and 2100 is " + count);
	}
}
