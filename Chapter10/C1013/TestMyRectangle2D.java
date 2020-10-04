package PackageChapter10;

public class TestMyRectangle2D {

	public static void main(String[] args) {

		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);

		System.out.println("Center of rectangle: (" + r1.getX() + ", " + r1.getY() + ")");
		System.out.println("Width = " + r1.getWidth() + "  Height = " + r1.getHeight());
		System.out.println("Area = " + r1.getArea() + "  Perimeter = " + r1.getPerimeter());
		System.out.println("Does contain point (3,3) ? " + r1.contains(3, 3));
		System.out.println("Does contain rectangle with center of (4,5), Width = 10.5 and Height = 3.2 ? "
				+ r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		System.out.println("Does overlap circle with center of (3,5), Width = 2.3 and Height = 5.4 ? "
				+ r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
	}
}
