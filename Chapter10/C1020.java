package PackageChapter10;

import java.math.BigDecimal;

public class C1020 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		BigDecimal hundred = new BigDecimal(100 + "");
		BigDecimal thousand = new BigDecimal(1000 + "");
		BigDecimal one = new BigDecimal(1 + "");

		System.out.println("e = 1 + 1/2! + 1/3! + ... + 1/i!");

		for (BigDecimal j = new BigDecimal(100 + ""); j.compareTo(thousand) != 0; j = j.add(hundred)) {
			BigDecimal e = new BigDecimal(1 + "");
			System.out.print("for i = " + j + " --> e = ");
			for (BigDecimal i = one; i.compareTo(j) <= 0; i = i.add(one)) {
				e = e.add(one.divide(factorial(i), 25, BigDecimal.ROUND_UP));
			}
			System.out.println(e);
		}
	}

	public static BigDecimal factorial(BigDecimal i) {
		for (BigDecimal k = i.subtract(BigDecimal.ONE); k.compareTo(BigDecimal.ONE) >= 1; k = k
				.subtract(BigDecimal.ONE)) {
			i = i.multiply(k);
		}
		return i;
	}
}
