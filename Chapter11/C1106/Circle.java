package PackageChapter11;

public class Circle {

	private double radius;
	private static int numberOfObjects;

	public Circle(double radius) {
		this.radius = radius;
		numberOfObjects++;
	}

	public Circle() {
		numberOfObjects++;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius < 0) {
			this.radius = 0;
		} else {
			this.radius = radius;
		}
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	public double Area() {
		return Math.PI * radius * radius;
	}

	public double Perimeter() {
		return Math.PI * 2 * radius;
	}

	public String toString() {
		return "Radius --> " + getRadius() + "\nPerimeter --> " + String.format("%.2f", Perimeter()) + "\nArea --> "
				+ String.format("%.2f", Area()) + "\nNumber of Objects --> " + getNumberOfObjects();
	}

}
