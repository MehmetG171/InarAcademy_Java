package PackageChapter10;

import java.math.BigInteger;

public class C1019 {

	static BigInteger one = new BigInteger(1 + "");
	static BigInteger two = new BigInteger(2 + "");
	static BigInteger hundred = new BigInteger(100 + "");

	public static void main(String[] args) {

		System.out.println("Mersenne prime");

		for (BigInteger j = two; j.compareTo(hundred) <= 0; j = j.add(one)) {
			BigInteger mersenne = getMersenne(j);
			if (isPrime(j) && isPrime(mersenne)) {
				System.out.println("p = " + j + " ---> 2^p – 1 = " + mersenne);
			}
		}
	}

	public static BigInteger getMersenne(BigInteger j) {
		BigInteger mersenne = two;
		for (BigInteger k = one; k.compareTo(j) < 0; k = k.add(one)) {
			mersenne = mersenne.multiply(two);
		}
		return mersenne.subtract(one);
	}

	public static boolean isPrime(BigInteger number) {
		for (BigInteger i = two; i.compareTo(number.divide(two)) == -1; i = i.add(one)) {
			if (number.mod(i) == BigInteger.ZERO) {
				return false;
			}
		}
		return true;
	}
}
