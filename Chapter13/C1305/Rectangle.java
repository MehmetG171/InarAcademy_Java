package PackageChapter13;

public class Rectangle extends GeometricObjectComparable {

	double width = 1;
	double height = 1;

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	Rectangle() {
	}

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	public String toString() {
		return super.toString() + "\nWidth --> " + width + "\nHeight --> " + height + "\nArea --> " + getArea()
				+ "\nPerimeter --> " + getPerimeter();
	}

	@Override
	public int compareTo(GeometricObjectComparable o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
