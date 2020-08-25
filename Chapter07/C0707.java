package PackageChapter07;

public class C0707 {

	public static void main(String[] args) {

		System.out.println("Count random single digits");
		System.out.println("");
		int[] numbers = new int[100];
		int[] digits = new int[10];

		for (int i = 0; i < 100; i++) {
			numbers[i] = (int) (Math.random() * 10);
		}
		for (int i = 0; i < 100; i++) {
			System.out.print(numbers[i] + "  ");
			if ((i + 1) % 10 == 0) {
				System.out.println("");
			}
		}
		System.out.println("");
		for (int j = 0; j < 100; j++) {
			digits[numbers[j] % 10]++;
		}
		for (int k = 0; k < 10; k++) {
			System.out.println("'" + k + "' occured " + digits[k] + " time(s).");
		}
	}
}
