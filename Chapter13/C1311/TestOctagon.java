package PackageChapter13;

public class TestOctagon {

	public static void main(String[] args) throws CloneNotSupportedException {

		Octagon o1 = new Octagon(10);
		Octagon o2 = (Octagon) o1.clone();

		System.out.println("Octagon1");
		System.out.println(o1.toString());
		System.out.println("Octagon2");
		System.out.println(o2.toString());

		if (o1.compareTo(o2) == 1) {
			System.out.println("Octagon2 is larger than Octagon1.");
		} else if (o1.compareTo(o2) == -1) {
			System.out.println("Octagon1 is larger than Octagon2.");
		} else {
			System.out.println("Octagon2 and Octagon1 are equal.");
		}
	}
}
