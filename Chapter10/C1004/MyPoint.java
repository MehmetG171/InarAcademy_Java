package PackageChapter10;

public class MyPoint {

	private double x;
	private double y;

	MyPoint() {
		this(0, 0);
	}

	MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	double distance(double a, double b) {
		return Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2));
	}

	public double distance(MyPoint myPoint) {
		return Math.sqrt(Math.pow(myPoint.getX() - x, 2) + Math.pow(myPoint.getY() - y, 2));
	}
}
