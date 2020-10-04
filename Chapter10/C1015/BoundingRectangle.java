package PackageChapter10;

import java.util.Scanner;

public class BoundingRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter five points: ");

		double[][] points = new double[5][2];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		MyRectangle2D rectangle = getRectangle(points);

		System.out.println("The bounding rectangle's center (" + rectangle.getX() + ", " + rectangle.getY()
				+ "), width " + rectangle.getWidth() + ", height " + rectangle.getHeight());

		input.close();
	}

	public static MyRectangle2D getRectangle(double[][] points) {

		MyRectangle2D rectangle = new MyRectangle2D();

		double minX = Double.MAX_VALUE;
		double maxX = Double.MIN_VALUE;
		double minY = Double.MAX_VALUE;
		double maxY = Double.MIN_VALUE;

		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				if (maxX < points[i][0]) {
					maxX = points[i][0];
				}
				if (maxY < points[i][1]) {
					maxY = points[i][1];
				}
				if (points[i][0] < minX) {
					minX = points[i][0];
				}
				if (points[i][1] < minY) {
					minY = points[i][1];
				}
			}
		}

		rectangle.setWidth(maxX - minX);
		rectangle.setHeight(maxY - minY);
		rectangle.setX((maxX + minX) / 2);
		rectangle.setY((maxY + minY) / 2);

		return rectangle;
	}
}
