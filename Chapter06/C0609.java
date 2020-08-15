package PackageChapter06;

public class C0609 {
	public static void main(String[] args) {

		System.out.println("Feet       Meters      |      Meters       Feet");
		System.out.println("-----------------------------------------------");
		double calculatedMeters;
		double calculatedFeet;

		for (double i = 1; i <= 10; i++) {
			calculatedMeters = footToMeter(i);
			System.out.printf("%-4.1f%12.3f       |", i, calculatedMeters);

			for (double j = 15 + 5 * i; j <= 15 + 5 * i; j = j + 5) {
				calculatedFeet = meterToFoot(j);
				System.out.printf("%10.1f%13.3f", j, calculatedFeet);
			}
			System.out.println("");
		}
	}

	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}

	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}
}
