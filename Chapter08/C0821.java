package PackageChapter08;

import java.util.Scanner;

public class C0821 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of cities:");
		int numberOfCities = input.nextInt();

		double[][] a = new double[numberOfCities][2];

		System.out.println("Enter the coordinates of the cities:");

		for (int i = 0; i < numberOfCities; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = input.nextDouble();
			}
		}

		double shortestDistance = Double.MAX_VALUE;
		int centralIndex = 0;

		for (int i = 0; i < a.length; i++) {
			double distance = calculateDistance(a[i][0], a[i][1], a);
			if (distance < shortestDistance) {
				shortestDistance = distance;
				centralIndex = i;
			}
		}

		System.out.println("The central city is at (" + a[centralIndex][0] + ", " + a[centralIndex][1] + ")");
		System.out.printf("The total distance to all other cities is %.2f", shortestDistance / 2);

		input.close();
	}

	public static double calculateDistance(double d, double e, double[][] a) {
		double distance = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				distance = distance + Math.sqrt((d - a[i][0]) * (d - a[i][0]) + (e - a[i][1]) * (e - a[i][1]));
			}
		}
		return distance;
	}
}