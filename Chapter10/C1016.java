package PackageChapter10;

import java.math.BigInteger;

public class C1016 {

	public static void main(String[] args) {

		String num = "" + 1;
		for (int i = 0; i < 49; i++) {
			num += "0";
		}

		BigInteger bi = new BigInteger(num);
		BigInteger two = new BigInteger(2 + "");
		BigInteger three = new BigInteger(3 + "");

		int count = 0;

		while (count < 10) {
			if (bi.mod(two) == BigInteger.ZERO || bi.mod(three) == BigInteger.ZERO) {
				System.out.println((count + 1) + ". --> " + bi);
				count++;
			}

			bi = bi.add(BigInteger.ONE);
		}
	}
}
