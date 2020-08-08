package PackageChapter05;

public class C0513 {
	public static void main(String[] args) {
		int i = 0;

		while (i * i * i < 12000) {
			i++;
		}
		System.out.println("The largest integer n such that n^3 is less than 12000 is " + (i - 1));
	}
}
