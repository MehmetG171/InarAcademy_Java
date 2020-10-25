package PackageChapter13;

public class TestGeoObjComparable {

	public static void main(String[] args) {

		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);

		c1.setColor("Blue");
		c1.setFilled(true);

		c2.setColor("White");
		c2.setFilled(false);

		System.out.println("Circle1");
		System.out.println(c1.toString() + "\n");
		System.out.println("Circle2");
		System.out.println(c2.toString() + "\n");

		if (Circle.max(c1, c2) == 1) {
			System.out.println("Circle2 is larger");
		} else if (Circle.max(c1, c2) == -1) {
			System.out.println("Circle1 is larger");
		} else {
			System.out.println("Circles are equal");
		}
		System.out.println();

		Rectangle r1 = new Rectangle(4, 6);
		Rectangle r2 = new Rectangle(4, 5);

		r1.setColor("Red");
		r2.setColor("Orange");

		r1.setFilled(true);
		r2.setFilled(true);

		System.out.println("Rectangle1");
		System.out.println(r1.toString() + "\n");
		System.out.println("Rectangle2 ");
		System.out.println(r2.toString() + "\n");

		if (Rectangle.max(r1, r2) == 1) {
			System.out.println("Rectangle2 is larger");
		} else if (Rectangle.max(r1, r2) == -1) {
			System.out.println("Rectangle1 is larger");
		} else {
			System.out.println("Rectangles are equal");
		}
	}
}
