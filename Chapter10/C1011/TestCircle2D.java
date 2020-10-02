package PackageChapter10;

public class TestCircle2D {

	public static void main(String[] args) {

		Circle2D c1 = new Circle2D(2, 2, 5.5);

		System.out.println("Circle with center of (" + c1.getX() + ", " + c1.getY() + ") and radius " + c1.getRadius());
		System.out.println("Area: " + c1.getArea());
		System.out.println("Perimeter: " + c1.getPerimeter());
		System.out.println("Does contain point (3,3) ? " + c1.contains(3, 3));
		System.out.println(
				"Does contain circle with center of (4,5) and radius 10.5 ? " + c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(
				"Does overlap circle with center of (3,5) and radius 2.3 ? " + c1.overlaps(new Circle2D(3, 5, 2.3)));

	}
}
