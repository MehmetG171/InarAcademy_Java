package PackageChapter10;

import java.math.BigInteger;

public class C1021 {

	public static void main(String[] args) {

		BigInteger bi = new BigInteger(Long.MAX_VALUE + "");
		BigInteger five = new BigInteger(5 + "");
		BigInteger six = new BigInteger(6 + "");

		int count = 0;

		while (count < 10) {
			if (bi.mod(five) == BigInteger.ZERO || bi.mod(six) == BigInteger.ZERO) {
				System.out.println((count + 1) + ". --> " + bi);
				count++;
			}

			bi = bi.add(BigInteger.ONE);
		}
	}
}
