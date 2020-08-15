package PackageChapter05;

public class C0505 {
	public static void main(String[] args) {

		int kilos1 = 1;
		int pounds2 = 20;

		System.out.println("Kilograms    Pounds    |    Pounds      Kilograms");

		while (kilos1 < 200 && pounds2 < 520) {

			double pounds1 = kilos1 * 2.2;
			double kilos2 = pounds2 / 2.2;

			System.out.printf("%-10d%9.1f    |    %-4d%17.2f\n", kilos1, pounds1, pounds2, kilos2);
			kilos1 = kilos1 + 2;
			pounds2 = pounds2 + 5;
		}
	}
}
