package PackageChapter13;

public class TestRectangle2 {

	public static void main(String[] args) {

		Rectangle2 r1 = new Rectangle2(10, 10);
		Rectangle2 r2 = new Rectangle2(10, 8);

		System.out.println("Rectangle1");
		r1.printRectangle();
		System.out.println("Rectangle2");
		r2.printRectangle();

		System.out.println("Are Rectangle1 and Rectangle2 equal? --> " + r1.equals(r2));
	}
}
