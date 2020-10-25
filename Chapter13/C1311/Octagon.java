package PackageChapter13;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {

	private double side = 1;

	public Octagon(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getPerimeter() {
		return 8 * side;
	}

	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	public String toString() {
		return "Side -->  " + side + "\nArea --> " + getArea() + "\nPerimeter --> "
				+ getPerimeter() + "\n";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int compareTo(Octagon o) {
		if (getArea() > o.getArea()) {
			return 1;
		} else if (getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
}
