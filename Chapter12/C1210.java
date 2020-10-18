package PackageChapter12;

public class C1210 {

	public static void main(String[] args) {

		try {
			@SuppressWarnings("unused")
			int[] array = new int[1000 * 1000 * 1000];
		} catch (OutOfMemoryError ex) {
			System.out.println("Out of memory");
		}
	}
}
