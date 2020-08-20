package PackageChapter06;

public class C0629 {
	public static void main(String[] args) {
		for (int i = 2; i <= 1000; i++) {
			if (IsPrime(i) && IsPrime(i + 2)) {
				System.out.println("(" + i + ", " + (i + 2) + ")");
			}
		}
	}

	public static boolean IsPrime(int i) {
		boolean isprime = true;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				isprime = false;
			}
		}
		return isprime;
	}
}
