package PackageChapter07;

public class C0706 {

	public static void main(String[] args) {

		int[] prime = new int[50];
		int a = 0;
		for (int i = 2; a < 50; i++) {
			if (isPrime(i)) {
				prime[a] = i;
				a++;
			}
		}
		a = a - 1;

		for (int j = 0; j < prime.length; j++) {
			System.out.printf("%4d  ", prime[j]);
			if ((j + 1) % 10 == 0) {
				System.out.println("");
			}
		}
	}

	public static boolean isPrime(int i) {
		for (int divisor = 2; divisor <= (int) Math.sqrt(i); divisor++) {
			if (i % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}
