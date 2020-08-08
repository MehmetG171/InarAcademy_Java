package PackageChapter04;

import java.util.Scanner;

public class C0403 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Geography: estimate areas");
		System.out.println("Atlanta, Georgia;  Orlando, Florida;  Savannah, Georgia;  Charlotte, North Carolina");
		double xAtlanta = 33.748995;
		double yAtlanta = -84.387982;
		double xOrlando = 28.538335;
		double yOrlando = -81.379237;
		double xSavannah = 32.080899;
		double ySavannah = -81.091203;
		double xCharlotte = 35.227087;
		double yCharlotte = -80.843127;

		double radiusEarth = 6371.01;

		xAtlanta = Math.toRadians(xAtlanta);
		yAtlanta = Math.toRadians(yAtlanta);

		xOrlando = Math.toRadians(xOrlando);
		yOrlando = Math.toRadians(yOrlando);

		xSavannah = Math.toRadians(xSavannah);
		ySavannah = Math.toRadians(ySavannah);

		xCharlotte = Math.toRadians(xCharlotte);
		yCharlotte = Math.toRadians(yCharlotte);

		double distance1 = radiusEarth * Math.acos(Math.sin(xAtlanta) * Math.sin(xCharlotte)
				+ Math.cos(xAtlanta) * Math.cos(xCharlotte) * Math.cos(yAtlanta - yCharlotte));

		double distance2 = radiusEarth * Math.acos(Math.sin(xAtlanta) * Math.sin(xSavannah)
				+ Math.cos(xAtlanta) * Math.cos(xSavannah) * Math.cos(yAtlanta - ySavannah));

		double distance3 = radiusEarth * Math.acos(Math.sin(xAtlanta) * Math.sin(xOrlando)
				+ Math.cos(xAtlanta) * Math.cos(xOrlando) * Math.cos(yAtlanta - yOrlando));

		double distance4 = radiusEarth * Math.acos(Math.sin(xCharlotte) * Math.sin(xSavannah)
				+ Math.cos(xCharlotte) * Math.cos(xSavannah) * Math.cos(yCharlotte - ySavannah));

		double distance5 = radiusEarth * Math.acos(Math.sin(xSavannah) * Math.sin(xOrlando)
				+ Math.cos(xSavannah) * Math.cos(xOrlando) * Math.cos(ySavannah - yOrlando));

		double perimeter1 = (distance2 + distance3 + distance5) / 2;
		double perimeter2 = (distance1 + distance2 + distance4) / 2;

		double area1 = Math
				.pow(perimeter1 * (perimeter1 - distance2) * (perimeter1 - distance3) * (perimeter1 - distance5), 0.5);
		double area2 = Math
				.pow(perimeter2 * (perimeter2 - distance1) * (perimeter2 - distance2) * (perimeter2 - distance4), 0.5);
		double areaTotal = area1 + area2;

		System.out.println("The estimated area enclosed by these four cities is " + areaTotal + " km2");

		input.close();
	}

}
