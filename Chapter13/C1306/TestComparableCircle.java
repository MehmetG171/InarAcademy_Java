package PackageChapter13;

public class TestComparableCircle {

	public static void main(String[] args) {

		ComparableCircle c1 = new ComparableCircle(10);
		ComparableCircle c2 = new ComparableCircle(12.5);

		System.out.println("Circle1");
		System.out.println(c1);
		System.out.println("Circle2");
		System.out.println(c2);

		if (c1.compareTo(c2) == 1) {
			System.out.println("Circle2 is larger than Circle1.");
		} else if (c1.compareTo(c2) == -1) {
			System.out.println("Circle1 is larger than Circle2.");
		} else {
			System.out.println("Circle2 and Circle1 are equal.");
		}

	}
}
