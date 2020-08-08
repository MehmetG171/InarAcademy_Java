package PackageChapter04;

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class C0407 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Corner point coordinates");
		System.out.println("A pentagon is centered at (0, 0) with one point at the 0 o’clock position.");
		System.out.println("Enter the radius of the bounding circle:");
		double r = input.nextDouble();

		double angle1 = Math.PI / 2 - 2 * Math.PI / 5;
		double angle2 = Math.PI / 2;
		double angle3 = Math.PI / 2 + 2 * Math.PI / 5;
		double angle4 = Math.PI / 2 + 4 * Math.PI / 5;
		double angle5 = Math.PI / 2 + 6 * Math.PI / 5;

		double x1 = r * Math.cos(angle1);
		double y1 = r * Math.sin(angle1);
		double x2 = r * Math.cos(angle2);
		double y2 = r * Math.sin(angle2);
		double x3 = r * Math.cos(angle3);
		double y3 = r * Math.sin(angle3);
		double x4 = r * Math.cos(angle4);
		double y4 = r * Math.sin(angle4);
		double x5 = r * Math.cos(angle5);
		double y5 = r * Math.sin(angle5);

		DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.CEILING);

		System.out.printf("(%.4f, %.4f)\n", x1, y1);
		System.out.printf("(%.4f, %.4f)\n", x2, y2);
		System.out.printf("(%.4f, %.4f)\n", x3, y3);
		System.out.printf("(%.4f, %.4f)\n", x4, y4);
		System.out.printf("(%.4f, %.4f)\n", x5, y5);

		input.close();
	}
}
