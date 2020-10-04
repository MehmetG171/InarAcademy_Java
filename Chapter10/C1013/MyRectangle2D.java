package PackageChapter10;

public class MyRectangle2D {

	private double x;
	private double y;
	private double width;
	private double height;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	MyRectangle2D() {
		this(0, 0, 1, 1);
	}

	MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	double getArea() {
		return height * width;
	}

	double getPerimeter() {
		return 2 * (height + width);
	}

	private double rUpperLeftx = x - width / 2;
	private double rUpperLefty = y + height / 2;
	private double rUpperRightx = x + width / 2;
	private double rUpperRighty = y + height / 2;
	private double rLowerLeftx = x - width / 2;
	private double rLowerLefty = y - height / 2;
	private double rLowerRightx = x + width / 2;
	private double rLowerRighty = y - height / 2;

	boolean contains(double a, double b) {
		if ((a <= (x + width / 2)) && ((x - width / 2) <= a) && (b <= (y + height / 2)) && ((y - height / 2) <= b)) {
			return true;
		}

		return false;
	}

	boolean contains(MyRectangle2D r) {
		if ((r.rUpperRighty <= rUpperRighty) && (r.rUpperLefty <= rUpperLefty) && (rLowerLefty <= r.rLowerLefty)
				&& (rLowerRighty <= r.rLowerRighty) && (r.rUpperRightx <= rUpperRightx)
				&& (r.rLowerRightx <= rLowerRightx) && (rUpperLeftx <= r.rUpperLeftx)
				&& (rLowerLeftx <= r.rLowerLeftx)) {
			return true;
		}

		return false;
	}

	boolean overlaps(MyRectangle2D r) {
		if (((r.rUpperLefty < rLowerLefty) || (rUpperLefty < r.rLowerLefty) || (rUpperRightx < r.rUpperLeftx)
				|| (r.rUpperRightx < rUpperLeftx))) {
			return false;
		}

		return true;
	}
}
