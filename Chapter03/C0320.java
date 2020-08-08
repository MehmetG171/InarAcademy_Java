package PackageChapter03;

import java.util.Scanner;

public class C0320 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Science: wind-chill temperature");
		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
		double temperature = input.nextDouble();
		System.out.println("Enter the wind speed (>=2) in miles per hour:");
		double speed = input.nextDouble();

		if ((2 <= speed) && (-58 < temperature) && (temperature < 41)) {

			double index = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16)
					+ 0.4275 * temperature * Math.pow(speed, 0.16);

			System.out.println("The wind chill index is " + index);
			
		} else {
			if ((speed < 2) && (-58 < temperature) && (temperature < 41)) {
				System.out.println("The wind speed is invalid.");
			} else if ((2 <= speed) && (-58 < temperature) && (temperature >= 41)) {
				System.out.println("The temperature is invalid.");
			} else if ((2 <= speed) && (-58 >= temperature) && (temperature < 41)) {
				System.out.println("The temperature is invalid.");
			} else {
				System.out.println("The temperature and wind speed are both invalid.");
			}
		}
		
		input.close();
	}
}
