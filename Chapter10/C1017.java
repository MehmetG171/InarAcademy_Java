package PackageChapter10;

import java.math.BigDecimal;

public class C1017 {

	public static void main(String[] args) {

		BigDecimal a = new BigDecimal((long) Math.sqrt(Long.MAX_VALUE));
		int count = 1;

		while (count <= 10) {
			a = a.add(BigDecimal.ONE);
			System.out.println(count + ". --> " + a.multiply(a));
			count++;
		}
	}
}
