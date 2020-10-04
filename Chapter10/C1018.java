package PackageChapter10;

import java.math.BigInteger;

public class C1018 {

	public static void main(String[] args) {

		BigInteger number = new BigInteger(Long.MAX_VALUE + "");
		int count = 1;

		while (count <= 5) {
			if (isPrime(number)) {
				System.out.println(number);
				count++;
			}

			number = number.add(BigInteger.ONE);
		}
	}

	public static boolean isPrime(BigInteger number) {
		for (BigInteger i = new BigInteger(2 + ""); i.compareTo(number.divide(new BigInteger(2 + ""))) == -1; i = i
				.add(BigInteger.ONE)) {
			if (number.mod(i) == BigInteger.ZERO) {
				return false;
			}
		}

		return true;
	}
}
