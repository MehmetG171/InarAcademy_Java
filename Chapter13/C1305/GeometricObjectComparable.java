package PackageChapter13;

public abstract class GeometricObjectComparable implements Comparable<GeometricObjectComparable> {

	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	protected GeometricObjectComparable() {
		dateCreated = new java.util.Date();
	}

	protected GeometricObjectComparable(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "Date --> " + getDateCreated() + "\nColor --> " + color + "\nFilled? --> " + filled;
	}

	public static int max(GeometricObjectComparable o1, GeometricObjectComparable o2) {
		if (o1.getArea() < o2.getArea()) {
			return 1;
		} else if (o1.getArea() > o2.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
}
