package PackageChapter10;

public class TestMyPoint {

	public static void main(String[] args) {

		MyPoint my1 = new MyPoint();
		MyPoint my2 = new MyPoint(10, 30.5);

		System.out.println("The distance between (" + my1.getX() + ", " + my1.getY() + ") and (" + my2.getX() + ", "
				+ my2.getY() + ") is: " + my1.distance(my2));
	}
}
