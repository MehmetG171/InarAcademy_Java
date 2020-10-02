package PackageChapter10;

public class Circle2D {

	private double x;
	private double y;
	private double radius = 1;

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

	double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	boolean contains(double a, double b) {
		double distance = Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2));

		if (distance <= radius) {
			return true;
		}

		return false;
	}

	boolean contains(Circle2D circle) {
		double distance = (Math.pow(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2), 0.5));

		if (distance <= Math.abs(circle.getRadius() - radius)) {
			return true;
		}

		return false;
	}

	boolean overlaps(Circle2D circle) {
		double distance = Math.pow(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2), 0.5);

		if (distance <= (circle.getRadius() + radius)) {
			return true;
		}

		return false;
	}
}
