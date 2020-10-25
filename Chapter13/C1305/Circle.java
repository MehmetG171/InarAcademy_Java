package PackageChapter13;

public class Circle extends GeometricObjectComparable {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
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

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}

	public String toString() {
		return super.toString() + "\nRadius --> " + getRadius() + "\nPerimeter --> "
				+ String.format("%.2f", getPerimeter()) + "\nArea --> " + String.format("%.2f", getArea());
	}

	@Override
	public int compareTo(GeometricObjectComparable o) {
		return 0;
	}
}
