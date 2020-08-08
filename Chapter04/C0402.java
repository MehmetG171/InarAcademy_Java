package PackageChapter04;

import java.util.Scanner;

public class C0402 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Geometry: great circle distance");
		System.out.println("(Use negative to indicate south and east degrees.)");
		System.out.println("Enter point 1 (latitude and longitude) in degrees:");
		double latitude1 = input.nextDouble();
		double longitude1 = input.nextDouble();
		System.out.println("Enter point 2 (latitude and longitude) in degrees:");
		double latitude2 = input.nextDouble();
		double longitude2 = input.nextDouble();
		double radiusEarth = 6371.01;

		latitude1 = Math.toRadians(latitude1);
		latitude2 = Math.toRadians(latitude2);
		longitude1 = Math.toRadians(longitude1);
		longitude2 = Math.toRadians(longitude2);

		double distance = radiusEarth * Math.acos(Math.sin(latitude1) * Math.sin(latitude2)
				+ Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2));

		System.out.println("The distance between the two points is " + distance + " km");

		input.close();
	}
}
