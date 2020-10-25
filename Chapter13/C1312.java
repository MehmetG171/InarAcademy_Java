package PackageChapter13;

public class C1312 {

	public static void main(String[] args) {

		GeometricObject[] array = new GeometricObject[4];
		array[0] = new Circle2(5);
		array[1] = new Circle2(10);
		array[2] = new Rectangle2(6, 8);
		array[3] = new Rectangle2(5, 7);

		System.out.println("The sum of areas four objects is " + sumArea(array));
	}

	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i].getArea();
		}
		return sum;
	}
}
