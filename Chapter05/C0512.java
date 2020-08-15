package PackageChapter05;

public class C0512 {
	public static void main(String[] args) {
		int i = 0;

		while (i * i < 12000) {
			i++;
		}
		System.out.println("The smallest integer n such that n^2 is greater than 12000 is " + i);
	}
}
