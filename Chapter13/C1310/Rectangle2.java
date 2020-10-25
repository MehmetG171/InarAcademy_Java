package PackageChapter13;

public class Rectangle2 extends GeometricObject {

	private double width;
	private double height;

	public Rectangle2() {
	}

	public Rectangle2(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle2(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
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

	public double getArea() {
		return height * width;
	}

	public double getPerimeter() {
		return 2 * (height + width);
	}

	public void printRectangle() {
		System.out.println("Height --> " + height + "\nWidth --> " + width + "\nArea --> " + getArea()
				+ "\nPerimeter --> " + getPerimeter());
	}

	public boolean equals(Object o) {
		if (o instanceof Rectangle2 && getArea() == ((Rectangle2) o).getArea()) {
			return true;
		}
		return false;
	}
}
