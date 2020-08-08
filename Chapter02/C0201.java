package PackageChapter02;

import java.util.Scanner;

public class C0201 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Celsius into Fahrenheit Conversion.");
		System.out.println("Please enter Celsius value :");
		double celsius = input.nextDouble();
		double fahrenheit = (9.0 / 5) * celsius + 32.0;

		System.out.println(celsius + " C = " + fahrenheit + " F ");

		input.close();
	}
}
