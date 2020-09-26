package PackageChapter09;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle a1 = new Rectangle();
		Rectangle a2 = new Rectangle();

		a1.width = 4;
		a1.height = 10;
		a2.width = 3.5;
		a2.height = 35.9;

		System.out.println("Rectangle1:");
		System.out.println("Width: " + a1.width + "   Height: " + a1.height);
		System.out.printf("Area: %.1f  Perimeter: %.1f\n", a1.getArea(), a1.getPerimeter());

		System.out.println("Rectangle2:");
		System.out.println("Width: " + a2.width + "   Height: " + a2.height);
		System.out.printf("Area: %.2f  Perimeter: %.1f", a2.getArea(), a2.getPerimeter());

	}
}
