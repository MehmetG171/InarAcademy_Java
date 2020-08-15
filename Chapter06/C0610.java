package PackageChapter06;

public class C0610 {
	public static void main(String[] args) {

		int count = 0;
		for (int i = 2; i <= 10000; i++) {
			if (isPrime(i)) {
				count++;
				System.out.printf("%-5d  ", i);
				if (count % 10 == 0) {
					System.out.println("");
				}
			}
		}
		System.out.println("");
		System.out.println("The number of prime numbers less than 10000 is " + count);
	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true; // Number is prime
	}
}