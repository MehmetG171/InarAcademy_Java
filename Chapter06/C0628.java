package PackageChapter06;

public class C0628 {
	public static void main(String[] args) {
		System.out.println("p         2^p-1");
		System.out.println("----------------");
		for (int i = 2; i <= 31; i++) {
			if (IsPrime(MarsennePrime(i))) {
				System.out.printf("%-4d\t  %-5d\n", i, MarsennePrime(i));
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

	public static int MarsennePrime(int i) {
		return (int) Math.pow(2, i) - 1;
	}
}
