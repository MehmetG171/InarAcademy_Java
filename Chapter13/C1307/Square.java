package PackageChapter13;

public class Square extends GeometricObject implements Colorable {

	private double side = 1;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getArea() {
		return side * side;
	}

	public double getPerimeter() {
		return side * 4;
	}

	Square(double side) {
		this.side = side;
	}

	@Override
	public String howToColor() {
		return "Color all four sides.";
	}
}

interface Colorable {
	String howToColor();
}
