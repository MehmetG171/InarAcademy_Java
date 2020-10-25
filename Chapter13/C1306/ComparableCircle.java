package PackageChapter13;

public class ComparableCircle extends GeometricObject implements Comparable<ComparableCircle> {

	private double radius = 1;

	public ComparableCircle(double radius) {
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
		return "Radius --> " + getRadius() + "\nPerimeter --> " + String.format("%.2f", getPerimeter())
				+ "\nArea --> " + String.format("%.2f\n", getArea());
	}

	public int compareTo(ComparableCircle o) {
		if (this.getArea() < o.getArea()) {
			return 1;
		} else if (this.getArea() > o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
}
