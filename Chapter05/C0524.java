package PackageChapter05;

public class C0524 {
	public static void main(String[] args) {
		double a = 0;
		double i = 1;
		while (i <= 97) {
			a = a + i / (i + 2);
			i = i + 2;
		}
		System.out.println(a);
	}
}
