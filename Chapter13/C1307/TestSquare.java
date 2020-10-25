package PackageChapter13;

import PackageChapter12.IllegalTriangleException;

public class TestSquare {

	public static void main(String[] args) throws IllegalTriangleException {

		GeometricObject[] array1 = new GeometricObject[3];
		GeometricObjectComparable[] array2 = new GeometricObjectComparable[2];

		array2[0] = new Rectangle(6, 8);
		array2[1] = new Circle(10);
		array1[0] = new Square(5);
		array1[1] = new Triangle(5, 12, 13);
		array1[2] = new ComparableCircle(7);

		for (int i = 0; i < array2.length; i++) {
			System.out.println((i + 1) + ". object is " + array2[i].getClass().getSimpleName());
			System.out.println("Area --> " + array2[i].getArea());
			if (array2[i] instanceof Colorable) {
				System.out.println("Colored? --> " + ((Colorable) array2[i]).howToColor());
			}
		}

		for (int i = 0; i < array1.length; i++) {
			System.out.println((i + 3) + ". object is " + array1[i].getClass().getSimpleName());
			System.out.println("Area --> " + array1[i].getArea());
			if (array1[i] instanceof Colorable) {
				System.out.println("Colored? --> " + ((Colorable) array1[i]).howToColor());
			}
		}
	}
}
