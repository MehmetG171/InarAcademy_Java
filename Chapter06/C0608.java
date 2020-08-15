package PackageChapter06;

public class C0608 {
	public static void main(String[] args) {

		double celsius = 40;
		double calculatedFahrenheit;
		double calculatedCelsius;

		System.out.println("Celsius     Fahrenheit    |      Fahrenheit      Celsius");
		System.out.println("---------------------------------------------------------");

		for (double i = celsius; 30 < i; i--) {
			calculatedFahrenheit = celsiusToFahrenheit(i);
			System.out.printf("%-4.1f%13.1f         |", i, calculatedFahrenheit);

			for (double j = (i - 28) * 10; (i - 28) * 10 <= j; j = j - 10) {
				calculatedCelsius = fahrenheitToCelsius(j);
				System.out.printf("%11.1f%16.2f", j, calculatedCelsius);
			}
			System.out.println("");
		}
	}

	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}
}
